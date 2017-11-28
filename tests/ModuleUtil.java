package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Date_Closed
     */
    public static View get_DateClosed(Solo solo) {
        String ref = "Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Diary
     */
    public static View get_Diary(Solo solo) {
        String ref = "Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Legacy
     */
    public static View get_Legacy(Solo solo) {
        String ref = "Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Locus
     */
    public static View get_Locus(Solo solo) {
        String ref = "Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Phase
     */
    public static View get_Phase(Solo solo) {
        String ref = "Phase";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Phase_Relationship
     */
    public static View get_PhaseRelationship(Solo solo) {
        String ref = "Phase_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Photograph_Log
     */
    public static View get_PhotographLog(Solo solo) {
        String ref = "Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Pottery_Basket
     */
    public static View get_PotteryBasket(Solo solo) {
        String ref = "Pottery_Basket";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Relationship
     */
    public static View get_Relationship(Solo solo) {
        String ref = "Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Sediment_Aggregate
     */
    public static View get_SedimentAggregate(Solo solo) {
        String ref = "Sediment_Aggregate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Soil_Munsel_Color
     */
    public static View get_SoilMunselColor(Solo solo) {
        String ref = "Soil_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Square
     */
    public static View get_Square(Solo solo) {
        String ref = "Square";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Square_Files
     */
    public static View get_SquareFiles(Solo solo) {
        String ref = "Square_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User
     */
    public static View get_User(Solo solo) {
        String ref = "User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Next_IDs
     */
    public static View get_Control_NextIDs(Solo solo) {
        String ref = "Control/Next_IDs";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Site
     */
    public static View get_Control_Site(Solo solo) {
        String ref = "Control/Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Date_Closed/Date_Closed
     */
    public static View get_DateClosed_DateClosed(Solo solo) {
        String ref = "Date_Closed/Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Diary/Diary
     */
    public static View get_Diary_Diary(Solo solo) {
        String ref = "Diary/Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Diary/Vars
     */
    public static View get_Diary_Vars(Solo solo) {
        String ref = "Diary/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Legacy/Legacy
     */
    public static View get_Legacy_Legacy(Solo solo) {
        String ref = "Legacy/Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Legacy/Var
     */
    public static View get_Legacy_Var(Solo solo) {
        String ref = "Legacy/Var";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Add
     */
    public static View get_Locus_Add(Solo solo) {
        String ref = "Locus/Add";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Construction
     */
    public static View get_Locus_Construction(Solo solo) {
        String ref = "Locus/Construction";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Cut
     */
    public static View get_Locus_Cut(Solo solo) {
        String ref = "Locus/Cut";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Deposit
     */
    public static View get_Locus_Deposit(Solo solo) {
        String ref = "Locus/Deposit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/General
     */
    public static View get_Locus_General(Solo solo) {
        String ref = "Locus/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Int
     */
    public static View get_Locus_Int(Solo solo) {
        String ref = "Locus/Int";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Material_Helper
     */
    public static View get_Locus_MaterialHelper(Solo solo) {
        String ref = "Locus/Material_Helper";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Measure
     */
    public static View get_Locus_Measure(Solo solo) {
        String ref = "Locus/Measure";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Pottery_Baskets
     */
    public static View get_Locus_PotteryBaskets(Solo solo) {
        String ref = "Locus/Pottery_Baskets";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Relationships
     */
    public static View get_Locus_Relationships(Solo solo) {
        String ref = "Locus/Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Skeleton
     */
    public static View get_Locus_Skeleton(Solo solo) {
        String ref = "Locus/Skeleton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Surface
     */
    public static View get_Locus_Surface(Solo solo) {
        String ref = "Locus/Surface";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Vars
     */
    public static View get_Locus_Vars(Solo solo) {
        String ref = "Locus/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Phase/Add
     */
    public static View get_Phase_Add(Solo solo) {
        String ref = "Phase/Add";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Phase/General
     */
    public static View get_Phase_General(Solo solo) {
        String ref = "Phase/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Phase/Phase_Loci
     */
    public static View get_Phase_PhaseLoci(Solo solo) {
        String ref = "Phase/Phase_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Phase/Vars
     */
    public static View get_Phase_Vars(Solo solo) {
        String ref = "Phase/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Phase_Relationship/Legacies
     */
    public static View get_PhaseRelationship_Legacies(Solo solo) {
        String ref = "Phase_Relationship/Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Phase_Relationship/Relationships
     */
    public static View get_PhaseRelationship_Relationships(Solo solo) {
        String ref = "Phase_Relationship/Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Photograph_Log/Photograph_Log
     */
    public static View get_PhotographLog_PhotographLog(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Photograph_Log/Vars
     */
    public static View get_PhotographLog_Vars(Solo solo) {
        String ref = "Photograph_Log/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Pottery_Basket/General
     */
    public static View get_PotteryBasket_General(Solo solo) {
        String ref = "Pottery_Basket/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Pottery_Basket/Vars
     */
    public static View get_PotteryBasket_Vars(Solo solo) {
        String ref = "Pottery_Basket/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Relationship/Legacies
     */
    public static View get_Relationship_Legacies(Solo solo) {
        String ref = "Relationship/Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Relationship/Relationships
     */
    public static View get_Relationship_Relationships(Solo solo) {
        String ref = "Relationship/Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Sediment_Aggregate/Sediment_Aggregate
     */
    public static View get_SedimentAggregate_SedimentAggregate(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Sediment_Aggregate/Vars
     */
    public static View get_SedimentAggregate_Vars(Solo solo) {
        String ref = "Sediment_Aggregate/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Soil_Munsel_Color/Add_Soil_Munsel_Color
     */
    public static View get_SoilMunselColor_AddSoilMunselColor(Solo solo) {
        String ref = "Soil_Munsel_Color/Add_Soil_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Soil_Munsel_Color/Vars
     */
    public static View get_SoilMunselColor_Vars(Solo solo) {
        String ref = "Soil_Munsel_Color/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square/Diaries
     */
    public static View get_Square_Diaries(Solo solo) {
        String ref = "Square/Diaries";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square/Legacies
     */
    public static View get_Square_Legacies(Solo solo) {
        String ref = "Square/Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square/Loci
     */
    public static View get_Square_Loci(Solo solo) {
        String ref = "Square/Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square/Phases
     */
    public static View get_Square_Phases(Solo solo) {
        String ref = "Square/Phases";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square/Square
     */
    public static View get_Square_Square(Solo solo) {
        String ref = "Square/Square";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square/Vars
     */
    public static View get_Square_Vars(Solo solo) {
        String ref = "Square/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square_Files/Add_Square_Files
     */
    public static View get_SquareFiles_AddSquareFiles(Solo solo) {
        String ref = "Square_Files/Add_Square_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Square_Files/Vars
     */
    public static View get_SquareFiles_Vars(Solo solo) {
        String ref = "Square_Files/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/Help
     */
    public static View get_User_Help(Solo solo) {
        String ref = "User/Help";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/User_List
     */
    public static View get_User_UserList(Solo solo) {
        String ref = "User/User_List";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Site/New_Diary
     */
    public static View get_Control_Site_NewDiary(Solo solo) {
        String ref = "Control/Site/New_Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Site/New_Square
     */
    public static View get_Control_Site_NewSquare(Solo solo) {
        String ref = "Control/Site/New_Square";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Date_Closed/Date_Closed/Cancel
     */
    public static View get_DateClosed_DateClosed_Cancel(Solo solo) {
        String ref = "Date_Closed/Date_Closed/Cancel";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Date_Closed/Date_Closed/Set_Date_Closed
     */
    public static View get_DateClosed_DateClosed_SetDateClosed(Solo solo) {
        String ref = "Date_Closed/Date_Closed/Set_Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Diary/Diary/Photo_Button_1
     */
    public static View get_Diary_Diary_PhotoButton1(Solo solo) {
        String ref = "Diary/Diary/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Add/Add_Photograph_Log
     */
    public static View get_Locus_Add_AddPhotographLog(Solo solo) {
        String ref = "Locus/Add/Add_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Add/Attach_File_Button_1
     */
    public static View get_Locus_Add_AttachFileButton1(Solo solo) {
        String ref = "Locus/Add/Attach_File_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Add/Photo_Button_1
     */
    public static View get_Locus_Add_PhotoButton1(Solo solo) {
        String ref = "Locus/Add/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Deposit/Add_Munsel_Color
     */
    public static View get_Locus_Deposit_AddMunselColor(Solo solo) {
        String ref = "Locus/Deposit/Add_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Deposit/Add_New_Sediment_Aggregate
     */
    public static View get_Locus_Deposit_AddNewSedimentAggregate(Solo solo) {
        String ref = "Locus/Deposit/Add_New_Sediment_Aggregate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Deposit/Material_Helper
     */
    public static View get_Locus_Deposit_MaterialHelper(Solo solo) {
        String ref = "Locus/Deposit/Material_Helper";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Add_Date_Closed
     */
    public static View get_Locus_General_AddDateClosed(Solo solo) {
        String ref = "Locus/General/Add_Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Fill_in_Locus_Type_Details
     */
    public static View get_Locus_General_FillinLocusTypeDetails(Solo solo) {
        String ref = "Locus/General/Fill_in_Locus_Type_Details";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Photo_of_Plan_Button_1
     */
    public static View get_Locus_General_PhotoofPlanButton1(Solo solo) {
        String ref = "Locus/General/Photo_of_Plan_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Photo_of_Section_Button_1
     */
    public static View get_Locus_General_PhotoofSectionButton1(Solo solo) {
        String ref = "Locus/General/Photo_of_Section_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Material_Helper/Update_Material
     */
    public static View get_Locus_MaterialHelper_UpdateMaterial(Solo solo) {
        String ref = "Locus/Material_Helper/Update_Material";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Pottery_Baskets/Add_Pottery_Basket
     */
    public static View get_Locus_PotteryBaskets_AddPotteryBasket(Solo solo) {
        String ref = "Locus/Pottery_Baskets/Add_Pottery_Basket";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Relationships/Create_Relationships_to_This_Locus
     */
    public static View get_Locus_Relationships_CreateRelationshipstoThisLocus(Solo solo) {
        String ref = "Locus/Relationships/Create_Relationships_to_This_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Relationships/Delete_Relationship
     */
    public static View get_Locus_Relationships_DeleteRelationship(Solo solo) {
        String ref = "Locus/Relationships/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Relationships/Load_Related_Locus
     */
    public static View get_Locus_Relationships_LoadRelatedLocus(Solo solo) {
        String ref = "Locus/Relationships/Load_Related_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase/Add/Add_Photograph_Log
     */
    public static View get_Phase_Add_AddPhotographLog(Solo solo) {
        String ref = "Phase/Add/Add_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase/Add/Attach_File_Button_1
     */
    public static View get_Phase_Add_AttachFileButton1(Solo solo) {
        String ref = "Phase/Add/Attach_File_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase/Add/Photo_Button_1
     */
    public static View get_Phase_Add_PhotoButton1(Solo solo) {
        String ref = "Phase/Add/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase/Phase_Loci/Create_Relationships_to_This_Phase
     */
    public static View get_Phase_PhaseLoci_CreateRelationshipstoThisPhase(Solo solo) {
        String ref = "Phase/Phase_Loci/Create_Relationships_to_This_Phase";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase/Phase_Loci/Delete_Relationship
     */
    public static View get_Phase_PhaseLoci_DeleteRelationship(Solo solo) {
        String ref = "Phase/Phase_Loci/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase/Phase_Loci/Load_Related_Locus
     */
    public static View get_Phase_PhaseLoci_LoadRelatedLocus(Solo solo) {
        String ref = "Phase/Phase_Loci/Load_Related_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase_Relationship/Legacies/Create_New_Legacy
     */
    public static View get_PhaseRelationship_Legacies_CreateNewLegacy(Solo solo) {
        String ref = "Phase_Relationship/Legacies/Create_New_Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase_Relationship/Relationships/Add_Relationship
     */
    public static View get_PhaseRelationship_Relationships_AddRelationship(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Add_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase_Relationship/Relationships/Delete_Relationship
     */
    public static View get_PhaseRelationship_Relationships_DeleteRelationship(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Phase_Relationship/Relationships/Search
     */
    public static View get_PhaseRelationship_Relationships_Search(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Pottery_Basket/General/Attach_Photograph_Button_1
     */
    public static View get_PotteryBasket_General_AttachPhotographButton1(Solo solo) {
        String ref = "Pottery_Basket/General/Attach_Photograph_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Pottery_Basket/General/Take_From_GPS_1
     */
    public static View get_PotteryBasket_General_TakeFromGPS1(Solo solo) {
        String ref = "Pottery_Basket/General/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Legacies/Create_New_Legacy
     */
    public static View get_Relationship_Legacies_CreateNewLegacy(Solo solo) {
        String ref = "Relationship/Legacies/Create_New_Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Relationships/Add_Relationship
     */
    public static View get_Relationship_Relationships_AddRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Add_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Relationships/Delete_Relationship
     */
    public static View get_Relationship_Relationships_DeleteRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Relationships/Search
     */
    public static View get_Relationship_Relationships_Search(Solo solo) {
        String ref = "Relationship/Relationships/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Diaries/Create_New_Diary
     */
    public static View get_Square_Diaries_CreateNewDiary(Solo solo) {
        String ref = "Square/Diaries/Create_New_Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Legacies/Create_New_Legacy
     */
    public static View get_Square_Legacies_CreateNewLegacy(Solo solo) {
        String ref = "Square/Legacies/Create_New_Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Loci/Create_New_Locus
     */
    public static View get_Square_Loci_CreateNewLocus(Solo solo) {
        String ref = "Square/Loci/Create_New_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Phases/Create_New_Phase
     */
    public static View get_Square_Phases_CreateNewPhase(Solo solo) {
        String ref = "Square/Phases/Create_New_Phase";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Square/Add_Square_Files
     */
    public static View get_Square_Square_AddSquareFiles(Solo solo) {
        String ref = "Square/Square/Add_Square_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Square/Set_Date_Closed
     */
    public static View get_Square_Square_SetDateClosed(Solo solo) {
        String ref = "Square/Square/Set_Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square/Square/Take_From_GPS_1
     */
    public static View get_Square_Square_TakeFromGPS1(Solo solo) {
        String ref = "Square/Square/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Square_Files/Add_Square_Files/Add_Photo_Button_1
     */
    public static View get_SquareFiles_AddSquareFiles_AddPhotoButton1(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/Add_Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  User/User_List/Login
     */
    public static View get_User_UserList_Login(Solo solo) {
        String ref = "User/User_List/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  User/User_List/Module_Guide
     */
    public static View get_User_UserList_ModuleGuide(Solo solo) {
        String ref = "User/User_List/Module_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Diary/Diary/Photo
     */
    public static View get_Diary_Diary_Photo(Solo solo) {
        String ref = "Diary/Diary/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Locus/Add/Photo
     */
    public static View get_Locus_Add_Photo(Solo solo) {
        String ref = "Locus/Add/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Locus/General/Photo_of_Plan
     */
    public static View get_Locus_General_PhotoofPlan(Solo solo) {
        String ref = "Locus/General/Photo_of_Plan";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Locus/General/Photo_of_Section
     */
    public static View get_Locus_General_PhotoofSection(Solo solo) {
        String ref = "Locus/General/Photo_of_Section";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Phase/Add/Photo
     */
    public static View get_Phase_Add_Photo(Solo solo) {
        String ref = "Phase/Add/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Pottery_Basket/General/Attach_Photograph
     */
    public static View get_PotteryBasket_General_AttachPhotograph(Solo solo) {
        String ref = "Pottery_Basket/General/Attach_Photograph";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Square_Files/Add_Square_Files/Add_Photo
     */
    public static View get_SquareFiles_AddSquareFiles_AddPhoto(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/Add_Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Locus/General/Excavation_Method
     */
    public static View get_Locus_General_ExcavationMethod(Solo solo) {
        String ref = "Locus/General/Excavation_Method";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Square/Square/Excavation_Method
     */
    public static View get_Square_Square_ExcavationMethod(Solo solo) {
        String ref = "Square/Square/Excavation_Method";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Search/Entity_Types
     */
    public static View get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Diary/Vars/Device_Code
     */
    public static View get_Diary_Vars_DeviceCode(Solo solo) {
        String ref = "Diary/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Legacy/Var/Device_Code
     */
    public static View get_Legacy_Var_DeviceCode(Solo solo) {
        String ref = "Legacy/Var/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Add/Select_a_Photograph_Log
     */
    public static View get_Locus_Add_SelectaPhotographLog(Solo solo) {
        String ref = "Locus/Add/Select_a_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Construction/Architecture_Type
     */
    public static View get_Locus_Construction_ArchitectureType(Solo solo) {
        String ref = "Locus/Construction/Architecture_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Cut_Your_Interpretation
     */
    public static View get_Locus_Cut_CutYourInterpretation(Solo solo) {
        String ref = "Locus/Cut/Cut_Your_Interpretation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Inclination_of_axis
     */
    public static View get_Locus_Cut_Inclinationofaxis(Solo solo) {
        String ref = "Locus/Cut/Inclination_of_axis";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Orientation
     */
    public static View get_Locus_Cut_Orientation(Solo solo) {
        String ref = "Locus/Cut/Orientation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Shape_in_Plan
     */
    public static View get_Locus_Cut_ShapeinPlan(Solo solo) {
        String ref = "Locus/Cut/Shape_in_Plan";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Shape_of_Base
     */
    public static View get_Locus_Cut_ShapeofBase(Solo solo) {
        String ref = "Locus/Cut/Shape_of_Base";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Sides_of_Cut
     */
    public static View get_Locus_Cut_SidesofCut(Solo solo) {
        String ref = "Locus/Cut/Sides_of_Cut";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Associated_Sediment_Aggregates
     */
    public static View get_Locus_Deposit_AssociatedSedimentAggregates(Solo solo) {
        String ref = "Locus/Deposit/Associated_Sediment_Aggregates";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Deposit_Bedding
     */
    public static View get_Locus_Deposit_DepositBedding(Solo solo) {
        String ref = "Locus/Deposit/Deposit_Bedding";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Deposit_Structure
     */
    public static View get_Locus_Deposit_DepositStructure(Solo solo) {
        String ref = "Locus/Deposit/Deposit_Structure";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Deposit_Your_Interpretation
     */
    public static View get_Locus_Deposit_DepositYourInterpretation(Solo solo) {
        String ref = "Locus/Deposit/Deposit_Your_Interpretation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Material
     */
    public static View get_Locus_Deposit_Material(Solo solo) {
        String ref = "Locus/Deposit/Material";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Munsel_Colors
     */
    public static View get_Locus_Deposit_MunselColors(Solo solo) {
        String ref = "Locus/Deposit/Munsel_Colors";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Soil_Particle_Sorting
     */
    public static View get_Locus_Deposit_SoilParticleSorting(Solo solo) {
        String ref = "Locus/Deposit/Soil_Particle_Sorting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Texture
     */
    public static View get_Locus_Deposit_Texture(Solo solo) {
        String ref = "Locus/Deposit/Texture";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/General/Basal_Edge_Definition
     */
    public static View get_Locus_General_BasalEdgeDefinition(Solo solo) {
        String ref = "Locus/General/Basal_Edge_Definition";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/General/Contamination
     */
    public static View get_Locus_General_Contamination(Solo solo) {
        String ref = "Locus/General/Contamination";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/General/Primary_Period
     */
    public static View get_Locus_General_PrimaryPeriod(Solo solo) {
        String ref = "Locus/General/Primary_Period";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Material_Helper/Material_Helper
     */
    public static View get_Locus_MaterialHelper_MaterialHelper(Solo solo) {
        String ref = "Locus/Material_Helper/Material_Helper";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Surface/Composition_Description
     */
    public static View get_Locus_Surface_CompositionDescription(Solo solo) {
        String ref = "Locus/Surface/Composition_Description";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Surface/Surface_Type
     */
    public static View get_Locus_Surface_SurfaceType(Solo solo) {
        String ref = "Locus/Surface/Surface_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Vars/Device_Code
     */
    public static View get_Locus_Vars_DeviceCode(Solo solo) {
        String ref = "Locus/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Phase/Add/Select_a_Photograph_Log
     */
    public static View get_Phase_Add_SelectaPhotographLog(Solo solo) {
        String ref = "Phase/Add/Select_a_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Phase/Vars/Device_Code
     */
    public static View get_Phase_Vars_DeviceCode(Solo solo) {
        String ref = "Phase/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Photograph_Log/Photograph_Log/Scene_Type
     */
    public static View get_PhotographLog_PhotographLog_SceneType(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Scene_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Photograph_Log/Vars/Device_Code
     */
    public static View get_PhotographLog_Vars_DeviceCode(Solo solo) {
        String ref = "Photograph_Log/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Pottery_Basket/General/Principal_Period
     */
    public static View get_PotteryBasket_General_PrincipalPeriod(Solo solo) {
        String ref = "Pottery_Basket/General/Principal_Period";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Pottery_Basket/General/Type
     */
    public static View get_PotteryBasket_General_Type(Solo solo) {
        String ref = "Pottery_Basket/General/Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Pottery_Basket/Vars/Device_Code
     */
    public static View get_PotteryBasket_Vars_DeviceCode(Solo solo) {
        String ref = "Pottery_Basket/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Relationship/Relationships/Relationship_Type
     */
    public static View get_Relationship_Relationships_RelationshipType(Solo solo) {
        String ref = "Relationship/Relationships/Relationship_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Sediment_Aggregate/Sediment_Aggregate/Component_Type
     */
    public static View get_SedimentAggregate_SedimentAggregate_ComponentType(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate/Component_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Sediment_Aggregate/Sediment_Aggregate/Soil_Stone_Shape
     */
    public static View get_SedimentAggregate_SedimentAggregate_SoilStoneShape(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate/Soil_Stone_Shape";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Sediment_Aggregate/Vars/Device_Code
     */
    public static View get_SedimentAggregate_Vars_DeviceCode(Solo solo) {
        String ref = "Sediment_Aggregate/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Soil_Munsel_Color/Add_Soil_Munsel_Color/Soil_Munsel_Color
     */
    public static View get_SoilMunselColor_AddSoilMunselColor_SoilMunselColor(Solo solo) {
        String ref = "Soil_Munsel_Color/Add_Soil_Munsel_Color/Soil_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Soil_Munsel_Color/Vars/Device_Code
     */
    public static View get_SoilMunselColor_Vars_DeviceCode(Solo solo) {
        String ref = "Soil_Munsel_Color/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Square/Square/Attached_Square_Files
     */
    public static View get_Square_Square_AttachedSquareFiles(Solo solo) {
        String ref = "Square/Square/Attached_Square_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Square/Square/Square_Dimensions
     */
    public static View get_Square_Square_SquareDimensions(Solo solo) {
        String ref = "Square/Square/Square_Dimensions";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Square/Square/Subsquare
     */
    public static View get_Square_Square_Subsquare(Solo solo) {
        String ref = "Square/Square/Subsquare";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Square/Vars/Device_Code
     */
    public static View get_Square_Vars_DeviceCode(Solo solo) {
        String ref = "Square/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Square_Files/Add_Square_Files/File_Type
     */
    public static View get_SquareFiles_AddSquareFiles_FileType(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/File_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Square_Files/Vars/Device_Code
     */
    public static View get_SquareFiles_Vars_DeviceCode(Solo solo) {
        String ref = "Square_Files/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  User/User_List/Users
     */
    public static View get_User_UserList_Users(Solo solo) {
        String ref = "User/User_List/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: file
        Ref:  Locus/Add/Attach_File
     */
    public static View get_Locus_Add_AttachFile(Solo solo) {
        String ref = "Locus/Add/Attach_File";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: file
        Ref:  Phase/Add/Attach_File
     */
    public static View get_Phase_Add_AttachFile(Solo solo) {
        String ref = "Phase/Add/Attach_File";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: gpsdiag
        Ref:  Control/Site/GPS_Diagnostics
     */
    public static View get_Control_Site_GPSDiagnostics(Solo solo) {
        String ref = "Control/Site/GPS_Diagnostics";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Next_IDs/Next_Locus_ID
     */
    public static EditText get_Control_NextIDs_NextLocusID(Solo solo) {
        String ref = "Control/Next_IDs/Next_Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Next_IDs/Next_Phase_ID
     */
    public static EditText get_Control_NextIDs_NextPhaseID(Solo solo) {
        String ref = "Control/Next_IDs/Next_Phase_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Next_IDs/Next_Pottery_Basket_ID
     */
    public static EditText get_Control_NextIDs_NextPotteryBasketID(Solo solo) {
        String ref = "Control/Next_IDs/Next_Pottery_Basket_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Date_Closed/Date_Closed/Date_Closed
     */
    public static EditText get_DateClosed_DateClosed_DateClosed(Solo solo) {
        String ref = "Date_Closed/Date_Closed/Date_Closed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Diary/Text
     */
    public static EditText get_Diary_Diary_Text(Solo solo) {
        String ref = "Diary/Diary/Text";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Diary/Timestamp
     */
    public static View get_Diary_Diary_Timestamp(Solo solo) {
        String ref = "Diary/Diary/Timestamp";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Diary/Title
     */
    public static EditText get_Diary_Diary_Title(Solo solo) {
        String ref = "Diary/Diary/Title";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Vars/Square_ID
     */
    public static EditText get_Diary_Vars_SquareID(Solo solo) {
        String ref = "Diary/Vars/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Legacy/Legacy/Locus_ID
     */
    public static EditText get_Legacy_Legacy_LocusID(Solo solo) {
        String ref = "Legacy/Legacy/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Legacy/Legacy/Square_ID
     */
    public static EditText get_Legacy_Legacy_SquareID(Solo solo) {
        String ref = "Legacy/Legacy/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Bottom_Depth
     */
    public static EditText get_Locus_Construction_BottomDepth(Solo solo) {
        String ref = "Locus/Construction/Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Discussion
     */
    public static EditText get_Locus_Construction_Discussion(Solo solo) {
        String ref = "Locus/Construction/Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Length
     */
    public static EditText get_Locus_Construction_Length(Solo solo) {
        String ref = "Locus/Construction/Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Mid_X
     */
    public static EditText get_Locus_Construction_MidX(Solo solo) {
        String ref = "Locus/Construction/Mid_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Mid_Y
     */
    public static EditText get_Locus_Construction_MidY(Solo solo) {
        String ref = "Locus/Construction/Mid_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Notes
     */
    public static EditText get_Locus_Construction_Notes(Solo solo) {
        String ref = "Locus/Construction/Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Plans
     */
    public static EditText get_Locus_Construction_Plans(Solo solo) {
        String ref = "Locus/Construction/Plans";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Section_Numbers
     */
    public static EditText get_Locus_Construction_SectionNumbers(Solo solo) {
        String ref = "Locus/Construction/Section_Numbers";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Sorting
     */
    public static EditText get_Locus_Construction_Sorting(Solo solo) {
        String ref = "Locus/Construction/Sorting";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Top_Depth
     */
    public static EditText get_Locus_Construction_TopDepth(Solo solo) {
        String ref = "Locus/Construction/Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Width
     */
    public static EditText get_Locus_Construction_Width(Solo solo) {
        String ref = "Locus/Construction/Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Your_Description
     */
    public static EditText get_Locus_Construction_YourDescription(Solo solo) {
        String ref = "Locus/Construction/Your_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Your_Interpretation
     */
    public static EditText get_Locus_Construction_YourInterpretation(Solo solo) {
        String ref = "Locus/Construction/Your_Interpretation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Cut/Orientation_Degree
     */
    public static EditText get_Locus_Cut_OrientationDegree(Solo solo) {
        String ref = "Locus/Cut/Orientation_Degree";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Cut/Shape_of_Cut_-_Note
     */
    public static EditText get_Locus_Cut_ShapeofCutNote(Solo solo) {
        String ref = "Locus/Cut/Shape_of_Cut_-_Note";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Cut/Truncation
     */
    public static EditText get_Locus_Cut_Truncation(Solo solo) {
        String ref = "Locus/Cut/Truncation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Deposit/Deposit_Inclusions
     */
    public static EditText get_Locus_Deposit_DepositInclusions(Solo solo) {
        String ref = "Locus/Deposit/Deposit_Inclusions";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Deposit/Soil_Colour
     */
    public static EditText get_Locus_Deposit_SoilColour(Solo solo) {
        String ref = "Locus/Deposit/Soil_Colour";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Deposit/Texture_Description
     */
    public static EditText get_Locus_Deposit_TextureDescription(Solo solo) {
        String ref = "Locus/Deposit/Texture_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Area
     */
    public static EditText get_Locus_General_Area(Solo solo) {
        String ref = "Locus/General/Area";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Brief_Description
     */
    public static EditText get_Locus_General_BriefDescription(Solo solo) {
        String ref = "Locus/General/Brief_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Date_Closed
     */
    public static EditText get_Locus_General_DateClosed(Solo solo) {
        String ref = "Locus/General/Date_Closed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Date_Opened
     */
    public static EditText get_Locus_General_DateOpened(Solo solo) {
        String ref = "Locus/General/Date_Opened";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Grid_X
     */
    public static EditText get_Locus_General_GridX(Solo solo) {
        String ref = "Locus/General/Grid_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Grid_Y
     */
    public static EditText get_Locus_General_GridY(Solo solo) {
        String ref = "Locus/General/Grid_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_ID
     */
    public static EditText get_Locus_General_LocusID(Solo solo) {
        String ref = "Locus/General/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Square_ID
     */
    public static View get_Locus_General_SquareID(Solo solo) {
        String ref = "Locus/General/Square_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Subsquare
     */
    public static View get_Locus_General_Subsquare(Solo solo) {
        String ref = "Locus/General/Subsquare";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Team_Members
     */
    public static EditText get_Locus_General_TeamMembers(Solo solo) {
        String ref = "Locus/General/Team_Members";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Int/Your_Discussion
     */
    public static EditText get_Locus_Int_YourDiscussion(Solo solo) {
        String ref = "Locus/Int/Your_Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Int/Your_description
     */
    public static EditText get_Locus_Int_Yourdescription(Solo solo) {
        String ref = "Locus/Int/Your_description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Absolute_Height_Bottom_m
     */
    public static EditText get_Locus_Measure_AbsoluteHeightBottomm(Solo solo) {
        String ref = "Locus/Measure/Absolute_Height_Bottom_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Absolute_Height_Top_m
     */
    public static EditText get_Locus_Measure_AbsoluteHeightTopm(Solo solo) {
        String ref = "Locus/Measure/Absolute_Height_Top_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Center_Bottom_Height
     */
    public static EditText get_Locus_Measure_CenterBottomHeight(Solo solo) {
        String ref = "Locus/Measure/Center_Bottom_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Center_Top_Height
     */
    public static EditText get_Locus_Measure_CenterTopHeight(Solo solo) {
        String ref = "Locus/Measure/Center_Top_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Measure_Depth
     */
    public static EditText get_Locus_Measure_MeasureDepth(Solo solo) {
        String ref = "Locus/Measure/Measure_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Measure_Length
     */
    public static EditText get_Locus_Measure_MeasureLength(Solo solo) {
        String ref = "Locus/Measure/Measure_Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Measure_Width
     */
    public static EditText get_Locus_Measure_MeasureWidth(Solo solo) {
        String ref = "Locus/Measure/Measure_Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NE_Bottom_Height
     */
    public static EditText get_Locus_Measure_NEBottomHeight(Solo solo) {
        String ref = "Locus/Measure/NE_Bottom_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NE_Top_Height
     */
    public static EditText get_Locus_Measure_NETopHeight(Solo solo) {
        String ref = "Locus/Measure/NE_Top_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NW_Bottom_Height
     */
    public static EditText get_Locus_Measure_NWBottomHeight(Solo solo) {
        String ref = "Locus/Measure/NW_Bottom_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NW_Top_Height
     */
    public static EditText get_Locus_Measure_NWTopHeight(Solo solo) {
        String ref = "Locus/Measure/NW_Top_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SE_Bottom_Height
     */
    public static EditText get_Locus_Measure_SEBottomHeight(Solo solo) {
        String ref = "Locus/Measure/SE_Bottom_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SE_Top_Height
     */
    public static EditText get_Locus_Measure_SETopHeight(Solo solo) {
        String ref = "Locus/Measure/SE_Top_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SW_Bottom_Height
     */
    public static EditText get_Locus_Measure_SWBottomHeight(Solo solo) {
        String ref = "Locus/Measure/SW_Bottom_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SW_Top_Height
     */
    public static EditText get_Locus_Measure_SWTopHeight(Solo solo) {
        String ref = "Locus/Measure/SW_Top_Height";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Volume_Litres
     */
    public static EditText get_Locus_Measure_VolumeLitres(Solo solo) {
        String ref = "Locus/Measure/Volume_Litres";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Location
     */
    public static EditText get_Locus_Skeleton_Location(Solo solo) {
        String ref = "Locus/Skeleton/Location";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Body
     */
    public static EditText get_Locus_Skeleton_SkeletonBody(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Body";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Condition
     */
    public static EditText get_Locus_Skeleton_SkeletonCondition(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Condition";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Days_Exposed
     */
    public static EditText get_Locus_Skeleton_SkeletonDaysExposed(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Days_Exposed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Dimensions
     */
    public static EditText get_Locus_Skeleton_SkeletonDimensions(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Dimensions";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Environment
     */
    public static EditText get_Locus_Skeleton_SkeletonEnvironment(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Environment";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Head
     */
    public static EditText get_Locus_Skeleton_SkeletonHead(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Head";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Left_Arm
     */
    public static EditText get_Locus_Skeleton_SkeletonLeftArm(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Left_Arm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Left_Leg
     */
    public static EditText get_Locus_Skeleton_SkeletonLeftLeg(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Left_Leg";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Notes
     */
    public static EditText get_Locus_Skeleton_SkeletonNotes(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Right_Arm
     */
    public static EditText get_Locus_Skeleton_SkeletonRightArm(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Right_Arm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Right_Leg
     */
    public static EditText get_Locus_Skeleton_SkeletonRightLeg(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Right_Leg";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Surface_Modifications
     */
    public static EditText get_Locus_Skeleton_SkeletonSurfaceModifications(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Surface_Modifications";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_A_X
     */
    public static EditText get_Locus_Skeleton_TargetAX(Solo solo) {
        String ref = "Locus/Skeleton/Target_A_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_A_Y
     */
    public static EditText get_Locus_Skeleton_TargetAY(Solo solo) {
        String ref = "Locus/Skeleton/Target_A_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_A_Z
     */
    public static EditText get_Locus_Skeleton_TargetAZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_A_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_B_X
     */
    public static EditText get_Locus_Skeleton_TargetBX(Solo solo) {
        String ref = "Locus/Skeleton/Target_B_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_B_Y
     */
    public static EditText get_Locus_Skeleton_TargetBY(Solo solo) {
        String ref = "Locus/Skeleton/Target_B_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_B_Z
     */
    public static EditText get_Locus_Skeleton_TargetBZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_B_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_C_X
     */
    public static EditText get_Locus_Skeleton_TargetCX(Solo solo) {
        String ref = "Locus/Skeleton/Target_C_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_C_Y
     */
    public static EditText get_Locus_Skeleton_TargetCY(Solo solo) {
        String ref = "Locus/Skeleton/Target_C_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_C_Z
     */
    public static EditText get_Locus_Skeleton_TargetCZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_C_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_D_X
     */
    public static EditText get_Locus_Skeleton_TargetDX(Solo solo) {
        String ref = "Locus/Skeleton/Target_D_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_D_Y
     */
    public static EditText get_Locus_Skeleton_TargetDY(Solo solo) {
        String ref = "Locus/Skeleton/Target_D_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_D_Z
     */
    public static EditText get_Locus_Skeleton_TargetDZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_D_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Surface/Extend_Width
     */
    public static EditText get_Locus_Surface_ExtendWidth(Solo solo) {
        String ref = "Locus/Surface/Extend_Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Surface/Extent_Length
     */
    public static EditText get_Locus_Surface_ExtentLength(Solo solo) {
        String ref = "Locus/Surface/Extent_Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Surface/Thickness_max
     */
    public static EditText get_Locus_Surface_Thicknessmax(Solo solo) {
        String ref = "Locus/Surface/Thickness_max";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Area
     */
    public static View get_Phase_General_Area(Solo solo) {
        String ref = "Phase/General/Area";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Bottom_Depth
     */
    public static EditText get_Phase_General_BottomDepth(Solo solo) {
        String ref = "Phase/General/Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Description
     */
    public static EditText get_Phase_General_Description(Solo solo) {
        String ref = "Phase/General/Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Discussion
     */
    public static EditText get_Phase_General_Discussion(Solo solo) {
        String ref = "Phase/General/Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Interpretation
     */
    public static EditText get_Phase_General_Interpretation(Solo solo) {
        String ref = "Phase/General/Interpretation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Length
     */
    public static EditText get_Phase_General_Length(Solo solo) {
        String ref = "Phase/General/Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Mid_X
     */
    public static EditText get_Phase_General_MidX(Solo solo) {
        String ref = "Phase/General/Mid_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Mid_Y
     */
    public static EditText get_Phase_General_MidY(Solo solo) {
        String ref = "Phase/General/Mid_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Phase_ID
     */
    public static EditText get_Phase_General_PhaseID(Solo solo) {
        String ref = "Phase/General/Phase_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Plans
     */
    public static EditText get_Phase_General_Plans(Solo solo) {
        String ref = "Phase/General/Plans";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Section_Numbers
     */
    public static EditText get_Phase_General_SectionNumbers(Solo solo) {
        String ref = "Phase/General/Section_Numbers";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Square_ID
     */
    public static View get_Phase_General_SquareID(Solo solo) {
        String ref = "Phase/General/Square_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Top_Depth
     */
    public static EditText get_Phase_General_TopDepth(Solo solo) {
        String ref = "Phase/General/Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/General/Width
     */
    public static EditText get_Phase_General_Width(Solo solo) {
        String ref = "Phase/General/Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/Vars/L_Paren
     */
    public static EditText get_Phase_Vars_LParen(Solo solo) {
        String ref = "Phase/Vars/L_Paren";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/Vars/Last_Feature_Prefix
     */
    public static EditText get_Phase_Vars_LastFeaturePrefix(Solo solo) {
        String ref = "Phase/Vars/Last_Feature_Prefix";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase/Vars/R_Paren
     */
    public static EditText get_Phase_Vars_RParen(Solo solo) {
        String ref = "Phase/Vars/R_Paren";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase_Relationship/Relationships/Locus_ID
     */
    public static EditText get_PhaseRelationship_Relationships_LocusID(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Phase_Relationship/Relationships/Square_ID
     */
    public static EditText get_PhaseRelationship_Relationships_SquareID(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Brief_Description
     */
    public static EditText get_PhotographLog_PhotographLog_BriefDescription(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Brief_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Locus_ID
     */
    public static View get_PhotographLog_PhotographLog_LocusID(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Locus_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Phase_ID
     */
    public static View get_PhotographLog_PhotographLog_PhaseID(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Phase_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Photograph_Register_ID
     */
    public static EditText get_PhotographLog_PhotographLog_PhotographRegisterID(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Photograph_Register_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Vars/Square_ID
     */
    public static EditText get_PhotographLog_Vars_SquareID(Solo solo) {
        String ref = "Photograph_Log/Vars/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Accuracy
     */
    public static View get_PotteryBasket_General_Accuracy(Solo solo) {
        String ref = "Pottery_Basket/General/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Area
     */
    public static EditText get_PotteryBasket_General_Area(Solo solo) {
        String ref = "Pottery_Basket/General/Area";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Bottom_Elevation_m
     */
    public static EditText get_PotteryBasket_General_BottomElevationm(Solo solo) {
        String ref = "Pottery_Basket/General/Bottom_Elevation_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Chronology_Note
     */
    public static EditText get_PotteryBasket_General_ChronologyNote(Solo solo) {
        String ref = "Pottery_Basket/General/Chronology_Note";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Date_Collected
     */
    public static EditText get_PotteryBasket_General_DateCollected(Solo solo) {
        String ref = "Pottery_Basket/General/Date_Collected";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Easting
     */
    public static View get_PotteryBasket_General_Easting(Solo solo) {
        String ref = "Pottery_Basket/General/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/General_Notes
     */
    public static EditText get_PotteryBasket_General_GeneralNotes(Solo solo) {
        String ref = "Pottery_Basket/General/General_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Intrusive_Materials_Comment
     */
    public static EditText get_PotteryBasket_General_IntrusiveMaterialsComment(Solo solo) {
        String ref = "Pottery_Basket/General/Intrusive_Materials_Comment";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Latitude
     */
    public static View get_PotteryBasket_General_Latitude(Solo solo) {
        String ref = "Pottery_Basket/General/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Locus_ID
     */
    public static View get_PotteryBasket_General_LocusID(Solo solo) {
        String ref = "Pottery_Basket/General/Locus_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Longitude
     */
    public static View get_PotteryBasket_General_Longitude(Solo solo) {
        String ref = "Pottery_Basket/General/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Northing
     */
    public static View get_PotteryBasket_General_Northing(Solo solo) {
        String ref = "Pottery_Basket/General/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Pottery_Basket_ID
     */
    public static EditText get_PotteryBasket_General_PotteryBasketID(Solo solo) {
        String ref = "Pottery_Basket/General/Pottery_Basket_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Square_ID
     */
    public static View get_PotteryBasket_General_SquareID(Solo solo) {
        String ref = "Pottery_Basket/General/Square_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Subsquare
     */
    public static View get_PotteryBasket_General_Subsquare(Solo solo) {
        String ref = "Pottery_Basket/General/Subsquare";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Top_Elevation_m
     */
    public static EditText get_PotteryBasket_General_TopElevationm(Solo solo) {
        String ref = "Pottery_Basket/General/Top_Elevation_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Weight_kg
     */
    public static EditText get_PotteryBasket_General_Weightkg(Solo solo) {
        String ref = "Pottery_Basket/General/Weight_kg";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/X_Coordinates
     */
    public static EditText get_PotteryBasket_General_XCoordinates(Solo solo) {
        String ref = "Pottery_Basket/General/X_Coordinates";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Y_Coordinates
     */
    public static EditText get_PotteryBasket_General_YCoordinates(Solo solo) {
        String ref = "Pottery_Basket/General/Y_Coordinates";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Pottery_Basket/General/Z_Coordinates
     */
    public static EditText get_PotteryBasket_General_ZCoordinates(Solo solo) {
        String ref = "Pottery_Basket/General/Z_Coordinates";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Relationship/Relationships/Locus_ID
     */
    public static EditText get_Relationship_Relationships_LocusID(Solo solo) {
        String ref = "Relationship/Relationships/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Relationship/Relationships/Square_ID
     */
    public static EditText get_Relationship_Relationships_SquareID(Solo solo) {
        String ref = "Relationship/Relationships/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sediment_Aggregate/Sediment_Aggregate/Percentage
     */
    public static EditText get_SedimentAggregate_SedimentAggregate_Percentage(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate/Percentage";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sediment_Aggregate/Vars/Locus_ID
     */
    public static EditText get_SedimentAggregate_Vars_LocusID(Solo solo) {
        String ref = "Sediment_Aggregate/Vars/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sediment_Aggregate/Vars/Square_ID
     */
    public static EditText get_SedimentAggregate_Vars_SquareID(Solo solo) {
        String ref = "Sediment_Aggregate/Vars/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Soil_Munsel_Color/Vars/Soil_Munsel_Color_Locus_ID
     */
    public static EditText get_SoilMunselColor_Vars_SoilMunselColorLocusID(Solo solo) {
        String ref = "Soil_Munsel_Color/Vars/Soil_Munsel_Color_Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Accuracy
     */
    public static View get_Square_Square_Accuracy(Solo solo) {
        String ref = "Square/Square/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Area
     */
    public static EditText get_Square_Square_Area(Solo solo) {
        String ref = "Square/Square/Area";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Brief_Description
     */
    public static EditText get_Square_Square_BriefDescription(Solo solo) {
        String ref = "Square/Square/Brief_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Date_Closed
     */
    public static View get_Square_Square_DateClosed(Solo solo) {
        String ref = "Square/Square/Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Easting
     */
    public static View get_Square_Square_Easting(Solo solo) {
        String ref = "Square/Square/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Latitude
     */
    public static View get_Square_Square_Latitude(Solo solo) {
        String ref = "Square/Square/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Longitude
     */
    public static View get_Square_Square_Longitude(Solo solo) {
        String ref = "Square/Square/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Northing
     */
    public static View get_Square_Square_Northing(Solo solo) {
        String ref = "Square/Square/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Square_ID
     */
    public static EditText get_Square_Square_SquareID(Solo solo) {
        String ref = "Square/Square/Square_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Team_Members
     */
    public static EditText get_Square_Square_TeamMembers(Solo solo) {
        String ref = "Square/Square/Team_Members";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/X_Coordinate
     */
    public static EditText get_Square_Square_XCoordinate(Solo solo) {
        String ref = "Square/Square/X_Coordinate";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Y_Coordinate
     */
    public static EditText get_Square_Square_YCoordinate(Solo solo) {
        String ref = "Square/Square/Y_Coordinate";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square/Square/Your_Discussion
     */
    public static EditText get_Square_Square_YourDiscussion(Solo solo) {
        String ref = "Square/Square/Your_Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square_Files/Add_Square_Files/Area
     */
    public static EditText get_SquareFiles_AddSquareFiles_Area(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/Area";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square_Files/Add_Square_Files/File_Comment
     */
    public static EditText get_SquareFiles_AddSquareFiles_FileComment(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/File_Comment";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square_Files/Add_Square_Files/File_Name
     */
    public static EditText get_SquareFiles_AddSquareFiles_FileName(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/File_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square_Files/Add_Square_Files/Square_ID
     */
    public static View get_SquareFiles_AddSquareFiles_SquareID(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/Square_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Square_Files/Add_Square_Files/Subsquare
     */
    public static View get_SquareFiles_AddSquareFiles_Subsquare(Solo solo) {
        String ref = "Square_Files/Add_Square_Files/Subsquare";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Site/Choose_an_Existing_Site
     */
    public static View get_Control_Site_ChooseanExistingSite(Solo solo) {
        String ref = "Control/Site/Choose_an_Existing_Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Locus/Pottery_Baskets/List_of_Related_Pottery_Baskets
     */
    public static View get_Locus_PotteryBaskets_ListofRelatedPotteryBaskets(Solo solo) {
        String ref = "Locus/Pottery_Baskets/List_of_Related_Pottery_Baskets";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Locus/Relationships/Existing_Relationships_to_This_Locus
     */
    public static View get_Locus_Relationships_ExistingRelationshipstoThisLocus(Solo solo) {
        String ref = "Locus/Relationships/Existing_Relationships_to_This_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Phase/Phase_Loci/Existing_Relationships_to_This_Phase
     */
    public static View get_Phase_PhaseLoci_ExistingRelationshipstoThisPhase(Solo solo) {
        String ref = "Phase/Phase_Loci/Existing_Relationships_to_This_Phase";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Phase_Relationship/Legacies/List_of_Existing_Legacies
     */
    public static View get_PhaseRelationship_Legacies_ListofExistingLegacies(Solo solo) {
        String ref = "Phase_Relationship/Legacies/List_of_Existing_Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Phase_Relationship/Relationships/Existing_Relationships
     */
    public static View get_PhaseRelationship_Relationships_ExistingRelationships(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Existing_Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Phase_Relationship/Relationships/Unrelated_Loci
     */
    public static View get_PhaseRelationship_Relationships_UnrelatedLoci(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Unrelated_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Relationship/Legacies/List_of_Existing_Legacies
     */
    public static View get_Relationship_Legacies_ListofExistingLegacies(Solo solo) {
        String ref = "Relationship/Legacies/List_of_Existing_Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Relationship/Relationships/Existing_Relationships
     */
    public static View get_Relationship_Relationships_ExistingRelationships(Solo solo) {
        String ref = "Relationship/Relationships/Existing_Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Relationship/Relationships/Unrelated_Loci
     */
    public static View get_Relationship_Relationships_UnrelatedLoci(Solo solo) {
        String ref = "Relationship/Relationships/Unrelated_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Square/Diaries/List_of_Existing_Diaries
     */
    public static View get_Square_Diaries_ListofExistingDiaries(Solo solo) {
        String ref = "Square/Diaries/List_of_Existing_Diaries";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Square/Legacies/List_of_Existing_Legacies
     */
    public static View get_Square_Legacies_ListofExistingLegacies(Solo solo) {
        String ref = "Square/Legacies/List_of_Existing_Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Square/Loci/List_of_Existing_Loci
     */
    public static View get_Square_Loci_ListofExistingLoci(Solo solo) {
        String ref = "Square/Loci/List_of_Existing_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Square/Phases/List_of_Existing_Phases
     */
    public static View get_Square_Phases_ListofExistingPhases(Solo solo) {
        String ref = "Square/Phases/List_of_Existing_Phases";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: picture
        Ref:  Locus/General/Locus_Type
     */
    public static View get_Locus_General_LocusType(Solo solo) {
        String ref = "Locus/General/Locus_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Cut/Break_of_Slope_-_Base
     */
    public static View get_Locus_Cut_BreakofSlopeBase(Solo solo) {
        String ref = "Locus/Cut/Break_of_Slope_-_Base";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Cut/Break_of_Slope_-_Top
     */
    public static View get_Locus_Cut_BreakofSlopeTop(Solo solo) {
        String ref = "Locus/Cut/Break_of_Slope_-_Top";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Cut/Shape_of_Corners
     */
    public static View get_Locus_Cut_ShapeofCorners(Solo solo) {
        String ref = "Locus/Cut/Shape_of_Corners";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Deposit/Sterile
     */
    public static View get_Locus_Deposit_Sterile(Solo solo) {
        String ref = "Locus/Deposit/Sterile";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Pottery_Basket/General/Analysed
     */
    public static View get_PotteryBasket_General_Analysed(Solo solo) {
        String ref = "Pottery_Basket/General/Analysed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Pottery_Basket/General/Chronology_Precision
     */
    public static View get_PotteryBasket_General_ChronologyPrecision(Solo solo) {
        String ref = "Pottery_Basket/General/Chronology_Precision";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Pottery_Basket/General/Restorable
     */
    public static View get_PotteryBasket_General_Restorable(Solo solo) {
        String ref = "Pottery_Basket/General/Restorable";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Pottery_Basket/General/Washed
     */
    public static View get_PotteryBasket_General_Washed(Solo solo) {
        String ref = "Pottery_Basket/General/Washed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Pottery_Basket/General/Weighted
     */
    public static View get_PotteryBasket_General_Weighted(Solo solo) {
        String ref = "Pottery_Basket/General/Weighted";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  User/User_List/Device_Code
     */
    public static View get_User_UserList_DeviceCode(Solo solo) {
        String ref = "User/User_List/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: viewfiles
        Ref:  Locus/Add/View_Attached_Files
     */
    public static View get_Locus_Add_ViewAttachedFiles(Solo solo) {
        String ref = "Locus/Add/View_Attached_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: viewfiles
        Ref:  Phase/Add/View_Attached_Files
     */
    public static View get_Phase_Add_ViewAttachedFiles(Solo solo) {
        String ref = "Phase/Add/View_Attached_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Locus/Relationships/Selected_Relationship
     */
    public static View get_Locus_Relationships_SelectedRelationship(Solo solo) {
        String ref = "Locus/Relationships/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Phase/Add/Guide_2
     */
    public static View get_Phase_Add_Guide2(Solo solo) {
        String ref = "Phase/Add/Guide_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Phase/Phase_Loci/Selected_Relationship
     */
    public static View get_Phase_PhaseLoci_SelectedRelationship(Solo solo) {
        String ref = "Phase/Phase_Loci/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Phase_Relationship/Relationships/Parent_Identifier
     */
    public static View get_PhaseRelationship_Relationships_ParentIdentifier(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Parent_Identifier";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Phase_Relationship/Relationships/Proposed_Relationship
     */
    public static View get_PhaseRelationship_Relationships_ProposedRelationship(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Proposed_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Phase_Relationship/Relationships/Selected_Relationship
     */
    public static View get_PhaseRelationship_Relationships_SelectedRelationship(Solo solo) {
        String ref = "Phase_Relationship/Relationships/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Relationship/Relationships/Parent_Identifier
     */
    public static View get_Relationship_Relationships_ParentIdentifier(Solo solo) {
        String ref = "Relationship/Relationships/Parent_Identifier";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Relationship/Relationships/Proposed_Relationship
     */
    public static View get_Relationship_Relationships_ProposedRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Proposed_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Relationship/Relationships/Selected_Relationship
     */
    public static View get_Relationship_Relationships_SelectedRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Square/Square/Grid_SW_Corner_Coordinates
     */
    public static View get_Square_Square_GridSWCornerCoordinates(Solo solo) {
        String ref = "Square/Square/Grid_SW_Corner_Coordinates";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  User/Help/Help
     */
    public static View get_User_Help_Help(Solo solo) {
        String ref = "User/Help/Help";
        return (android.view.View) solo.getView((Object) ref);
    }
}
