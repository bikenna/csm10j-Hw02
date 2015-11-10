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
public class House extends Property {
    
    public House(){}
    public House(String name, double homeValue, double debt){
        this.homeValue = homeValue;
        this.debtAmount = debt;
        this.name = name;
    }
    private double homeValue;
    public void setName(String name){
        this.name = name;
    }
    public void setHomeValue(double homeValue){
        this.homeValue = homeValue;
    }
    public void setDebt(double debt){
        this.debtAmount = debt;
    }
    @Override
    public double getAssetValue(){
        return homeValue;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append("Home Value: $");
        result.append(homeValue);
        result.append(", Debt: $");
        result.append(debtAmount);
        return result.toString();
    }
}
