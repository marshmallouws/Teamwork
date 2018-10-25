package teamwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataAccessObject_impl {
    private DBConnector connector = null;

    DataAccessObject_impl(DBConnector connector) {
        this.connector = connector;
    }

    public ArrayList<User> getTeamMembers(int team_id) {
        String query = "SELECT user.user_id, username, password, admin FROM user "
                        + "JOIN team_member ON team_member.user_id = user.user_id "
                        + "WHERE team_member.team_id = " + new Integer(team_id).toString() + ";";
        
        ArrayList<User> users = new ArrayList<>();
        int userId = 0; 
        String username = "";
        boolean admin = false; 
        int password = 0; 
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                userId = rs.getInt("user_id");
                username = rs.getString("username");
                password = rs.getInt("password");
                admin = rs.getBoolean("admin");
                
                users.add(new User(userId, username, password, admin));
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
       
    }

    
    public ArrayList<Team> getTeams() {
        
        String query = "SELECT * FROM team;";
        
        int teamId = 0; 
        String teamName = "";
        ArrayList<Team> teams = new ArrayList<>();
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                teamId = rs.getInt("team_id");
                teamName = rs.getString("teamname");
                
                teams.add(new Team(teamId, teamName));
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return teams;
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public Team getTeam(int id) {
        
        String query = "SELECT * FROM team WHERE team_id =" + new Integer(id).toString() + ";";
        Team team = null;
        
        int teamId = 0;
        String teamName = "";
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                teamId = rs.getInt("team_id");
                teamName = rs.getString("teamname");
                
                team = new Team(teamId, teamName);
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return team;
    }


    public Team getTeam(String teamname) {
        String query = "SELECT * FROM team WHERE teamname = '" + teamname + "';";
        Team team = null;
        
        int teamId = 0;
        String teamName = "";
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                teamId = rs.getInt("team_id");
                teamName = rs.getString("teamname");
                
                team = new Team(teamId, teamName);
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return team;
    }

    
    public ArrayList<User> getUsers() {
        String query = "SELECT * FROM user";
        
        ArrayList<User> users = new ArrayList<>();
        int userId = 0; 
        String username = "";
        boolean admin = false; 
        int password = 0; 
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                userId = rs.getInt("user_id");
                username = rs.getString("username");
                password = rs.getInt("password");
                admin = rs.getBoolean("admin");
                
                users.add(new User(userId, username, password, admin));
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public User getUser(int id) {
        
        String query = "SELECT * FROM user WHERE user_id =" + new Integer(id).toString() + ";";
        User user = null;
        
        int userId = 0; 
        String username = "";
        boolean admin = false; 
        int password = 0; 
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                userId = rs.getInt("user_id");
                username = rs.getString("username");
                password = rs.getInt("password");
                admin = rs.getBoolean("admin");
                
                user = new User(userId, username, password, admin);
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    
    public User getUser(String username) {
        String query = "SELECT * FROM user WHERE username = '" + username + "';";
        User user = null;
        
        int userId = 0; 
        String uname = "";
        boolean admin = false; 
        int password = 0; 
        
        try {
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                userId = rs.getInt("user_id");
                uname = rs.getString("username");
                password = rs.getInt("password");
                admin = rs.getBoolean("admin");
                
                user = new User(userId, uname, password, admin);
            }
            
        } catch (SQLException ex) {
            System.out.println("Hej");
            //Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
 
}


