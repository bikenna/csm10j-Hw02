/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceDesign;
import InheritanceDesign.*;
import java.util.Vector;
import java.util.Scanner;
/**
 *
 * @author brianobioha
 */
public class Wealth{
    public void addAsset(Asset asset){
        list.add(asset);
    }
    public double getNetWorth(){
        
        return (getTotalAssets() - getTotalDebts());
    }
    
    public double getTotalDebts(){
        double totalDebt = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Property){
                totalDebt += ((Property)list.get(i)).getDebtAmount();
            }
        }
        return totalDebt;
    }
    
    public double getTotalAssets(){
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
          sum += list.get(i).getAssetValue();
        }
        return sum;
    }
    
    public void displayAndChooseAssets(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).name);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("\nSelect Asset for more information: ");
        String selected = input.next();
        
        for(int i = 0; i < list.size(); i++){
            if((list.get(i).name).equals(selected)){
                System.out.println(list.get(i));
            }
        }
    }
    
    public String getAssetSummary(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            result.append(list.get(i).toString());
            result.append("\n");
        }
        return result.toString();
    }
    
    @Override 
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Total Net Worth: $");
        result.append(getNetWorth());
        
        result.append("; Assets: $");
        result.append(getTotalAssets());
        
        result.append(", Debt: $");
        result.append(getTotalDebts());
        return result.toString();
    }

    private Vector<Asset> list = new Vector<Asset>();
}
