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
        int x;
        int y;
        System.out.println("Ingrese las corrdenadas en x");
        x=sc.nextInt();
        System.out.println("Ingrese las coordenadas en y");
        y=sc.nextInt();
        
    }
    
}
