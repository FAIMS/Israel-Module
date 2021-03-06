#!/usr/bin/env bash

# Archives the stuff in the data directory (which is in the same dir as
# module.xml). The archive gets placed at module/data.tar.gz.
cd data
tar -cvzf ../module/data.tar.gz *
cd ..

# Start working on our module definition files...
cd module

# In the ui_schema.xml, replace the "Entity Types" dropdown menu with an
# "Entity Types" dropdown, a "Select User" dropdown, and a "Select Square"
# dropdown. These new three dropdowns will appear in columns because of our use
# of the `<group>` element and `faims_style` attribute. (Check the FAIMS
# cookbook for more info.)
string="
        <select1 ref=\"Entity_Types\">
          <label>{Entity_Types}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Entity_Types\">
              <label>{Entity_Types}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_User\">
              <label>{Select_User}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_2\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Square\">
              <label>{Select_Square}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

# The UI schema requires that we also define the dropdowns in its <model> tags.
string="
              <Entity_Types\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Entity_Types\/>
                <\/Col_0>
                <Col_1>
                  <Select_User\/>
                <\/Col_1>
                <Col_2>
                  <Select_Square\/>
                <\/Col_2>
              <\/Colgroup_1>
              <Select_User\/>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

# Change Orientation Degree's blank checker into a range checker. The validation
# schema only affects server-side validation. Client-side validation still must
# be done using UI_logic.bsh.
string="
    <property name=\"Orientation Degree\">
      <validator type=\"blankchecker\">
        <param type=\"field\" value=\"measure\"\/>
      <\/validator>
    <\/property>"
replacement="
    <property name=\"Orientation Degree\">
      <validator type=\"querychecker\">
        <query><![CDATA[select coalesce(?,'') between 0 and 90, 'Orientation Degree must be between 0.0 and 90.0']]><\/query>
        <param type=\"field\" value=\"measure\" \/>
      <\/validator>
    <\/property>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" validation.xml

# Add entries to the arch16n file. This includes new entries for the "Select
# User" and "Select Square" dropdowns.
cat << EOF >> english.0.properties
Select_User=Select User
Select_Site=Select Site
Select_Square=Select Square
Volume_Liters=Volume (Liters)
Must_be_between_0_0_and_90_0=(Must be between 0.0 and 90.0)
Cannot_Log_in=Cannot Log in
You_must_select_a_user_to_log_in=You must select a user to log in.
site_already_exists_head=Site Already Exists
site_already_exists_body=A site having this name and campaign year already exists. Tap 'OK' to change the 'New Site Name' and 'Year of Campaign' fields, or 'Cancel' to dismiss this message and create a new Site anyway.
square_already_exists_head=Square Already Exists
square_already_exists_body=A square having this square ID already exists. Tap 'OK' to change the 'Square ID' field, or 'Cancel' to dismiss this  message and create a new Square anyway.
proceed_to_date_picker_head=Proceed To Date Picker?
proceed_to_date_picker_body=Have you established the closing date? If not, press 'Cancel' and return. If yes, press 'OK' and select date from date picker. Once selected, 'Date Closed' can only be edited but not blanked.
square_id_required_head=Square ID Required
square_id_required_body=Searching requires that the Square ID field is filled in.
logic_error_head=Logic Error
logic_error_body=Something happened which never should.
no_locus_selected=No Locus selected
no_relationship_selected=No relationship selected
soil_texture_no_match=Match not found. You shouldn't see this, but select the result manually.
no_user_selected_head=No User Selected
no_user_selected_body=A user must be selected in order to log in.
no_device_code_selected_head=No Device Code Selected
no_device_code_selected_body=A device code must be selected in order to log in.

arbitrarily_separated_from=Arbitrarily separated from
bonded_to=Bonded to
broadly_contemporary_with=Broadly contemporary with
butted_by=Butted by
butts=Butts
covered_by=Covered by
covers=Covers
cut_by=Cut by
cuts=Cuts
earlierlater=EarlierLater
filled_with=Filled with
fill_of=Fill of
immediately_earlier_than=Immediately Earlier Than
immediately_later_than=Immediately Later Than
includes=includes
is_included_in=is included in
precisely_contemporary_with=Precisely Contemporary with
invalid_square_id_head=Invalid Square ID
invalid_square_id_body=The given Square ID is not valid. Valid Square IDs consist of a capital 'T' followed by one or more digits.
valid_control_head=Invalid Field(s) Found
valid_control_body_1=The following fields are invalid:\n
valid_control_body_2=You must enter data into these fields to proceed.
invalid_square_id_body=Tap 'Cancel' to change the 'Square ID' field, or 'OK' to proceed.
EOF

# Perl created backup files when we modified the UI schema and validation
# schema. They're not needed any more.
rm ui_schema.xml.original
rm validation.xml.original
