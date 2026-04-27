/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CybertruckProje;

import java.util.ArrayList;

public class TransferBoard {

    private ArrayList<Contract> c1 = new ArrayList();
    private ArrayList<Player> p1 = new ArrayList();
    private ArrayList<Team> t1 = new ArrayList();

    public TransferBoard() {
        populatePlayers();
        populateTeams();
        contractedPlayers();
    }

    public void populatePlayers() {
        p1.add(new Player("Muslera", 1, "Goalkeeper"));
        p1.add(new Player("Kaan", 20, "Defence"));
        p1.add(new Player("Toreira", 34, "Midfield"));
        p1.add(new Player("Icardi", 9, "Forward"));
        p1.add(new Player("Kerem", 7, "Midfield"));
        p1.add(new Player("Abdulkerim", 17, "Defence"));
        p1.add(new Player("Oliveira", 20, "Midfield"));
        p1.add(new Player("Mertens", 10, "Midfield"));
        p1.add(new Player("Bakambu", 9, "Forward"));
        p1.add(new Player("Nelsson", 4, "Defence"));
        p1.add(new Player("Boey", 2, "Defence"));
        p1.add(new Player("Angelino", 3, "Defence"));
        p1.add(new Player("Davinson", 6, "Defence"));
        p1.add(new Player("Zaha", 14, "Forward"));
        p1.add(new Player("Gunay", 19, "Goalkeeper"));
        p1.add(new Player("Tete", 27, "Forward"));
        p1.add(new Player("Ziyech", 35, "Midfield"));
        p1.add(new Player("Baris", 53, "Midfield"));
        p1.add(new Player("Hamza", 81, "Midfield"));
        p1.add(new Player("Ndombele", 91, "Midfield"));
        p1.add(new Player("Kazimcan", 88, "Defence"));
        p1.add(new Player("Jankat", 50, "Goalkeeper"));
        p1.add(new Player("Pascal", 40, "Forward"));
        p1.add(new Player("Bonucci", 12, "Defence"));
        p1.add(new Player("Alex", 92, "Forward"));
        p1.add(new Player("Ugurcan", 17, "Goalkeeper"));
        p1.add(new Player("Visca", 19, "Defence"));
        p1.add(new Player("Enis", 23, "Defence"));
        p1.add(new Player("Gizem", 52, "Midfield"));
        p1.add(new Player("Ozay", 51, "Forward"));
        p1.add(new Player("Berke", 50, "Forward"));
        p1.add(new Player("Tuna", 22, "Forward"));
        p1.add(new Player("Mert", 99, "Forward"));
        p1.add(new Player("Kohn", 15, "Defence"));
        p1.add(new Player("Okan", 36, "Forward"));
    }

    public void populateTeams() {
        t1.add(new Team("GS", "Galatasaray"));
        t1.add(new Team("FB", "Fenerbahce"));
        t1.add(new Team("TS", "Trabzonspor"));
        t1.add(new Team("ISIK", "Isikspor"));
    }

    public void contractedPlayers() {
        makeContract("Muslera", "GS", "Permanent", 50000);
        makeContract("Kaan", "GS", "Permanent", 35000);
        makeContract("Toreira", "GS", "Permanent", 60000);
        makeContract("Icardi", "GS", "Permanent", 1500000);
        makeContract("Kerem", "GS", "Permanent", 70000);
        makeContract("Abdulkerim", "GS", "Permanent", 50000);
        makeContract("Oliveira", "GS", "Permanent", 50000);
        makeContract("Mertens", "GS", "Permanent", 350000);
        makeContract("Bakambu", "GS", "Permanent", 30000);
        makeContract("Nelsson", "GS", "Permanent", 150000);
        makeContract("Boey", "GS", "Permanent", 350000);
        makeContract("Angelino", "GS", "Permanent", 50000);
        makeContract("Davinson", "GS", "Permanent", 250000);
        makeContract("Zaha", "GS", "Permanent", 350000);
        makeContract("Gunay", "GS", "Permanent", 45000);
        makeContract("Tete", "GS", "Permanent", 360000);
        makeContract("Ziyech", "GS", "Permanent", 50000);
        makeContract("Baris", "GS", "Permanent", 53000);
        makeContract("Hamza", "GS", "Permanent", 50000);
        makeContract("Ndombele", "GS", "Permanent", 850000);
        makeContract("Kazimcan", "GS", "Permanent", 50000);
        makeContract("Jankat", "GS", "Permanent", 50000);
        makeContract("Bonucci", "FB", "Permanent", 50000);
        makeContract("Alex", "FB", "Permanent", 50000);
        makeContract("Ugurcan", "TS", "Permanent", 50000);
        makeContract("Visca", "TS", "Permanent", 50000);
        makeContract("Enis", "TS", "Permanent", 50000);
        makeContract("Gizem", "ISIK", "Permanent", 250000);
        makeContract("Ozay", "ISIK", "Permanent", 250000);
        makeContract("Berke", "ISIK", "Permanent", 50000);
        makeContract("Tuna", "ISIK", "Permanent", 190000);
        makeContract("Mert", "ISIK", "Permanent", 190000);

    }

