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
public class Dragon extends Piezas{
    private String nombre;

    public Dragon() {
    }

    public Dragon(String nombre, Color color) {
        super(color);
        this.nombre = nombre;
    }
    
    
    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}