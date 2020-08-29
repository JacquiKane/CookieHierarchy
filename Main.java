/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_inheritance;

import java.util.ArrayList;

/**
 *
 * @author Annie Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Show How Inheritance Works!
        // Superclass SoccerPlayer is inherited ... by subclass MidfieldSoccerPlayer
        MidfieldSoccerPlayer player = 
                new MidfieldSoccerPlayer(1, .85, "Jamie Vardy", 31, "mid-forward", "Leicester");
        String playerName = player.getName();
        System.out.println("Name : " + playerName);

            SoccerClub club = new SoccerClub();
            
            ArrayList<SoccerPlayer> currentTeam = club.getTeam();
            currentTeam.add(player);
            
            club.displayPlayers();
            
            

    }
    
}
