package practica.pkg01a.mendoza.reyes.angel.emanuel;

public class Evento {
    //atributos
    protected String fecha;
    protected String hora;
    protected String lugar;
    protected int capacidad;
    protected double costoBoleto;
    
    //constructor

    public Evento(String fecha, String hora, String lugar, int capacidad, double costoBoleto) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.costoBoleto = costoBoleto;
    }

    public Evento(){
       this.fecha = "19/02/2023";
       this.hora = "10:00";
       this.lugar = "Guadalajara";
       this.capacidad = 100;
       this.costoBoleto = 50.00;
    }
    
    //setters

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCostoBoleto(double costoBoleto) {
        this.costoBoleto = costoBoleto;
    }
    //Getters

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getCostoBoleto() {
        return costoBoleto;
    }
    
}