package lab4_grupaljosephdavid;

import javafx.scene.paint.Color;

public class Rey extends Piezas{
    private String nombre;
    private int x;
    private int y;

    public Rey() {
    }

    public Rey(String nombre, int x, int y, Color color, String material, int status) {
        super(color, material, status);
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

    @Override
    public String toString() {
        return "{"+ nombre +"}";
    }
    
    @Override
    public void mover() {
        System.out.println("No se puede mover");
    }
    
}
