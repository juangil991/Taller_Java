package com.sofka.taller;

import java.util.Scanner;


public class Funciones {

    public Scanner captura = new Scanner(System.in);

    //primer y segundo punto
    public String calculoMayor_Menor(){
        int numero1=0;
        int numero2=0;
        String mensaje="";
        Scanner captura = new Scanner(System.in);
        try {
            System.out.println("introdusca el primer numero");
            numero1 = captura.nextInt();
            System.out.println("introdusca el segundo numero");
            numero2 = captura.nextInt();
            if (numero1 > numero2) {
                mensaje= String.format("el numero mayor es: %s",numero1);
            }
            else if (numero2 > numero1) {
                mensaje= String.format("el numero mayor es: %s",numero2);
            }
            else if (numero2 == numero1) {
                mensaje= String.format("los numeros son iguales");
            }
        }catch (Exception ex){
            mensaje = "Ingrese un valor valido";
        }
        return mensaje;
    }

    public double calculoAreaCirculo(){

        System.out.println("Ingrese el radio del circulo");
        double radio=captura.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        return area;
    }

    public double calculoIva(){
        System.out.println("Ingrese el precio del producto");
        double Precio = captura.nextDouble();
        double Iva= Precio*0.21;
        double PrecioIva=Precio+Iva;
        return PrecioIva;
    }

    public void numerosImpares(){
        int index=0;
        System.out.println("Ciclo While: ");
        while(index<100){
            index++;
            System.out.println(index);
        }
        System.out.println("Ciclo For: ");
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
    }

    public void mayorCero(){
        int numeroIn=0;
        try {
        do {
            System.out.println("Ingrese un numero");

                numeroIn = captura.nextInt();
                if (numeroIn > 0) System.out.println("Numero Mayor a 0");
                else if (numeroIn == 0) System.out.println("Numero Igual a 0");

        }while(numeroIn>=0);
        System.out.println("Numero menor que 0");
        }catch (Exception ex){
            System.out.println("Dato no valido");
        }
    }
    public void diaLaboral(){
        System.out.println("Ingrese un dia de la semana en minuscula");
        String dia = captura.next();
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            {
                System.out.println("dia laboral");
                break;
            }
            case "sabado":
            case "domingo":
            {
                System.out.println("dia no laboral");
            }
            default:
            {
                System.out.println("Ingrese los datos de manera correcta");
            }
        }
    }

}
