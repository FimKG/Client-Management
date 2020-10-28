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
public abstract class Person {
    
    private String name;
    private String surname;
    private String address;
    
        
    public void setName(String name) {
        name = this.name;
    }
    
    public void setSurname(String surname) {
        surname = this.surname;
    }
    
    public void setAddress(String address) {
        address = this.address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString(){
        return name + "#" + surname + "#" + address;
    }
    
}
