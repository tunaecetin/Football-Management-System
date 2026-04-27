/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CybertruckProje;

public class Contract {

    private Player player;
    private Team team;
    private String type;
    private double value;

    public Contract(Player player, Team team, String type, double value) {
        this.player = player;
        this.team = team;
        this.type = type;
        this.value = value;
    }
    
    public Player getPlayer(){
    return player;
    }
    
    public Team getTeam(){
        return team;
    }
    
    public String getType(){
        return type;
    }
    
    public double getValue(){
        return value;
    }
}
