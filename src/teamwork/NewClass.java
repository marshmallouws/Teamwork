/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamwork;

import java.util.ArrayList;

/**
 *
 * @author Annika Ehlers
 */
public class NewClass {
    
    public static void main(String[] args) throws Exception {
        DBConnector c = new DBConnector();
        DataAccessObject_impl dao = new DataAccessObject_impl(c);
        
       
        System.out.println("--------------------------------------------");
        
        System.out.println("            Get team members");
        ArrayList<User> u = dao.getTeamMembers(1);
        
        for(User us: u){
            System.out.println(us.toString());
        }
        
        System.out.println("--------------------------------------------");
        
        
        System.out.println("            Get all teams");
        ArrayList<Team> t = dao.getTeams(); 
        
        for(Team team: t){
            System.out.println(team.toString());
        }
        
        System.out.println("--------------------------------------------");
        
        System.out.println("            Get team from team id");
        System.out.println("Team 1");
        System.out.println(dao.getTeam(1).toString());
        
        System.out.println("--------------------------------------------");
        
        System.out.println("            Get users");
        
        ArrayList<User> users = dao.getUsers();
        
        for(User us: users){
            System.out.println(us.toString());
        }
        
        System.out.println("--------------------------------------------");
        
        System.out.println("            Get team from name");
        System.out.println(dao.getTeam("A").toString());
        
        System.out.println("--------------------------------------------");

        
        
        System.out.println("            Get user from id");
        System.out.println(dao.getUser(1).toString());
        
        System.out.println("--------------------------------------------");
        
        System.out.println("            Get user from username");
        System.out.println(dao.getUser("Onkel Joakim").toString());
        
        System.out.println("--------------------------------------------");
        
    }
    
   
    
}
