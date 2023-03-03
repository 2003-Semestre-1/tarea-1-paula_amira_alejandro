/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author aleja
 */
public class FileManager {
    
    BufferedReader fileReader;
    String filePath;
    ArrayList<MemoryRegister> instructions;
    HashMap<String,Integer> instructionHashMap;
    HashMap<String,Integer> registerHashMap;

    public FileManager(String filePath) {
        this.filePath = filePath;
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

    public HashMap<String, Integer> getInstructionHashMap() {
        return instructionHashMap;
    }

    public void setInstructionHashMap(HashMap<String, Integer> instructionHashMap) {
        this.instructionHashMap = instructionHashMap;
    }

    public HashMap<String, Integer> getRegisterHashMap() {
        return registerHashMap;
    }

    public void setRegisterHashMap(HashMap<String, Integer> registerHashMap) {
        this.registerHashMap = registerHashMap;
    }

    public ArrayList<MemoryRegister> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<MemoryRegister> instructions) {
        this.instructions = instructions;
    }
    
    
    
    
}
