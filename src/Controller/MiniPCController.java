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
            this.loadInstruction(register);
            break;
        case 2:
            this.storeInstruction(register);
            break;
        case 3:
            this.movInstruction(register, value);
            break;
        case 4:
            this.subInstruction(register);
            break;
        case 5:
            this.addInstruction(register);
            break;
        default:
            JOptionPane.showMessageDialog (null, "La instrucción dada no se puede ejecutar.", "Error: Instrucción inválida", JOptionPane.ERROR_MESSAGE);
}
        
    }
    
    public void loadInstruction(int destinationRegister){
        int loadValue = this.getCpu().getDataRegisters().get(destinationRegister-1).getValue();
        this.getCpu().setAccumulator(loadValue);
    }
    
    public void storeInstruction(int destinationRegister){
        int accumulatorValue = this.getCpu().getAccumulator();
        this.getCpu().getDataRegisters().get(destinationRegister-1).setValue(accumulatorValue);
    }
    
    public void movInstruction(int destinationRegister, int value){
        this.getCpu().getDataRegisters().get(destinationRegister-1).setValue(value);
    }
    
    public void subInstruction(int destinationRegister){
        int subValue = this.getCpu().getDataRegisters().get(destinationRegister-1).getValue();
        int newValue = this.getCpu().getAccumulator() - subValue;
        this.getCpu().setAccumulator(newValue);
    }
    
    public void addInstruction(int destinationRegister){
        int addValue = this.getCpu().getDataRegisters().get(destinationRegister-1).getValue();
        int newValue = addValue + this.getCpu().getAccumulator();
        this.getCpu().setAccumulator(newValue);
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    
}
