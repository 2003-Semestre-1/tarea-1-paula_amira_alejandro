/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CPU;
import Model.Memory;

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

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    
}
