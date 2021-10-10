/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_car;

import java.util.Date;

/**
 *
 * @author mhetr
 */
public class Assignment2_Car {

    private String transitLevel;
    private String modelNo;
    private String serialNo;
    private String brand;
    private String city;
    private String maintenanceCertificate;
    private int manufactureYear;
    private String availablity;
    private double cost;
    private Date timeUpdate;
    private String registeredwithUber;
    private int seatCount;
    private String Date;
    private int minSeat;
    private int maxSeats;
    public Assignment2_Car(String transitLevel, String brand, String modelNo, String serialNo, String color, String city, String engineNumber, int odometerReading, int minSeat, int maxSeats, String maintenanceCertificate, int manufactureYear, String availablity, double cost, String registeredwithUber, int seatCount)
    {
        this.availablity = availablity;
        this.cost = cost;
        this.registeredwithUber = registeredwithUber;
        this.seatCount = seatCount;
        this.transitLevel = transitLevel;
        
        this.maintenanceCertificate = maintenanceCertificate;
        this.manufactureYear = manufactureYear;
        
        this.brand = brand;
        this.modelNo = modelNo;
        this.serialNo = serialNo;
        this.city = city;
        this.minSeat = minSeat;
        this.maxSeats = maxSeats;
        
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    
    public String getregisteredwithUber() {
        return registeredwithUber;
    }

    public void setregisteredwithUber(String registeredwithUber) {
        this.registeredwithUber = registeredwithUber;
    }

    public String getTransitLevel() {
        return transitLevel;
    }

    public void setTransitLevel(String transitLevel) {
        this.transitLevel = transitLevel;
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getmodelNo() {
        return modelNo;
    }

    public void setmodelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getserialNo() {
        return serialNo;
    }

    public void setserialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    
    
    public double getPrice() {
        return cost;
    }

    public void setPrice(double cost) {
        this.cost = cost;
    }

    public String getmaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setmaintenanceCertificate(String maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public String getAvailablity() {
        return availablity;
    }

    public void setAvailablity(String availablity) {
        this.availablity = availablity;
    }
    
    public Assignment2_Car() {
        this.timeUpdate = new Date();
    }
    
    public Date getTimeUpdate()  {
        return timeUpdate;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    public int getMinSeat() {
        return minSeat;
    }

    public void setMinSeat(int minSeat) {
        this.minSeat = minSeat;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    
    
    @Override
    public String toString(){
       return brand;
      
    }
    
}
