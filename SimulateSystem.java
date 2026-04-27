/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CybertruckProje;

import java.util.Scanner;

public class SimulateSystem {

    public static void main(String[] args) {
        TransferBoard tb = new TransferBoard();
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tFootball Manager:");

        System.out.println("[1] List all Players in the system.");
        System.out.println("[2] List all Teams in the system.");
        System.out.println("[3] List all teamless players");
        System.out.println("[4] Establish a contract between a player and a team.");
        System.out.println("[5] Terminate the existing contract between a player and a team.");
        System.out.println("[6] Exit.");
        System.out.println("");
        System.out.print("Enter your choice:");

        int menu = input.nextInt();

        if (menu > 0 && menu <= 6) {
            while (menu <= 5 && menu > 0) {

                switch (menu) {
                    case 1:
                        tb.printPlayerList();
                        break;
                    case 2:
                        tb.printTeams();
                        break;
                    case 3:
                        tb.printTeamlessPlayerList();
                        break;
                    case 4:
                        System.out.print("Please enter name:");
                        String name = input.next();
                        System.out.print("Please enter team name:");
                        String teamname = input.next();
                        System.out.print("Please enter contract type (Rented or Permanent):");
                        String contractype = input.next();
                        System.out.print("Please enter value:");
                        double value = input.nextDouble();
                        System.out.println(tb.makeContract(name, teamname, contractype, value));

                        break;
                    case 5:
                        System.out.print("Please enter name:");
                        String name1 = input.next();
                        System.out.print("Please enter team name:");
                        String teamname1 = input.next();
                        tb.terminateContract(name1, teamname1);
                        break;

                }
                System.out.println("\n\tFootball Manager:");

                System.out.println("[1] List all Players in the system.");
                System.out.println("[2] List all Teams in the system.");
                System.out.println("[3] List all teamless players");
                System.out.println("[4] Establish a contract between a player and a team.");
                System.out.println("[5] Terminate the existing contract between a player and a team.");
                System.out.println("[6] Exit.");
                System.out.println("");
                System.out.print("Enter your choice:");
                menu = input.nextInt();

            }
            if (menu == 6) {
                System.out.println("\t\nContracted Players");
                tb.inEndCPlayer();
                System.out.println("\t\nTeams");
                tb.inEndEachTeam();
                System.out.println("\t\nWithout Contract Players");
                tb.inEndWCPlayer();
            }
        } else {
            System.out.println("Invalid Choose!");
        }

    }

}
