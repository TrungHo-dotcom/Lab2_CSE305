
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EthanHo
 */
public class Tenant {
    private User user;
    private ArrayList<RentalContract> listOfContracts;

    public Tenant(User user) {
        this.user = user;
        this.listOfContracts = new ArrayList<>();
    }

    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        listOfContracts.remove(contract);
    }

    public ArrayList<RentalContract> getContracts() {
        return listOfContracts;
    }

    public User getUser() {
        return user;
    }
}
