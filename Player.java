/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CybertruckProje;


public class Player {

    private final int backNumber;
    private final String name;
    private String position;
    private double marketValue;
    private Team currentTeam;
    private Team previousTeam;
    private String ContractT;

    public Player(String name, int backNumber, String position) {
        this.name = name;
        this.backNumber = backNumber;
        this.position = position;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getMarketValue() {
        return marketValue;
    }
    
    public Team getCurrentTeam() {
        return currentTeam;
    }

    public Team getPreviousTeam() {
        return previousTeam;
    }

    public void setCurrentTeam(Team ct) {
        currentTeam = ct;
    }

    public void setContractType(String ContractT) {
        this.ContractT = ContractT;
    }

    public String getContractType() {
        return ContractT;
    }

    public void setPreviousTeam(Team pt) {
        previousTeam = pt;
    }
    
    public void setMarketValue(double mv){
       marketValue = mv; 
    }
    
    public String toString(){
        return name +", " + "backnumber=" + backNumber + ", " + "position=" + position + ", " + "marketvalue=" + marketValue;
    }
}
