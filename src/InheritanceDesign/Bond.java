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
public class Bond extends Security {
    public Bond(){}
    public Bond(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setValue(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    @Override
    public double getAssetValue(){
        return this.price * this.quantity;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append(name);
        result.append(", Bond, Amount Owned: ");
        result.append(quantity);
        result.append(", Price: $");
        result.append(price);
        result.append(", Value: $");
        result.append(getAssetValue());
        
        return result.toString();
    }
}
