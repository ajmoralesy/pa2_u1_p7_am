package com.edu.ec.negocio;

public class Reserva {

    private String cliente;
    private String habitacion;
    private int noches;
    private double precioPorNoche;
    private String correo;
    public Reserva() {
    }
    public Reserva(String cliente, String habitacion, int noches, double precioPorNoche, String correo) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
        this.correo = correo;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
    public int getNoches() {
        return noches;
    }
    public void setNoches(int noches) {
        this.noches = noches;
    }
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double calcularTotal() {
        return noches * precioPorNoche;
    }



}
