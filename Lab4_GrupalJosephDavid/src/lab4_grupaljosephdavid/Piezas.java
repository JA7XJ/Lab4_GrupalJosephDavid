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
    
    public Piezas() {
    }

    public Piezas(Color color) {
        this.color = color;
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

    public void setMaterial(String matereal) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Piezas{" + "color=" + color + ", material=" + material + '}';
    }
    
    
    
    public abstract void mover();
}
