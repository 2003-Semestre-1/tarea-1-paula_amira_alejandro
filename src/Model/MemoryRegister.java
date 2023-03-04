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
public class MemoryRegister {
    private Register pc;
    private Register ac;
    private Register ir;

    public MemoryRegister(Register pc, Register ac, Register ir) {
        this.pc = pc;
        this.ac = ac;
        this.ir = ir;
    }

    public Register getPc() {
        return pc;
    }

    public void setPc(Register pc) {
        this.pc = pc;
    }

    public Register getAc() {
        return ac;
    }

    public void setAc(Register ac) {
        this.ac = ac;
    }

    public Register getIr() {
        return ir;
    }

    public void setIr(Register ir) {
        this.ir = ir;
    }
    
    
}
