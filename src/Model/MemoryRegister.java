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
public class MemoryRegister extends Register {
    
    public Integer op;
    public Integer address;
    public Integer register;
    
    public MemoryRegister(Integer op, Integer register, Integer value, String registerType) {
        super(value, registerType);
        this.op = op;
        this.register = register;
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }    

    public Integer getOp() {
        return op;
    }

    public void setOp(Integer op) {
        this.op = op;
    }


    @Override
    public String convertToBinary(){
        String binaryString = "";
        String sign = "";
        
        String op = Integer.toBinaryString(this.op);
        String op4bit = String.format("%4s", Integer.toBinaryString(this.getOp())).replace(' ', '0');
        
        String address = Integer.toBinaryString(this.register);
        String address4bit = String.format("%4s", Integer.toBinaryString(this.getRegister())).replace(' ', '0');
        
        String value = Integer.toString(this.value,2);
        if (this.value < 0){
            StringBuilder string = new StringBuilder(value);
            string.setCharAt(0, '0');
            value = string.toString();
        }
        
        int charactersRemaining = 8-value.length();
        StringBuilder value8bit = new StringBuilder();// builder is empty now
        for (int count = 0; count < charactersRemaining; count++) {
            if (this.value < 0 && count == 0){
                value8bit.append('1');
                count++;
            }
            value8bit.append('0');
        }
        value8bit.append(value);
        String value8bitString = value8bit.toString();
        
        binaryString = op4bit + " " + address4bit + " " + value8bit;
        
        return binaryString;
    }
    
}
