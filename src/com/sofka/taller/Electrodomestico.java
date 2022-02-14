package com.sofka.taller;

public class Electrodomestico {
    private int Precio_base=100;
    private String Color = "blanco";
    private char Consumo_energetico='F';
    private int peso = 5;

    public Electrodomestico(){
    }
    public Electrodomestico(int precio_base, int peso){
        this.Precio_base=precio_base;
        this.peso = peso;
    }
    public Electrodomestico(int precio_base,String color, char consumo_energetico, int peso){
        this.Precio_base=precio_base;
        this.Color=color;
        this.Consumo_energetico=consumo_energetico;
        this.peso=peso;
        comprobarConsumoEnergetico(consumo_energetico);
        comprobarColor(color);
    }

    public int getPrecio_base() {
        return Precio_base;
    }

    public String getColor() {
        return Color;
    }

    public char getConsumo_energetico() {
        return Consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        if(letra != 'A' && letra != 'B'&& letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F')
        {
            this.Consumo_energetico='F';
        }
    }
    private void comprobarColor(String color)
    {
        if(color.equals("")) Color="Blanco";
    }
    public int precioFinal(){
        int precio_Final=0;
        switch (Consumo_energetico){
            case 'A':
            {
                precio_Final=100;
                break;
            }
            case 'B':
            {
                precio_Final=80;
                break;
            }
            case 'C':
            {
                precio_Final=60;
                break;
            }
            case 'D':
            {
                precio_Final=50;
                break;
            }
            case 'E':
            {
                precio_Final=30;
                break;
            }
            case 'F':
            {
                precio_Final=10;
                break;
            }
        }
        if(peso<=19) precio_Final+=10;
        if(peso>19 && peso<=49) precio_Final+=50;
        if(peso>49 && peso<=79) precio_Final+=80;
        if(peso>80) precio_Final+=100;
        return Precio_base+precio_Final;
    }
}
