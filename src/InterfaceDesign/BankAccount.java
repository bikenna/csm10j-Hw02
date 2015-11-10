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
public class BankAccount implements Asset {
    double value;
    String name;
    public BankAccount(){}
    
    public BankAccount(double bankValue){
        this.value = bankValue;
    }
    
    public BankAccount(String name, double bankValue){
        this.value = bankValue;
        this.name = name;
    }
    @Override
    public double getAssetValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }
    public void setValue(String name, double value){
        this.name = name;
        this.value = value;
    }
    
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append("Bank Account Value: $");
        result.append(value);
        return result.toString();
    }
}
