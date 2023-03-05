/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Memory {
    
    ArrayList<Optional<MemoryRegister>> memoryRegisters = new ArrayList();
    int size = 100;
    int allocatedSize;
    int allocationStartIndex;

    public Memory(int allocatedSize) {
        this.allocatedSize = allocatedSize;
        for(int i = 0 ; i < size ; i ++){
            memoryRegisters.add(Optional.empty());                 
        }
    }
    
    public boolean isFull(){
        
        return false;
    }

    public void allocateMemory(ArrayList<MemoryRegister> instructionSet){
        int minIndex = 10; // Minimum value of range
        int maxIndex = size-1;
        int allocationStartIndex = (int)Math.floor(Math.random() * ((maxIndex) - minIndex + 1) + minIndex);
        
        if (instructionSet.size() == 90){
            allocationStartIndex = 10;
            this.setAllocationStartIndex(allocationStartIndex);
            int instructionSetIndex = 0;
            for(int i = allocationStartIndex ; i < instructionSet.size()+allocationStartIndex; i ++){
                this.memoryRegisters.set(i, Optional.of(instructionSet.get(instructionSetIndex)));
                System.out.println("Instruccion agregada a la memoria");
                instructionSetIndex++;
            }
            return;
        }
        else{
            while (allocationStartIndex + instructionSet.size() > maxIndex){
            allocationStartIndex = (int)Math.floor(Math.random() * ((maxIndex) - minIndex + 1) + minIndex);
        }
            System.out.println(allocationStartIndex);
            this.setAllocationStartIndex(allocationStartIndex);
            int instructionSetIndex = 0;
            for(int i = allocationStartIndex ; i < instructionSet.size()+allocationStartIndex; i ++){
                this.memoryRegisters.set(i, Optional.of(instructionSet.get(instructionSetIndex)));
                System.out.println("Instruccion agregada a la memoria");
                instructionSetIndex++;
            }
        }
        
        System.out.println(this.memoryRegisters);
        System.out.println(this.memoryRegisters.size());
    }

    public int getAllocationStartIndex() {
        return allocationStartIndex;
    }

    public void setAllocationStartIndex(int allocationStartIndex) {
        this.allocationStartIndex = allocationStartIndex;
    }
    
    

    public ArrayList<Optional<MemoryRegister>> getMemoryRegisters() {
        return memoryRegisters;
    }

    public void setMemoryRegisters(ArrayList<Optional<MemoryRegister>> memoryRegisters) {
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
