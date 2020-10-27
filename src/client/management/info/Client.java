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
    
    @Override
    public String toString(){
        return prsn.toString() + "#" + clientID + "#" + purposeOfVisit;
    }
    
    
}
