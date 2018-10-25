package teamwork;

import java.util.ArrayList;

public class Team {
    private int teamId; 
    private String name;

    public Team(int teamId, String name) {
        this.teamId = teamId;
        this.name = name;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Team ID: " + teamId + "\nTeamname: " + name;
    }

    public ArrayList<User> getMembers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}