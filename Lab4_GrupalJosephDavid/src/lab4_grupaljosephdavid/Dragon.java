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
 * @author david
 */
public class Dragon extends Piezas{
    public static Scanner sc=new Scanner(System.in);
    private String nombre;

    public Dragon() {
    }

    public Dragon(String nombre, Color color) {
        super(color);
        this.nombre = nombre;
    }
    
    
    @Override
    public void mover() {
        int x=0;
        int y=0;
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
            
        }
    }
    
}
