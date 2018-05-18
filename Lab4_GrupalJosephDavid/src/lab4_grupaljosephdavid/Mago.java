/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_grupaljosephdavid;

import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author Joseph
 */
public class Mago extends Piezas{
    public static Scanner sc=new Scanner(System.in);
    private String nombre;
    private int x;
    private int y;
    
    public Mago() {
    }

    public Mago(String nombre, Color color, String material, int status) {
        super(color, material, status);
        this.nombre = nombre;
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
    
    @Override
    public void mover() {
        int x2=0;
        int y2=0;
        System.out.println("Ingrese las corrdenadas en x");
        x2=sc.nextInt();
        System.out.println("Ingrese las coordenadas en y");
        y2=sc.nextInt();
        int abs1=Math.abs(x2-x);
        int abs2=Math.abs(y2-y);
        if (abs1==abs2) {
            y=y2;
            x=2;
            
            
        }
    }
    
}
