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
public class Caballeros extends Piezas{
    private int x2;
    private int y2;
    private String nombre;
    private int x;
    private int y;

    public Caballeros() {
    }

    public Caballeros(int x2, int y2, String nombre, int x, int y, Color color, String material, int status) {
        super(color, material, status);
        this.x2 = x2;
        this.y2 = y2;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    

    @Override
    public void mover() {
        if (x2==x||y2==y) {
            x=x2;
            y=y2;
        }
    }
    
}
