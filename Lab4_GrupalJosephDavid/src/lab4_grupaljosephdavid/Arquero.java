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
public class Arquero extends Piezas{
    public static Scanner sc=new Scanner(System.in);
    private String nombre;
    private int x;
    private int y;
    private int x2;
    private int y2;
    
    public Arquero() {
    }

    public Arquero(String nombre, int x, int y, Color color, String material, int status) {
        super(color, material, status);
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
    
    public Arquero(String nombre, int x, int y, Color color, String material, int status, int x2, int y2) {
        super(color, material, status);
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Arquero.sc = sc;
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
    public String toString() {
        return "{"+ nombre +"}";
    }
    
    @Override
    public void mover() {
        System.out.println("Ingrese las corrdenadas en x");
        x2=sc.nextInt();
        System.out.println("Ingrese las coordenadas en y");
        y2=sc.nextInt();
        int abs1=Math.abs(x2-x);
        int abs2=Math.abs(y2-y);
        if ((abs1==abs2)&&(x==x2||y==y2)) {
            y=y2;
            x=2;
        }
    }
    
}
