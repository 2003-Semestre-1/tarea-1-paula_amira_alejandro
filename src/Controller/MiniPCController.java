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
    
    // Esta clase es el controlador del CPU, contiene los métodos para ejecutar las diferentes instrucciones tales como MOV, LOAD, ADD, etc.
    // Su único atributo es el CPU
    
    public CPU cpu;

    public MiniPCController(CPU cpu) {
        this.cpu = cpu;
    }

    public MiniPCController() {
        
    }
    
    public void executeInstruction(int op, int register, int value){
        // Este método ejecuta la instrucción dependiendo del operador utilizado en la instrucción
        // Recibe un operador, un registro y un valor
        // Se utiliza un switch para realizar una diferente operación dependiendo del operador dado como parámetro
        
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
        // Este método realiza la operación LOAD
        // Recibe el registro destino donde se desea cargar un valor
        // Se obtiene el valor actualmente almacenado en el registro que se solicitó y se carga en el acumulador
        int loadValue = this.getCpu().getDataRegisters().get(destinationRegister-1).getValue();
        this.getCpu().setAccumulator(loadValue);
    }
    
    public void storeInstruction(int destinationRegister){
        // Este método realiza la operación STORE
        // Recibe el registro destino donde se desea guardar un valor
        // Se guarda el valor parámetro en el registro que fue solicitado
        int accumulatorValue = this.getCpu().getAccumulator();
        this.getCpu().getDataRegisters().get(destinationRegister-1).setValue(accumulatorValue);
    }
    
    public void movInstruction(int destinationRegister, int value){
        // Este método realiza la operación MOV
        // Recibe el registro destino donde se desea mover un valor, y el valor
        // Se mueve el valor dado al registro solicitado
        this.getCpu().getDataRegisters().get(destinationRegister-1).setValue(value);
    }
    
    public void subInstruction(int destinationRegister){
        // Este método realiza la operación SUB
        // Recibe el registro destino donde se desea obtener el valor que se va a restar
        // Resta al acumulador el valor almacenado en el registro solicitado
        int subValue = this.getCpu().getDataRegisters().get(destinationRegister-1).getValue();
        int newValue = this.getCpu().getAccumulator() - subValue;
        this.getCpu().setAccumulator(newValue);
    }
    
    public void addInstruction(int destinationRegister){
        // Este método realiza la operación ADD
        // Recibe el registro destino donde se desea obtener el valor que se va a sumar
        // Suma al acumulador el valor almacenado en el registro solicitado
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
