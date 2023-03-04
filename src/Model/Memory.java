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
public class Memory {
    
    ArrayList<MemoryRegister> memoryRegisters;
    int size = 0;
    int allocatedSize = 0;

    public Memory(ArrayList<MemoryRegister> memoryRegisters) {
        this.memoryRegisters = memoryRegisters;
    }

    public ArrayList<MemoryRegister> getMemoryRegisters() {
        return memoryRegisters;
    }

    public void setMemoryRegisters(ArrayList<MemoryRegister> memoryRegisters) {
        this.memoryRegisters = memoryRegisters;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(int allocatedSize) {
        this.allocatedSize = allocatedSize;
    }
    
    
    
}
