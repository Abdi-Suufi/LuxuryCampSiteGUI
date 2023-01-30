/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author abdis
 */
public class Bookings {
    int NumberOfGuests;
    int NumberOfNights;
    float PricePerNight;

    public int getNumberOfGuests() {
        return NumberOfGuests;
    }

    public void setNumberOfGuests(int NumberOfGuests) {
        this.NumberOfGuests = NumberOfGuests;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int NumberOfNights) {
        this.NumberOfNights = NumberOfNights;
    }

    public float getPricePerNight() {
        return PricePerNight;
    }

    public void setPricePerNight(float PricePerNight) {
        this.PricePerNight = PricePerNight;
    }

    public String getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckInDate(String CheckInDate) {
        this.CheckInDate = CheckInDate;
    }
    String CheckInDate;
}