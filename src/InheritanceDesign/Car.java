/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceDesign;

/**
 *
 * @author brianobioha
 */
public class Car extends Property {
    
    public Car(){}
    public Car(String name, double carValue, double debt){
        this.carValue = carValue;
        this.debtAmount = debt;
        this.name = name;
    }
   
    private double carValue;
    public void setName(String name){
        this.name = name;
    }
    public void setcCarValue(double value){
        carValue = value;
    }
    public void setDebt(double debt){
        this.debtAmount = debt;
    }
    @Override
    public double getAssetValue(){
        return carValue;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append(name);
        result.append(", Car, Value: $");
        result.append(carValue);
        result.append(", Debt: $");
        result.append(debtAmount);
        return result.toString();
    }
}
