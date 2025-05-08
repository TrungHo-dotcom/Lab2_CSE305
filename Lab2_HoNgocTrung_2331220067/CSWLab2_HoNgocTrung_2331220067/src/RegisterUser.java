/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EthanHo
 */
import java.util.ArrayList;
public class RegisterUser {
     private ArrayList<User> listOfUsers;

    public RegisterUser() {
        this.listOfUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public void removeUser(User user) {
        listOfUsers.remove(user);
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }
}
