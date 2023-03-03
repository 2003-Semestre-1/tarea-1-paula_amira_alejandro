/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class FileManager {
    
    BufferedReader fileReader;
    String filePath;
    ArrayList<MemoryRegister> instructions;
    HashMap<String,Integer> operations;
    HashMap<String,Integer> dataRegisters;
    int errors = 0;

    public FileManager(String filePath) {
        this.filePath = filePath;
        this.loadFileInstructions(filePath);
        this.loadOperations();
        this.loadDataRegisters();
    }
    
    public void loadFileInstructions(String filePath){
        try {
            
            fileReader = new BufferedReader(new FileReader(filePath));
            String instruction = fileReader.readLine();
            int instructionPos = 0;
            
            while(instruction != null) {   
                
                if(!this.validateInstruction(instruction,instructionPos)){                                                     
                    
                    addError();
                    return;
                } 
                
                this.instructions.add(processInstruction(instruction));
                
                instructionPos++;
                instruction = fileReader.readLine();
                
            }
            
            if(instructionPos == 0){
                JOptionPane.showMessageDialog (null, "El archivo no puede estar vacío.", "Error: archivo vacío", JOptionPane.ERROR_MESSAGE);       
                return;
            }
            
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog (null, "Error en la lectura del archivo.", "Error de lectura", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
            
        }
    }
    
    public MemoryRegister processInstruction(String instruction){
        MemoryRegister instructionRegister = null;
        
        return instructionRegister;
    }
    
    public boolean validateInstruction(String instruction,int instructionPos) {
        
        return true;
    }
    
    public void loadDataRegisters() {
        this.dataRegisters = new HashMap<>();
        this.dataRegisters.put("ax", 1);
        this.dataRegisters.put("bx", 2);
        this.dataRegisters.put("cx", 3);
        this.dataRegisters.put("dx", 4);
    }
    
    public void loadOperations() {
        this.operations = new HashMap<>();
        this.operations.put("LOAD", 1);
        this.operations.put("STORE", 2);
        this.operations.put("MOV", 3);
        this.operations.put("SUB", 4);
        this.operations.put("ADD", 5);
    }
    
    public void addError() {
        this.errors = this.errors + 1;
    }

    public BufferedReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(BufferedReader fileReader) {
        this.fileReader = fileReader;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public HashMap<String, Integer> getOperations() {
        return operations;
    }

    public void setOperations(HashMap<String, Integer> operations) {
        this.operations = operations;
    }

    public HashMap<String, Integer> getDataRegisters() {
        return dataRegisters;
    }

    public void setDataRegisters(HashMap<String, Integer> dataRegisters) {
        this.dataRegisters = dataRegisters;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }
    
    public ArrayList<MemoryRegister> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<MemoryRegister> instructions) {
        this.instructions = instructions;
    }
    
    
    
    
}
