package com.sofka.taller;

import java.util.Random;

public class Persona {
    private String Nombre = "";
    private int Edad = 0;
    private String DNI = "";
    private char Sexo ='H';
    private double Peso = 0;
    private double Altura = 0;


    public Persona(){
        generarDNI();
    }
    public Persona(String Nombre, int Edad,char Sexo){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        generarDNI();
    }
    public Persona(String Nombre, int Edad, String DNI, char Sexo, double Peso, double Altura){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.DNI=DNI;
        this.Sexo=Sexo;
        this.Peso=Peso;
        this.Altura=Altura;
    }
    public void SetNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void SetEdad(int Edad){
        this.Edad = Edad;
    }
    public void SetSexo(char Sexo){
        this.Sexo = Sexo;
    }
    public void SetPeso(double Peso){
        this.Peso = Peso;
    }
    public void SetAltur(double Altura){
        this.Altura = Altura;
    }

    public int calcularIMC(){
        Double IMC = Peso/Math.pow(Altura,2);
        int resultado =0;
        if (IMC < 20 ) resultado=-1;
        if (IMC >=20 || IMC <= 25) resultado=0;
        if(IMC>25) resultado=1;
        return resultado;
    }

    public boolean esMayorDeEdad(){
        boolean mayorEdad = false;
        if(Edad>=18) mayorEdad=true;
        if(Edad<18) mayorEdad=false;
        return mayorEdad;
    }
    public void comprobarSexo(char Sexo){
        if(Sexo!='H'&& Sexo!='M') Sexo='H';
        this.Sexo=Sexo;
    }

    private void generarDNI(){
        Random random=new Random();
        for(int i=0;i<8;i++){
            int numero = random.nextInt(0+10);
            this.DNI+=numero;
        }
    }


}
