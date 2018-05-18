/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_grupaljosephdavid;

import javafx.scene.paint.Color;

/**
 *
 * @author Joseph
 */
public class Mago extends Piezas{
    private String nombre;

    public Mago() {
    }

    public Mago(String nombre, Color color, String material) {
        super(color, material);
        this.nombre = nombre;
    }
    
    @Override
    public void mover() {
        
    }
    
}
