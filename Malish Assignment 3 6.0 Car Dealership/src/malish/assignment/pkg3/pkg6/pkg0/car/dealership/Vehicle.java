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
public class Vehicle
{

    private String make;
    private String model;
    private Color color;
    private double purchasePrice;

    private double customOffer;
    private static int vehicleCount;
    //private boolean customerOffer = false;
  

    //construcor
    public Vehicle(String make, String model, Color color, double purchasePrice)
    
    {
     vehicleCount++;
     //refers to variables in class
     this.model = model;
     this.make = make;
     this.color = color;
     this.purchasePrice = purchasePrice;
    
     
     
    }
    //sets up for GUI to grab information
    public String getMake(){return this.make;}
    public void setMake(String make){this.make = make;}
    
    public String getModel(){return this.model;}
    public void setModel(String model){this.model = model;}
    
    public Color getColor(){return this.color;}
    public void setColor(Color color){this.color = color;}
    
    public double getPurchasePrice(){return this.purchasePrice;}
    public void setPurchasePrice(double purchasePrice){this.purchasePrice = purchasePrice;}
    
    
        
    //checks the deal agains the cars for sell
    


    //Removes Vehicles from ArrayList
    public void remove()
    {
        
        
    }
    
    
    
    //Determins how much the sailsmen make
    public double commission()
    {
      return 0;
    
    }
        
    }
    









