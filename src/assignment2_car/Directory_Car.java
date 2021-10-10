/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_car;

import java.util.ArrayList;

/**
 *
 * @author mhetr
 */
public class Directory_Car {
    
    
    private ArrayList<Assignment2_Car> carList;

    public Directory_Car() {
        this.carList=new ArrayList<Assignment2_Car>();   
    }

    public ArrayList<Assignment2_Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Assignment2_Car> carList) {
        this.carList = carList;
    }
    

    public Assignment2_Car addCar(){
        Assignment2_Car car = new Assignment2_Car();
        carList.add(car);
        return car;
    }
    
    public void deleteCar(Assignment2_Car car){
    carList.remove(car);
            
    }
    
    public ArrayList<Assignment2_Car> manufactureYearCar(int manufactureYear ) 
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getManufactureYear()==(manufactureYear))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    public ArrayList<Assignment2_Car> cityCarlist(String city)
    {
        ArrayList<Assignment2_Car> list2= new ArrayList<Assignment2_Car>();
        for(Assignment2_Car car: this.getCarList())
        {
            if(car.getCity().equalsIgnoreCase(city) && car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
            }
            
        }return list2;
    }
    
    
    
     public ArrayList<Assignment2_Car> brandCarList(String brand)
    {
        ArrayList<Assignment2_Car> list2= new ArrayList<Assignment2_Car>();
        for(Assignment2_Car car: this.getCarList())
        
         {
             if(car.getbrand().equalsIgnoreCase(brand))
             {
                 list2.add(car);
                 
             }
             
        }
        return list2;
    }
    
   

     
     
     public ArrayList<Assignment2_Car> modelNoList(String modelNo)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getmodelNo().equalsIgnoreCase(modelNo))
            {
                list2.add(car);
            }
        }
        return list2;
    }
     
    public ArrayList<Assignment2_Car> unavailableCar(String availablity)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getAvailablity().equalsIgnoreCase("No"))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    public ArrayList<Assignment2_Car> serialNoList(String serialNo)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getserialNo().equalsIgnoreCase(serialNo))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    
    
    public ArrayList<Assignment2_Car> firstAvailable(String availablity)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
                break;
            }
        }
        return list2;
    }
    
    public ArrayList<Assignment2_Car> uberUsedCarList(String registeredwithUber)
    {
        
        
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getregisteredwithUber().equalsIgnoreCase(registeredwithUber))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    public ArrayList<Assignment2_Car> expiredCertificate(String maintenanceCertificate)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getmaintenanceCertificate().equalsIgnoreCase(maintenanceCertificate))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    
    public ArrayList<Assignment2_Car> minMaxseatsCount(int minSeat, int maxSeats)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getSeatCount() < maxSeats && car.getSeatCount() > minSeat && car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    
    
    public ArrayList<Assignment2_Car> allAvailable(String availablity)
    {
        ArrayList<Assignment2_Car> list2 = new ArrayList<Assignment2_Car>();
        for (Assignment2_Car car : this.getCarList())
        {
            if(car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    
}
