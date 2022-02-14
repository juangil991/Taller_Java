package com.sofka.taller;
import java.util.Scanner;

public class PersonaEjecutable {

    public Scanner captura = new Scanner(System.in);
    public String nombre="";
    public int edad=0;
    public char sexo;
    public double peso=0;
    public double altura=0;

    public PersonaEjecutable(){
        System.out.println("Ingrese los datos dela primera persona");
        solicitarDatos();
        Persona persona1= new Persona(nombre,edad,"",sexo,peso,altura);
        persona1.calcularIMC();
        if (persona1.calcularIMC()==-1) System.out.println(nombre +" Esta por debajo de su peso ideal ");
        else if (persona1.calcularIMC()==0) System.out.println(nombre+" Esta por en su peso ideal ");
        else if (persona1.calcularIMC()==1) System.out.println(nombre+" Esta en sobrepeso ");
        if (persona1.esMayorDeEdad()) System.out.println(nombre+" es mayor de edad");
        else System.out.println(nombre+ " no es mayor de edad");
        mostrarDatos();
        System.out.println("Ingrese los datos dela segunda persona");
        solicitarDatos();
        Persona persona2= new Persona(nombre,edad,sexo);
        persona2.calcularIMC();
        if (persona2.calcularIMC()==-1) System.out.println(nombre+" Esta por debajo de su peso ideal ");
        else if (persona2.calcularIMC()==0) System.out.println(nombre+" Esta por en su peso ideal ");
        else if (persona2.calcularIMC()==1) System.out.println(nombre+ "Esta en sobrepeso ");
        if (persona2.esMayorDeEdad()) System.out.println(nombre+" es mayor de edad");
        else System.out.println(nombre+ " no es mayor de edad");
        mostrarDatos();
        System.out.println("Ingrese los datos dela tercera persona");
        solicitarDatos();
        Persona persona3= new Persona();
        persona3.SetNombre(nombre);
        persona3.SetEdad(edad);
        persona3.SetSexo(sexo);
        persona3.SetPeso(peso);
        persona3.SetAltura(altura);
        persona3.calcularIMC();
        if (persona3.calcularIMC()==-1) System.out.println(nombre+" Esta por debajo de su peso ideal ");
        else if (persona3.calcularIMC()==0) System.out.println(nombre+" Esta por en su peso ideal ");
        else if (persona3.calcularIMC()==1) System.out.println(nombre+" Esta en sobrepeso ");
        if (persona3.esMayorDeEdad()) System.out.println(nombre+" es mayor de edad");
        else System.out.println(nombre+ " no es mayor de edad");
    }
    public void solicitarDatos(){
        try {
            System.out.println("Ingrese su nombre:");
            nombre = captura.next();
            System.out.println("Ingrese su edad:");
            edad = captura.nextInt();
            System.out.println("Ingrese su sexo (H= Hombre M= Mujer) :");
            sexo = captura.next().charAt(0);
            System.out.println("Ingrese su peso(KG):");
            peso = captura.nextDouble();
            System.out.println("Ingrese su altura(m):");
            altura = captura.nextDouble();
        }catch (Exception ex){
            System.out.println("Error: Ingrese un dato Valido");
        }
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
}
