/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EthanHo
 */
public class RentalContract {
      private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void terminateContract() {
        System.out.println("Contract " + contractID + " has been terminated.");
    }

    // Getters
    public String getContractID() { return contractID; }
    public String getPropertyID() { return propertyID; }
    public String getTenantID() { return tenantID; }
    public double getRentAmount() { return rentAmount; }
}
