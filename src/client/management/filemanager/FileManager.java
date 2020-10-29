/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.management.filemanager;

import client.management.info.Client;
import java.util.List;
import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author KGAUGELO
 */
public class FileManager {
    
//ArithmeticException, ArrayIndexOutOfBoundsException, 
//ClassNotFoundException, FileNotFoundException,IOException, 
//NoSuchFieldException, NumberFormatException, 
//StringIndexOutOfBoundsException

    private File openFile;
    
    
    public void open(String filepath) {

        openFile = new File(filepath); 
        
    }
    
    public int countRows(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream(new File(filename)))) {
            int i = 0;
            while((i = ob.read()) != -1) {
                ++i;
            }return (i == 0) ? 1 : i;
        }
        
    }
    
    public void registerClient(Client clInfo, String filename) throws FileNotFoundException, IOException {

        try {

            File file = new File(filename);

            try (FileWriter fr = new FileWriter(file, true)) {
                fr.write(clInfo.toString() + "\n");
            }
            
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public Client[] readClients(String filename)  throws FileNotFoundException, IOException, ClassNotFoundException {	
        
        List<String> allLines = Files.readAllLines(Paths.get(filename));
        
        Client[] client = new Client[allLines.size()];
        
        for (int i = 0; i < allLines.size(); i++) {
            
            String array[] = allLines.get(i).split("#");
            
            client[i] = new Client(array[0], array[1], array[2], array[3], array[4]);
        }
        
        return client;
    }
}
