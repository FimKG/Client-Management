/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.management.filemanager;

import client.management.info.Client;
import java.io.*;
import java.io.File;

/**
 *
 * @author KGAUGELO
 */
public class FileManager {
    
//ArithmeticException, ArrayIndexOutOfBoundsException, 
//ClassNotFoundException, FileNotFoundException,IOException, 
//NoSuchFieldException, NumberFormatException, 
//StringIndexOutOfBoundsException
    
    
    //front class
    private File openFile;
    
    
    public void open(String filepath) {
        
//        readClients();
        

    }
    
    public int countRows(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream(new File(filename)));
        
        try {
            int i = 0;
            while((i = ob.read()) != -1) {
                ++i;
            }return (i == 0) ? 1 : i;
        }finally {
            ob.close();
        }
        
    }
    
    public void registerClient(Client clInfo, String filename) throws FileNotFoundException, IOException {
        
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(new File(filename), true));
        
        try {
            ob.writeObject(clInfo);
            ob.close();
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public Client[] readClients(String filename)  throws FileNotFoundException, IOException, ClassNotFoundException {	
        
       ObjectInputStream ob = new ObjectInputStream(new FileInputStream(new File(filename)));
       Client[] client = new Client[countRows(filename)];
       
       try{
           for(int x=0; x < client.length; x++) {
               client[x] = (Client) ob.readObject();
           }
       }catch(IndexOutOfBoundsException e) {
           System.out.println("Error : " + e.getMessage());
       }ob.close();
       return client;
    }
}
