/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_grupaljosephdavid;

import javafx.scene.paint.Color;

/**
 *
 * @author david
 */
public abstract class Piezas {
    private Color color;
    private String material;
    private int status;
    
    public Piezas() {
    }

    public Piezas(Color color, String material, int status) {
        this.color = color;
        this.material = material;
        this.status = status;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    
    
    public abstract void mover();
}
