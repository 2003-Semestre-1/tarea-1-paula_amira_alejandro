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
public class DataRegister extends Register{
    
    public DataRegister(Integer value, String registerType) {
        super(value, registerType);
    }

    @Override
    public String convertToBinary() {
        String binaryString = "";
        String sign = "";
        
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
        
        binaryString = value8bit.toString();
        
        return binaryString;
    }
    
    
}
