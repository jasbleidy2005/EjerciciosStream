package Sorted;

public class Corredor {
    private int id;
    private String nombre;
    private int posicion;
    private String moto;

    public Corredor(int id, String nombre, int posicion, String moto) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.moto = moto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }
}
