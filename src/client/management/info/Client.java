/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.management.info;

/**
 *
 * @author KGAUGELO
 */
public class Client extends Person {
    
    
    public String clientID;
    public String purposeOfVisit;

    public Client(String name, String surname, String address, String clientID, String purposeOfVisit) {
        
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.clientID = clientID;
        this.purposeOfVisit = purposeOfVisit;
        
    }

    public Client() {
       
    }
    
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    
    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }
    
    public String getClientID() {
        return clientID;
    }
    
    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "#" + clientID + "#" + purposeOfVisit;
    }
    
    
}
