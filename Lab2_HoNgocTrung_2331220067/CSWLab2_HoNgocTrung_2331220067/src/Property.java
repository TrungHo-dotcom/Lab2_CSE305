/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EthanHo
 */
public class Property {
       private String propertyID;
    private String description;
    private String propertyOwnerId;

    public Property(String propertyID, String description, String propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    // Getters and setters
    public String getPropertyID() { return propertyID; }
    public String getDescription() { return description; }
    public String getPropertyOwnerId() { return propertyOwnerId; }

    public void setDescription(String description) { this.description = description; }
}
