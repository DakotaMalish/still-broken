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
public class Truck extends Vehicle
{

    private static int truckCount;
    private double truckWeight;
    private double towingLength;
    private int truckPassengers;
    
    
    
    
    
    //construcor
    public Truck(String make, String model, Color color, double purchasePrice, double askingPrice)
    {

              super(make, model, color, purchasePrice);

        truckCount++;
    }

    public void setTruckWeight(double truckWeight){this.truckWeight = truckWeight;}
    public double getTruckWeight(){return this.truckWeight;}
    
    public void setTowingLength(double towingLength){this.towingLength = towingLength;}
    public double getTowingLength(){return this.towingLength;}
    
    public void setTruckPassengers(int truckPassengers){this.truckPassengers = truckPassengers;}
    public int getTruckPassengers(){return this.truckPassengers;}
    
    private String type = "";
    public String getType(){return this.type;}
    public void setType(String s){this.type = s;}
    

    //Override for Commission (truck)
  






}
