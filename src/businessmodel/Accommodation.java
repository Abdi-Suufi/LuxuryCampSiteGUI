/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author MJB
 */
public class Accommodation {
String Type;
Boolean Occupance;
Boolean Availability;
String CleaningStatus;
Boolean BreakfastRequired;
int RoomNumber;
String Description;

public Accommodation(String Type, Boolean Occupance, Boolean Availability, String CleaningStatus, Boolean BreakfastRequired,int RoomNumber, String Description){
this.Type = Type;
this.Occupance = Occupance;
this.Availability = Availability;
this.CleaningStatus = CleaningStatus;
this.BreakfastRequired = BreakfastRequired;
this.RoomNumber = RoomNumber;
this.Description = Description;
}
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Boolean getOccupance() {
        return Occupance;
    }

    public void setOccupance(Boolean Occupance) {
        this.Occupance = Occupance;
    }

    public Boolean getAvailability() {
        return Availability;
    }

    public void setAvailability(Boolean Availability) {
        this.Availability = Availability;
    }

    public String getCleaningStatus() {
        return CleaningStatus;
    }

    public void setCleaningStatus(String CleaningStatus) {
        this.CleaningStatus = CleaningStatus;
    }

    public Boolean getBreakfastRequired() {
        return BreakfastRequired;
    }

    public void setBreakfastRequired(Boolean BreakfastRequired) {
        this.BreakfastRequired = BreakfastRequired;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
