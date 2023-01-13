/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package luxurycampsitegui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LuxuryCampSiteController implements Initializable {
    
    @FXML
    private TableView<String> AccommodationTableID;
    @FXML
    private TableColumn<String, String> NoColumnID;
    @FXML
    private TableColumn<String, String> AccommTypeColumnID;
    @FXML
    private TableColumn<String, String> OccupancyColumnID;
    @FXML
    private TableColumn<String, String> AvailabilityColumnID;
    @FXML
    private TableColumn<String, String> StatusColumnID;
    @FXML
    private TableColumn<String, String> GuestsColumnID;
    @FXML
    private TableColumn<String, String> BreakfastColumnID;

    @FXML
    private ComboBox<String> AreaBox;

    private String[] Area = {"Hilltop", "Wild Meadow", "Woodland", "Lakeview"};

    @FXML
    private TextField AreaDescriptionID;

    @FXML
    private ComboBox<String> CleaningStatusBox;
    @FXML
    private TextField FirstNameID;

    @FXML
    private TextField LastNameID;

    @FXML
    private CheckBox BreakfastBoxID;

    @FXML
    private TextField PhoneNumberID;

    @FXML
    private TextField NumberOfGuestsID;

    @FXML
    private TextField CheckInDateDayID;

    @FXML
    private TextField CheckInDateMonthID;

    @FXML
    private TextField CheckInDateYearID;

    @FXML
    private TextField NumberOfNightsID;

    private String[] CleaningStatus = {"Clean", "Not Clean"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Started of GUI
        System.out.println("GUI Initialized!");

        AreaBox.getItems().addAll(Area);
        CleaningStatusBox.getItems().addAll(CleaningStatus);
    }

    @FXML
    void SelectArea(ActionEvent event) {
        String AreaDescription = AreaBox.getSelectionModel().getSelectedItem().toString();
        AreaDescriptionID.setText(AreaDescription);
    }

    @FXML
    private void CheckedIn(ActionEvent event) {
        //Irrelavent for now but maybe need to use if issue come up
        //String lastName = LastNameID.getText();
        //String phonenumber = PhoneNumberID.getText();
        //String numberOfGuests = NumberOfGuestsID.getText();
        //String checkInDate = CheckInDateID.getText();
        //String numberOfNights = NumberOfNightsID.getText(); 

        //Printing out booking info typed in by user
        System.out.println("First name: " + FirstNameID.getText());
        System.out.println("Last name: " + LastNameID.getText());
        System.out.println("Phone number: " + PhoneNumberID.getText());
        System.out.println("Number of Guests: " + NumberOfGuestsID.getText());
        System.out.println("Check in Date: " + CheckInDateDayID.getText() + "-" + CheckInDateMonthID.getText() + "-" + CheckInDateYearID.getText());
        System.out.println("Number of Nights: " + NumberOfNightsID.getText());

        //Breafast required checkbox using if else statement
        if (BreakfastBoxID.isSelected()) {
            System.out.println("Breakfast required");
        } else {
            System.out.println("Breakfast not required");
        }

        //Doesnt apply very well but may be fixed
        //if (FirstNameID.getText(). length()<= 2 || LastNameID.getText(). length()<=2) {
        //  FirstNameID.setStyle("-fx-border-color: red;");
        //LastNameID.setStyle("-fx-border-color: red;");
        //}
        //else
        //  FirstNameID.setStyle(null);
        //Validation for booking info
        if (FirstNameID.getText().length() <= 2) {
            FirstNameID.setStyle("-fx-border-color: red;");//Will turn the text box red when not valid
        } else {
            FirstNameID.setStyle(null); //Needed else statement to revert text box when valid
        }
        if (LastNameID.getText().length() <= 2) {
            LastNameID.setStyle("-fx-border-color: red;");
        } else {
            LastNameID.setStyle(null);
        }

        if (PhoneNumberID.getText().length() >= 12 || PhoneNumberID.getText().length() < 11) {
            PhoneNumberID.setStyle("-fx-border-color: red;");
        } else {
            PhoneNumberID.setStyle(null);
        }

        if (NumberOfGuestsID.getText().length() < 1 || NumberOfGuestsID.getText().length() > 10) {
            NumberOfGuestsID.setStyle("-fx-border-color:red;");
        } else {
            NumberOfGuestsID.setStyle(null);
        }

        if (CheckInDateDayID.getText().length() > 2 || CheckInDateDayID.getText().length() < 1) { //Characters not value, i forget
            CheckInDateDayID.setStyle("-fx-border-color:red;");

            CheckInDateYearID.setStyle("-fx-border-color:red;");
        } else {
            CheckInDateDayID.setStyle(null);
        }

        if (CheckInDateMonthID.getText().length() > 2 || CheckInDateMonthID.getText().length() < 1) {
            CheckInDateMonthID.setStyle("-fx-border-color:red;");
        } else {
            CheckInDateMonthID.setStyle(null);
        }

        if (CheckInDateYearID.getText().length() > 2 || CheckInDateYearID.getText().length() < 1) {
            CheckInDateYearID.setStyle("-fx-border-color:red;");
        } else {
            CheckInDateYearID.setStyle(null);
        }

        System.out.println("CheckedIn!");

    }

    @FXML
    private void CheckedOut(ActionEvent event) {

        System.out.println("First name: " + FirstNameID.getText());
        System.out.println("Last name: " + LastNameID.getText());
        System.out.println("Phone number: " + PhoneNumberID.getText());
        System.out.println("Number of Guests: " + NumberOfGuestsID.getText());
        System.out.println("Check in Date: " + CheckInDateDayID.getText() + "-" + CheckInDateMonthID.getText() + "-" + CheckInDateYearID.getText());
        System.out.println("Number of Nights: " + NumberOfNightsID.getText());

        if (BreakfastBoxID.isSelected()) {
            System.out.println("Breakfast required");
        } else {
            System.out.println("Breakfast not required");
        }

        System.out.println("CheckedOut!");
    }

}