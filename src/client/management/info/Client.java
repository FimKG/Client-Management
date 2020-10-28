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
public class Client {
    
    public Person prsn;
    public String clientID;
    public String purposeOfVisit;
    
    public void setClientID(String clientID) {
        clientID = this.clientID;
    }
    
    public void setPurposeOfVisit(String purposeOfVisit) {
        purposeOfVisit = this.purposeOfVisit;
    }
    
    public String getClientID() {
        return clientID;
    }
    
    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }
    
    @Override
    public String toString(){
        return prsn.toString() + "#" + clientID + "#" + purposeOfVisit;
    }
    
    
}
