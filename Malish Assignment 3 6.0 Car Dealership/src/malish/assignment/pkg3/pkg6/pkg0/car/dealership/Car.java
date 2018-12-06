/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malish.assignment.pkg3.pkg6.pkg0.car.dealership;
import java.awt.Color;
/**
 *
 * @author RedPanda13
 */
public class Car extends Vehicle
{

    private static int carCount;
    private int passengers;
    private int doors;
    //private String carType;
    

 
    //construcor
    public Car(String make, String model, Color color, double purchasePrice)
    {

              super(make, model, color, purchasePrice);
      //incraments count
      carCount++;
             
    }
    
    //Override for Commission (car)
    
    
    //gets and sets Passenger and door variables
    public void setPassengers(int passengers){this.passengers = passengers;}
    public int getPassengers(){return this.passengers;}
    
    public void setDoors(int doors){this.doors = doors;}
    public int getDoors(){return this.doors;}
    
    
    private String type = "";
    public String getType(){return this.type;}
    public void setType(String s){this.type = s;}
    
    
    
    
    

    









}
