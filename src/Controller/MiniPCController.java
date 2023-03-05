/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CPU;
import Model.DataRegister;
import Model.Memory;
import Model.MemoryRegister;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class MiniPCController {
    
    public CPU cpu;

    public MiniPCController(CPU cpu) {
        this.cpu = cpu;
    }

    public MiniPCController() {
        
    }
    
    public void executeInstruction(int op, int register, int value){
        
        switch(op) {
        case 1:
            
            break;
        case 2:
            // code block
            break;
        case 3:
            this.movInstruction(register, value);
            break;
        case 4:
            // code block
            break;
        case 5:
            // code block
            break;
        default:
            JOptionPane.showMessageDialog (null, "La instrucción dada no se puede ejecutar.", "Error: Instrucción inválida", JOptionPane.ERROR_MESSAGE);
}
        
    }
    
    public void movInstruction(int destinationRegister, int value){
        
        this.getCpu().getDataRegisters().get(destinationRegister-1).setValue(value);
        
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    
}
