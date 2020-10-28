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

    protected String name;
    protected String surname;
    protected String address;
    
    public Person () {}  
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setAddress(String address) {
        this.address = address;
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
