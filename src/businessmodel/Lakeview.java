/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author abdis
 */
public class Lakeview {
    String type;
    int number;
    int accomodates;
    int pricepernight;

    public Lakeview(String type, int number, int accomodates, int pricepernight) {
        this.type = type;
        this.number = number;
        this.accomodates = accomodates;
        this.pricepernight = pricepernight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAccomodates() {
        return accomodates;
    }

    public void setAccomodates(int accomodates) {
        this.accomodates = accomodates;
    }

    public int getPricepernight() {
        return pricepernight;
    }

    public void setPricepernight(int pricepernight) {
        this.pricepernight = pricepernight;
    }
    
}
