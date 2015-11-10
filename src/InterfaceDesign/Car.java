/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDesign;

/**
 *
 * @author brianobioha
 */
public class Car implements Asset, Debt {
    double value;
    String name;
    double debtValue;
    public Car(){}
    public Car(String name, double carValue, double debt){
        value = carValue;
        debtValue = debt;
        this.name = name;
    }
    @Override
    public double getAssetValue(){
        return this.value;
    }
    public void setValue(String name, double value){
        this.name = name;
        this.value = value;
    }
    //debt
    @Override
    public double getDebtValue(){
        return this.debtValue;
    }
    public void setDebtValue(double val){
        this.debtValue = value;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append(name);
        result.append(", Car, Value: $");
        result.append(value);
        result.append(", Debt: $");
        result.append(debtValue);
        return result.toString();
    }
}
