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
public class BankAccount extends Asset {
    
    public BankAccount(){}
    
    public BankAccount(double bankValue){
        this.bankValue = bankValue;
    }
    
    public BankAccount(String name, double bankValue){
        this.bankValue = bankValue;
        this.name = name;
    }
    
    private double bankValue;
    public void setName(String name){
        this.name = name;
    }
    public void setBankNumber(double value){
        bankValue = value;
    }
    @Override
    public double getAssetValue(){
        return bankValue;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append("Bank Account Value: $");
        result.append(bankValue);
        return result.toString();
    }
}
