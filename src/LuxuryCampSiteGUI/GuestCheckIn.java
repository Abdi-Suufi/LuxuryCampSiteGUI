/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuxuryCampSiteGUI;

/**
 *
 * @author abdis
 */
public class GuestCheckIn {
    int NumberCol;
    String comtype;
    String occupancys;
    String availabilitys;
    String Statuss;
    String Guestss;
    boolean Breakfastss;

    public GuestCheckIn(int NumberCol, String comtype, String occupancys, String availabilitys, String Statuss, String Guestss, boolean Breakfastss) {
        this.NumberCol = NumberCol;
        this.comtype = comtype;
        this.occupancys = occupancys;
        this.availabilitys = availabilitys;
        this.Statuss = Statuss;
        this.Guestss = Guestss;
        this.Breakfastss = Breakfastss;
    }

    public int getNumberCol() {
        return NumberCol;
    }

    public String getComtype() {
        return comtype;
    }

    public String getOccupancys() {
        return occupancys;
    }

    public String getAvailabilitys() {
        return availabilitys;
    }

    public String getStatuss() {
        return Statuss;
    }

    public String getGuestss() {
        return Guestss;
    }

    public boolean getBreakfastss() {
        return Breakfastss;
    }
   
}
