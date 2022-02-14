package com.sofka.taller;

public class Lavadora extends Electrodomestico{
    int Carga =5;
    public Lavadora() {
        super();
    }

    public Lavadora(int precio_base, int peso) {
        super(precio_base, peso);
    }

    public Lavadora(int precio_base, String color, char consumo_energetico, int peso,int carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.Carga =carga;
    }

    public int getCarga() {
        return Carga;
    }

    @Override
    public int precioFinal() {
        int precio_final= super.precioFinal();
        if (Carga >30)precio_final+=50;
        return precio_final;
    }
}
