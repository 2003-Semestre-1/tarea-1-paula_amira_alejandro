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
public class DataRegister {
    private Register ax;
    private Register bx;
    private Register cx;
    private Register dx;

    public DataRegister(Register ax, Register bx, Register cx, Register dx) {
        this.ax = ax;
        this.bx = bx;
        this.cx = cx;
        this.dx = dx;
    }

    public Register getAx() {
        return ax;
    }

    public void setAx(Register ax) {
        this.ax = ax;
    }

    public Register getBx() {
        return bx;
    }

    public void setBx(Register bx) {
        this.bx = bx;
    }

    public Register getCx() {
        return cx;
    }

    public void setCx(Register cx) {
        this.cx = cx;
    }

    public Register getDx() {
        return dx;
    }

    public void setDx(Register dx) {
        this.dx = dx;
    }
    
    
}
