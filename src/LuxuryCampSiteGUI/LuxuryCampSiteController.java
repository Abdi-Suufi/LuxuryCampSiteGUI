/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package luxurycampsitegui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import businessmodel.Yurt;
import businessmodel.ShepherdHut;
import businessmodel.GeodesicDome;
import businessmodel.Cabin;
import LuxuryCampSiteGUI.AccomTable; //idk why i have to import this but wont work without
import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class LuxuryCampSiteController implements Initializable {
    
    @FXML
    private TableView<AccomTable> AccommodationTableID;
    @FXML
    private TableColumn<AccomTable, Integer> NoColumnID;
    @FXML
    private TableColumn<AccomTable, String> AccommTypeColumnID;
    @FXML
    private TableColumn<AccomTable, String> OccupancyColumnID;
    @FXML
    private TableColumn<AccomTable, String> AvailabilityColumnID;
    @FXML
    private TableColumn<AccomTable, String> StatusColumnID;
    @FXML
    private TableColumn<AccomTable, Integer> GuestsColumnID;
    @FXML
    private TableColumn<AccomTable, String> BreakfastColumnID;

    @FXML
    private ComboBox<String> AreaBox;

    @FXML
    private TextField AreaDescriptionID;
    
    @FXML
    private TextField BreakfastNoID;
    
    @FXML
    private TextField CleaningNoID;

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
    
    @FXML
    private Button CheckInButtonID;
    
    @FXML
    private Button CheckOutButtonID;
    
    @FXML
    private TextField AccommTypeID;
    
    @FXML
    private TextField AccommNoID;
    
    @FXML
    private TextField AccomodatesID;
    
    @FXML
    private TextField PricePerNightID;
    
    @FXML
    void displaySelected(MouseEvent event) {
        AccomTable selectedItem = AccommodationTableID.getSelectionModel().getSelectedItem();
        int number = selectedItem.getNoColumnID();
        if (selectedItem == null) {
            System.out.println("");
        } else {
            AccommNoID.setText(String.valueOf(number));
        }
    }

    private String[] CleaningStatus = {"Clean", "Not Clean"};
    
    private String[] Area = {"Woodland", "Wild Meadow", "Hilltop", "Lakeview"};
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //GUI intialized
        
        System.out.println("GUI Initialized!");
        

        AreaBox.getItems().addAll(Area);
        CleaningStatusBox.getItems().addAll(CleaningStatus);
        
        NoColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, Integer>("NoColumnID"));
        AccommTypeColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, String>("AccommTypeColumnID"));
        OccupancyColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, String>("OccupancyColumnID"));
        AvailabilityColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, String>("AvailabilityColumnID"));
        StatusColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, String>("StatusColumnID"));
        GuestsColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, Integer>("GuestsColumnID"));
        BreakfastColumnID.setCellValueFactory(new PropertyValueFactory<AccomTable, String>("BreakfastColumnID"));
        
        AreaBox.setOnAction(e -> {
            if (AreaBox.getSelectionModel().getSelectedItem().equals("Hilltop")) {
                AreaDescriptionID.setText("Experience breathtaking panoramic views from the summit of a hill top and bask in the splendor of nature.");
                loadHilltopTable();
                loadHilltopData();
            } else if (AreaBox.getSelectionModel().getSelectedItem().equals("Wild Meadow")) {
                AreaDescriptionID.setText("Step into a world of untamed beauty with a visit to a wild meadow, be surrounded by towering grasses and wildflowers.");
                setCleaningAndBreakfastReq();
                loadWildMeadowTable();
                loadWildMeadowData();
            } else if (AreaBox.getSelectionModel().getSelectedItem().equals("Woodland")) {
                AreaDescriptionID.setText("A woodland area echoing the sound of nature and wildlife, a haven for adventure seekers and nature lovers alike.");
                setCleaningAndBreakfastReq();
                loadWoodlandTable();
                loadWoodlandData();
            } else if (AreaBox.getSelectionModel().getSelectedItem().equals("Lakeview")) {
                AreaDescriptionID.setText("Escape to a serene paradise with a stunning lakeview and gaze out at the still waters of a tranquil lake");
                setCleaningAndBreakfastReq();
                loadLakeviewTable();
                loadLakeviewData();
            }

        });
    }
    public void loadHilltopTable() {
        ObservableList<AccomTable> hilltopList = FXCollections.observableArrayList(
                new AccomTable(1, "Shepherd Hut", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(2, "Shepherd Hut", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(3, "Shepherd Hut", "Unoccupied", "Available", "Clean", 0, "No")
        );
        AccommodationTableID.setItems(hilltopList);
    }

    public void loadWildMeadowTable() {
        ObservableList<AccomTable> wildMeadowList = FXCollections.observableArrayList(
                new AccomTable(1, "Yurt", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(2, "Yurt", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(3, "Yurt", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(4, "Yurt", "Unoccupied", "Available", "Clean", 0, "No")
        );
        AccommodationTableID.setItems(wildMeadowList);
    }

    public void loadWoodlandTable() {
        ObservableList<AccomTable> woodlandList = FXCollections.observableArrayList(
                new AccomTable(1, "Geodesic Dome", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(2, "Geodesic Dome", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(3, "Geodesic Dome", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(4, "Geodesic Dome", "Unoccupied", "Available", "Clean", 0, "No")
        );
        AccommodationTableID.setItems(woodlandList);
    }

    public void loadLakeviewTable() {
        ObservableList<AccomTable> lakeviewList = FXCollections.observableArrayList(
                new AccomTable(1, "Cabin", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(2, "Cabin", "Unoccupied", "Available", "Clean", 0, "No"),
                new AccomTable(3, "Cabin", "Unoccupied", "Available", "Clean", 0, "No")
        );
        AccommodationTableID.setItems(lakeviewList);
    }
    
    public void loadHilltopData() {
        AccommTypeID.setText("Shepherd Hut");
        AccomodatesID.setText("3");
        PricePerNightID.setText("£140");

    }

    public void loadWildMeadowData() {
        AccommTypeID.setText("Yurt");
        AccomodatesID.setText("2");
        PricePerNightID.setText("£110");
    }

    public void loadWoodlandData() {
        AccommTypeID.setText("Geodesic Dome");
        AccomodatesID.setText("2");
        PricePerNightID.setText("£120");
    }

    public void loadLakeviewData() {
        AccommTypeID.setText("Cabin");
        AccomodatesID.setText("4");
        PricePerNightID.setText("£160");
    }

    public void setCleaningAndBreakfastReq() {
        BreakfastNoID.setText("0");
        CleaningNoID.setText("0");
    }
    
    @FXML
    void SelectArea(ActionEvent event) {
        if (AreaBox.getSelectionModel().isSelected(0)) {
            AreaDescriptionID.setText("Woodland description here");
        }
        if  (AreaBox.getSelectionModel().isSelected(1)) {
            AreaDescriptionID.setText("Wild Meadow description here");
        }
        if (AreaBox.getSelectionModel().isSelected(2)) {
            AreaDescriptionID.setText("Hilltop description here");
        }
        if (AreaBox.getSelectionModel().isSelected(3)) {
            AreaDescriptionID.setText("Lakeview description here");
        }
        }
    
    @FXML
    private void CheckedIn(ActionEvent event) {
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

        //Doesnt apply very well but may be fixed to make code shorter
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
        
        if (NumberOfNightsID.getText().length() > 2 || NumberOfNightsID.getText().length() < 1) {
            NumberOfNightsID.setStyle("-fx-border-color:red;");
        } else {
            NumberOfNightsID.setStyle(null);
        }
        
        System.out.println("Checked In!");

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
        
        if (FirstNameID.getText().length() <= 2) {
            FirstNameID.setStyle("-fx-border-color: red;");
        } else {
            FirstNameID.setStyle(null); 
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
        
        if (NumberOfNightsID.getText().length() > 2 || NumberOfNightsID.getText().length() < 1) {
            NumberOfNightsID.setStyle("-fx-border-color:red;");
        } else {
            NumberOfNightsID.setStyle(null);
        }
        
        System.out.println("Checked Out!");
    }
}
