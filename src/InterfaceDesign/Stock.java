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
public class Stock implements Asset {
    double value;
    String name;
    double quantity, price;
    public Stock(){}
    public Stock(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    @Override
    public double getAssetValue(){
        return this.value;
    }
    public void setValue(String name, double price, double quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.value = (price * quantity);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append(name);
        result.append(", Stock, Shares Owned: ");
        result.append(quantity);
        result.append(", Price: $");
        result.append(price);
        result.append(", Value: $");
        result.append(getAssetValue());
        
        return result.toString();
    }
}
