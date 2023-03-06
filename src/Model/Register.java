/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aleja
 */
public abstract class Register {
    // Esta clase abstracta es la clase que representa un registro
    // Será heredada por MemoryRegister y DataRegister
    // Contiene el valor del registro, el tipo de registro, y la string de la instrucción en ensamblador que contiene
    // Además contiene un método abstracto para convertir a binario lo almacenado en el registro
    
    public Integer value;
    public String registerType;
    public String asmInstructionString;

    public Register(Integer value, String registerType) {
        this.value = value;
        this.registerType = registerType;
    }
    
    // Este método abstracto deberá ser implementado por todas las clases que hereden de Register y convierten lo almacenado en el registro a binario
    public abstract String convertToBinary();

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getAsmInstructionString() {
        return asmInstructionString;
    }

    public void setAsmInstructionString(String asmInstructionString) {
        this.asmInstructionString = asmInstructionString;
    }
    
    
}
