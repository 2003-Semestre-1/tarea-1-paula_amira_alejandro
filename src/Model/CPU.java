/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class CPU {
    
    Memory memory;
    ArrayList<DataRegister> dataRegisters = new ArrayList<DataRegister>();

    public CPU(Memory memory) {
        this.memory = memory;
        DataRegister ax = new DataRegister(0,"Data");
        DataRegister bx = new DataRegister(0,"Data");
        DataRegister cx = new DataRegister(0,"Data");
        DataRegister dx = new DataRegister(0,"Data");
        this.dataRegisters.add(ax);
        this.dataRegisters.add(bx);
        this.dataRegisters.add(cx);
        this.dataRegisters.add(dx);
        
    }
    
    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public ArrayList<DataRegister> getDataRegisters() {
        return dataRegisters;
    }

    public void setDataRegisters(ArrayList<DataRegister> dataRegisters) {
        this.dataRegisters = dataRegisters;
    }
    
    
}
