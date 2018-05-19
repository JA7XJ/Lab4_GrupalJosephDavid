/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_grupaljosephdavid;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author Joseph
 */
public class Lab4_GrupalJosephDavid {

    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    static ArrayList<jugador> j = new ArrayList();

    public static void main(String[] args) {
        Piezas[][] matriz = new Piezas[10][10];

        char r = 's';
        while (r == 's' || r == 'S') {
            System.out.print("¿Desea agregar jugador?[S/N]: ");
            char rr = sc.next().charAt(0);
            while (rr == 's' || rr == 'S') {
                System.out.print("Ingrese nombre: ");
                String name = sc.nextLine();
                name = sc.nextLine();
                System.out.print("Ingrese nombre de usuario: ");
                String user = sc.nextLine();
                int puntaje = 0;
                System.out.print("Ingrese el lugar: ");
                String lugar = sc.nextLine();
                System.out.print("Ingrese la edad: ");
                int edad = sc.nextInt();
                System.out.print("Ingrese el sexo: ");
                String sexo = sc.next();
                j.add(new jugador(name, user, puntaje, lugar, edad, sexo));
                System.out.print("¿Desea agregar otra persona?[S/N]: ");
                rr = sc.next().charAt(0);
            }
            System.out.print("¿Desea comenzar el juego?[S/N]: ");
            char rrr = sc.next().charAt(0);
            if (rrr == 's') {
                matriz=Inicio(matriz);
                for (int i = 0; i < matriz.length; i++) {
                    for (int k = 0; k < matriz[i].length; k++) {
                        System.out.print(matriz[i][k]);
                    }
                    System.out.println("");
                }
                juego();
            }
            System.out.println("\n1)Listar jugadores"
                    + "\n2)Eliminar");
            System.out.println("----------------------------------------------");
            System.out.print("Ingrese opcion: ");
            int op = sc.nextInt();
            if (op == 1) {
                for (int i = 0; i < j.size(); i++) {
                    System.out.println(i + ")" + j.get(i));
                }
            }
            if (op == 2) {
                for (int i = 0; i < j.size(); i++) {
                    System.out.println(i + ")" + j.get(i));
                }
                System.out.println("----------------------------------------------");
                System.out.print("Ingrese la posicion a eliminar: ");
                int pos = sc.nextInt();
                j.remove(pos);
            }
            if (op == 3) {
                System.out.println("Opcion inexistente");
            }
            System.out.print("¿Desea realizar otra accion?[S/N]: ");
            r = sc.next().charAt(0);
        }

    }

    public static void juego() {

    }

    public static Piezas[][] Inicio(Piezas[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[0].length; k++) {
                mat[i][k] = (new Blanco());
            }
        }
        for (int i = 0; i < j.size(); i++) {
            if (i == 0) {
                j.get(i).getPieza().add(new Dragon("F1", 0, 2, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Dragon("F2", 0, 7, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Dragon("F3", 1, 5, Color.WHITE, "Madera", 1));
                mat[0][2] = (Piezas) j.get(i).getPieza().get(0);
                mat[0][7] = (Piezas) j.get(i).getPieza().get(1);
                mat[1][5] = (Piezas) j.get(i).getPieza().get(2);
                j.get(i).getPieza().add(new Caballeros("C1", 0, 0, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Caballeros("C2", 0, 9, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Caballeros("C3", 0, 4, Color.WHITE, "Madera", 1));
                mat[0][0] = (Piezas) j.get(i).getPieza().get(3);
                mat[0][9] = (Piezas) j.get(i).getPieza().get(4);
                mat[0][4] = (Piezas) j.get(i).getPieza().get(5);
                j.get(i).getPieza().add(new Arquero("A1", 0, 3, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Arquero("A1", 0, 6, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Arquero("A1", 1, 2, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Arquero("A1", 1, 7, Color.WHITE, "Madera", 1));
                mat[0][3] = (Piezas) j.get(i).getPieza().get(6);
                mat[0][6] = (Piezas) j.get(i).getPieza().get(7);
                mat[1][2] = (Piezas) j.get(i).getPieza().get(8);
                mat[1][7] = (Piezas) j.get(i).getPieza().get(9);
                j.get(i).getPieza().add(new Rey("R", 0, 4, Color.WHITE, "Madera", 1));
                mat[0][4] = (Piezas) j.get(i).getPieza().get(10);
                j.get(i).getPieza().add(new Mago("M", 0, 5, Color.WHITE, "Madera", 1));
                mat[0][5] = (Piezas) j.get(i).getPieza().get(11);
                j.get(i).getPieza().add(new Duendes("D1", 1, 0, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Duendes("D1", 1, 3, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Duendes("D1", 1, 6, Color.WHITE, "Madera", 1));
                j.get(i).getPieza().add(new Duendes("D1", 1, 9, Color.WHITE, "Madera", 1));
                mat[1][0] = (Piezas) j.get(i).getPieza().get(12);
                mat[1][3] = (Piezas) j.get(i).getPieza().get(13);
                mat[1][6] = (Piezas) j.get(i).getPieza().get(14);
                mat [1][9]=(Piezas) j.get(i).getPieza().get(15);
            } else if (i == 1) {
                j.get(i).getPieza().add(new Dragon("F1", 9, 2, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Dragon("F2", 9, 7, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Dragon("F3", 8, 4, Color.BLACK, "Madera", 1));
                mat [9][2]=(Piezas) j.get(i).getPieza().get(0);
                mat [9][7]=(Piezas) j.get(i).getPieza().get(1);
                mat [8][4]=(Piezas) j.get(i).getPieza().get(2);
                j.get(i).getPieza().add(new Caballeros("C1", 9, 0, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Caballeros("C2", 9, 9, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Caballeros("C3", 8, 5, Color.BLACK, "Madera", 1));
                mat [9][0]=(Piezas) j.get(i).getPieza().get(3);
                mat [9][9]=(Piezas) j.get(i).getPieza().get(4);
                mat [8][5]=(Piezas) j.get(i).getPieza().get(5);
                j.get(i).getPieza().add(new Arquero("A1", 9, 3, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Arquero("A1", 9, 6, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Arquero("A1", 8, 2, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Arquero("A1", 8, 7, Color.BLACK, "Madera", 1));
                mat [9][3]=(Piezas) j.get(i).getPieza().get(6);
                mat [9][6]=(Piezas) j.get(i).getPieza().get(7);
                mat [8][2]=(Piezas) j.get(i).getPieza().get(8);
                mat [8][7]=(Piezas) j.get(i).getPieza().get(9);
                j.get(i).getPieza().add(new Rey("R", 9, 5, Color.BLACK, "Madera", 1));
                mat [9][5]=(Piezas) j.get(i).getPieza().get(10);
                j.get(i).getPieza().add(new Mago("M", 9, 4, Color.BLACK, "Madera", 1));
                mat [9][4]=(Piezas) j.get(i).getPieza().get(11);
                j.get(i).getPieza().add(new Duendes("D1", 8, 0, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Duendes("D1", 8, 3, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Duendes("D1", 8, 6, Color.BLACK, "Madera", 1));
                j.get(i).getPieza().add(new Duendes("D1", 8, 9, Color.BLACK, "Madera", 1));
                mat [8][0]=(Piezas) j.get(i).getPieza().get(12);
                mat [8][3]=(Piezas) j.get(i).getPieza().get(13);
                mat [8][6]=(Piezas) j.get(i).getPieza().get(14);
                mat [8][9]=(Piezas) j.get(i).getPieza().get(15);
            }
        }

    return mat;

}
}