    public String makeContract(String playerName, String teamName, String contractType, double contractValue) {
        Player oyuncu = null;
        Team takim = null;
        Contract sozlesme = null;

        boolean unknownPlayer = true;
        boolean unknownTeam = true;
        boolean contractexist = false;

        for (int i = 0; i < p1.size(); i++) {
            if (playerName.equals(p1.get(i).getName())) {
                oyuncu = p1.get(i);
                unknownPlayer = false;
                break;
            }

        }

        for (int i = 0; i < t1.size(); i++) {
            if (teamName.equals(t1.get(i).getShortName())) {
                takim = t1.get(i);
                unknownTeam = false;
                break;
            }
        }

        if (unknownPlayer) {
            return "Unknown Player Data!";
        }
        if (unknownTeam) {
            return "Unknown Team Data!";
        }
        if (oyuncu.getCurrentTeam() != null) {
            if (oyuncu.getCurrentTeam().getShortName().equals(teamName)) {
                return "Existing Contract";
            }
        }

        if (takim.getSize() >= takim.getMaxteamsize()) {
            return "Exceeding Max Numbers of Player!";
        }

        if (oyuncu.getContractType() != null) {
            if (contractType.equals("Permenant") && oyuncu.getContractType().equals("Rented")
                    || contractType.equals("Rented") && oyuncu.getContractType().equals("Rented")) {
                return "Contract not possible";
            }
        }

        if (oyuncu.getCurrentTeam() == null && contractType.equals("Rented")) {
            return "Invalid Contract Type!";
        } else {

            if (oyuncu.getCurrentTeam() != null) {
                oyuncu.getCurrentTeam().minusSize();
                oyuncu.getCurrentTeam().minusSetTotalValue(oyuncu.getMarketValue());
            }
            oyuncu.setMarketValue(contractValue);
            oyuncu.setPreviousTeam(oyuncu.getCurrentTeam());
            oyuncu.setCurrentTeam(takim);
            takim.plusSize();
            takim.setTotalValue(contractValue);
            oyuncu.setContractType(contractType);
            c1.add(new Contract(oyuncu, takim, contractType, contractValue));
            return "Successfully Contracted!";

        }

    }

    public void terminateContract(String playerName, String teamName) {
        Contract sozlesme = null;
        for (int i = 0; i < c1.size(); i++) {
            if (c1.get(i).getPlayer().getName().equals(playerName) && c1.get(i).getTeam().getShortName().equals(teamName)) {
                sozlesme = c1.get(i);
            }
        }
        if (sozlesme.getType().equals("Rented")) {
            sozlesme.getPlayer().getCurrentTeam().minusSize();
            sozlesme.getPlayer().setCurrentTeam(sozlesme.getPlayer().getPreviousTeam());
            sozlesme.getPlayer().getCurrentTeam().plusSize();
        } else if (sozlesme.getType().equals("Permanent")) {
            sozlesme.getPlayer().getCurrentTeam().minusSize();
            sozlesme.getPlayer().setCurrentTeam(null);
        } else {
            System.out.println("Invalid Choose");
        }
    }

    public void printPlayerList() {
        for (int i = 0; i < p1.size(); i++) {
            System.out.println(p1.get(i).getName() + " " + p1.get(i).getBackNumber() + " " + p1.get(i).getPosition() + " " + p1.get(i).getPreviousTeam());
        }
    }

    public void printTeamlessPlayerList() {

        for (int i = 0; i < p1.size(); i++) {
            if (p1.get(i).getCurrentTeam() == null) {
                System.out.println(p1.get(i).getName() + " " + p1.get(i).getBackNumber() + " " + p1.get(i).getPosition());
            }
        }
    }

    public void printTeams() {
        for (int i = 0; i < t1.size(); i++) {
            System.out.println(t1.get(i).getShortName() + " " + t1.get(i).getFullName() + " " + t1.get(i).getSize() + " " + t1.get(i).getTotalValue());
        }
    }

    public void inEndCPlayer() {

        Contract sozlesme;
        for (int i = 0; i < c1.size(); i++) {
            System.out.println(c1.get(i).getPlayer().getName() + ": " + c1.get(i).getPlayer().getMarketValue() + " " + c1.get(i).getPlayer().getCurrentTeam().getShortName());
        }
    }

    public void inEndEachTeam() {
        for (int i = 0; i < t1.size(); i++) {
            System.out.println(t1.get(i).getShortName() + ": " + t1.get(i).getTotalValue() + " " + t1.get(i).getSize());
        }
    }

    public void inEndWCPlayer() {
        for (int i = 0; i < p1.size(); i++) {
            if (p1.get(i).getCurrentTeam() == null) {
                System.out.println(p1.get(i).getName() + " " + p1.get(i).getBackNumber() + " " + p1.get(i).getPosition());
            }
        }
    }
}
