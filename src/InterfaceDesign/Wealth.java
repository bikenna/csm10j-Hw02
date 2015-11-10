/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDesign;
import InterfaceDesign.*;
import java.util.Vector;
import java.util.Scanner;
/**
 *
 * @author brianobioha
 */
public class Wealth {
    public void addAsset(Asset toAdd){
        assets.add(toAdd);
    }
    public void addDebt(Debt toAdd){
        debts.add(toAdd);
    }
    
    public double getNetWorth(){
        return (this.getTotalAssets() - this.getTotalDebts());
    }
    
    public double getTotalDebts(){
        double totalDebt = 0;
        for(int i = 0; i < debts.size(); i++){
            if(debts.get(i) instanceof Debt){
                totalDebt += ((Debt)debts.get(i)).getDebtValue();
            }
        }
        return totalDebt;
    }
    public double getTotalAssets(){
        double sum = 0;
        for(int i = 0; i < assets.size(); i++){
          sum += assets.get(i).getAssetValue();
        }
        return sum;
    }
    
    public String getAssetSummary(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < assets.size(); i++){
            result.append(assets.get(i).toString());
            result.append("\n");
        }
        return result.toString();
    }
    
    public void DisplayAll(){
        for(int i = 0; i < assets.size(); i++){
            System.out.println(assets.get(i));
        }
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
    
    private Vector<Asset> assets = new Vector<Asset>();
    private Vector<Debt> debts = new Vector<Debt>();
}
