
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CybertruckProje;

public class Team {

    private final String shortName;
    private final String fullName;
    private double totalValue;
    private int size;
    private final int maxteamsize = 22;
    
    public Team(String shortName , String fullName){
        this.shortName=shortName;
        this.fullName=fullName;
    }
    
    public String getShortName(){
       return  shortName;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public double getTotalValue(){
        return totalValue;
    }
    
    public int getSize(){
        return size;
    }
    
    public int getMaxteamsize(){
        return maxteamsize;
    }
    
    public void plusSize(){
        size++;
    }
    
    public void minusSize(){
        size--;
    }
    
    public void setTotalValue(double value){
        totalValue += value;
    }
    
    public void minusSetTotalValue(double value){
        totalValue -= value;
    }
    
    public String toString(){
        return shortName +", "+ "name="+fullName + ", " +  "value:" + totalValue + ", " + size;
        
    }
}
