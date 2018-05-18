/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_grupaljosephdavid;

/**
 *
 * @author Joseph
 */
public class jugador {
    private String nombre;
    private String user;
    private int points;
    private String lugar;
    private int edad;
    private String sexo;

    public jugador() {
    }

    public jugador(String nombre, String user, int points, String lugar, int edad, String sexo) {
        this.nombre = nombre;
        this.user = user;
        this.points = points;
        this.lugar = lugar;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", user=" + user + ", points=" + points + ", lugar=" + lugar + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}
