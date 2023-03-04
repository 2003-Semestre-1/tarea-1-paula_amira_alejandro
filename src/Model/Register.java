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
    
    public Integer value;
    public String registerType;

    public Register(Integer value, String registerType) {
        this.value = value;
        this.registerType = registerType;
    }
    
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
    
}
