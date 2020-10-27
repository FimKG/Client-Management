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
    
    
    
    @Override
    public String toString(){
        return name + "#" + surname + "#" + address;
    }
    
}
