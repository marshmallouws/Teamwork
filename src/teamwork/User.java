package teamwork;

public class User {
    private int id; 
    private String username; 
    private int password;
    private boolean admin; 
    
    public User(int id, String username, int password, boolean admin){
        this.id = id;
        this.username = username; 
        this.password = password;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public int getPassword() {
        return password;
    }


    public boolean isAdmin() {
        return admin;
    }
    
    @Override
    public String toString(){
        return "ID: " + id 
                +  "\nUsername: " + username 
                + "\nPassword: " + password 
                + "\nAdmin: " + admin; 
    }
}