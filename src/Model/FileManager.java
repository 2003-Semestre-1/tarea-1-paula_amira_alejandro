/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author aleja
 */
public class FileManager {
    
    BufferedReader fileReader;
    ArrayList<MemoryRegister> instructions;
    HashMap<String,Integer> operations;
    HashMap<String,Integer> dataRegisters;
    int errorAmount = 0;
    
    public FileManager() {
        
    }
    
    public String selectFile(Component viewComponent){
        String filePath = "";
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos .asm", "asm");
        fileChooser.setFileFilter(filter);
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(viewComponent);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
            
            System.out.println("El archivo seleccionado es: " + filePath);
        }
        
        return filePath;
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
                
                // aqui va el codigo para procesar la instruccion
                System.out.println(instruction);
                
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
        System.out.println(dataRegisters);
    }
    
    public void loadOperations() {
        this.operations = new HashMap<>();
        this.operations.put("LOAD", 1);
        this.operations.put("STORE", 2);
        this.operations.put("MOV", 3);
        this.operations.put("SUB", 4);
        this.operations.put("ADD", 5);
        System.out.println(operations);
    }
    
    public void addError() {
        this.setErrorAmount(errorAmount+1);
    }

    public BufferedReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(BufferedReader fileReader) {
        this.fileReader = fileReader;
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

    public int getErrorAmount() {
        return errorAmount;
    }

    public void setErrorAmount(int errorAmount) {
        this.errorAmount = errorAmount;
    }
    
    public ArrayList<MemoryRegister> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<MemoryRegister> instructions) {
        this.instructions = instructions;
    }
    
    
    
    
}
