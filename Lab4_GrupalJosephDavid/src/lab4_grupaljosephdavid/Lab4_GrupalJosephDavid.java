/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_grupaljosephdavid;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Lab4_GrupalJosephDavid {
public static Scanner sc=new Scanner(System.in);
public int x=0;
public int y=0;
    /**
     * @param args the command line arguments
     */
    static ArrayList<jugador> j=new ArrayList();
    public static void main(String[] args) {
        String[][] matriz=new String[9][9];
        char r='s';
        while (r=='s'||r=='S') {
            System.out.print("¿Desea agregar jugador?[S/N]: ");
            char rr=sc.next().charAt(0);
            while (rr=='s'||rr=='S') {
                System.out.print("Ingrese nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                System.out.print("Ingrese nombre de usuario: ");
                String user=sc.nextLine();
                int puntaje=0;
                System.out.print("Ingrese el lugar: ");
                String lugar=sc.nextLine();
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                System.out.print("Ingrese el sexo: ");
                String sexo=sc.next();
                j.add(new jugador(name, user, puntaje, lugar, edad, sexo));
                System.out.print("¿Desea agregar otra persona?[S/N]: ");
                rr=sc.next().charAt(0);
            }
            System.out.print("¿Desea comenzar el juego?[S/N]: ");
            char rrr=sc.next().charAt(0);
            if (rrr=='s') {
                juego();
            }
            System.out.println("\n1)Listar jugadores"
                    + "\n2)Eliminar");
            System.out.println("----------------------------------------------");
            System.out.print("Ingrese opcion: ");
            int op=sc.nextInt();
            if (op==1) {
                for (int i = 0; i < j.size(); i++) {
                    System.out.println(i+")"+j.toString());
                }
                
            }
            if (op==2) {
                
            }
            if (op==3) {
                System.out.println("Opcion inexistente");
            }
            
        }
        
    }
    public static void juego(){
        
    }
    public static void Inicio(){
        
    }
    
}
