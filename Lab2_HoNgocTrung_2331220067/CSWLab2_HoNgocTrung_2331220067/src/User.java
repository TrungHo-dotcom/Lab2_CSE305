/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EthanHo
 */
public class User {
    private String userID;
    private String password;
    private String email;
    private String userType;

    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    // Getters
    public String getUserID() { return userID; }
    public String getEmail() { return email; }
    public String getUserType() { return userType; }

    // Setters
    public void setEmail(String email) { this.email = email; }
    public void setUserType(String userType) { this.userType = userType; }
}
