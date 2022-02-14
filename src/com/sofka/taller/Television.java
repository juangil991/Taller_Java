package com.sofka.taller;

public class Television extends Electrodomestico {
    int resolucion=20;
    boolean sintonizadorTDT=false;

    public Television() {

    }

    public Television(int precio_base, int peso) {
        super(precio_base, peso);

    }

    public Television(int precio_base, String color, char consumo_energetico, int peso, int resolucion, boolean sintonizadorTDT)
    {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public int precioFinal() {
        int precio_final = super.precioFinal();
        int porcentaje=(int) (super.precioFinal()*0.30);
        if (resolucion >40)precio_final+=porcentaje;
        if(sintonizadorTDT) precio_final+=50;
        return precio_final;
    }
}
