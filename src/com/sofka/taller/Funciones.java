package com.sofka.taller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Funciones {

    public Scanner captura = new Scanner(System.in);

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

    public void reemplazarChar(){
        String mensaje= "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println(mensaje);
        String nuevoMensaje = mensaje.replace(" ","");
        System.out.println("Mensaje modificado: "+nuevoMensaje);

    }

    public void eliminarChar() {
        System.out.println("Ingrese una frase");
        String frase = captura.nextLine();
        frase = frase.replace(" ","");
        System.out.println("Frase sin espacios: "+frase);
    }

    public  void contadorVocales(){
        System.out.println("Ingrese una frase");
        String frase = captura.nextLine();
        int numeroVocales=0;
        for (int i=0; i<frase.length();i++){
            switch (frase.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':{
                    numeroVocales++;
                    break;
                }
            }
        }
        System.out.println("la frase contiene: "+numeroVocales+ " vocales");
    }

    public void stringDiferencias() {
        String cadenaMayor;
        String cadenaMenor;
        String Diferencias = "";
        System.out.println("Ingrese la primera frase");
        String frase1 = captura.nextLine();
        System.out.println("Ingrese la segunda frase");
        String frase2 = captura.nextLine();
        if (frase1.equals(frase2)) System.out.println("las frases son iguales");
        else {
            System.out.println("los string son diferentes ");

            if (frase1.length() >= frase2.length()) {
                cadenaMayor = frase1;
                cadenaMenor = frase2;
            } else {
                cadenaMayor = frase2;
                cadenaMenor = frase1;
            }
            for (int i = 0; i < cadenaMayor.length(); i++) {
                if (i < cadenaMenor.length()) {
                    if (cadenaMayor.charAt(i) == cadenaMenor.charAt(i)) {
                        Diferencias += " ";
                    } else Diferencias += cadenaMayor.charAt(i);
                }
                else Diferencias += cadenaMayor.charAt(i);
            }
            System.out.println("tomando como base el primer String o el String mayor las diferencias son :"+Diferencias);
        }
    }
    public void fechaActual() {
        LocalDateTime FechaActual= LocalDateTime.now();
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("yyyy/MM/DD HH:mm:ss");
        System.out.println(formatoFecha.format(FechaActual));
    }

    public void Saltos(){
        System.out.println("Ingrese el numero inicial");
        int numInicial = captura.nextInt();
        for (int i=numInicial; i<=1000;i=i+2 ){
            System.out.println(i);
        }
    }
    public void Menu(){
        int opcion=0;
        do{
        System.out.println("******GESTION CINEMATOGRAFICA******");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
        System.out.println("Ingrese su opcion");
        opcion = captura.nextInt();
        if (opcion <1 || opcion>8) System.out.println("OPCION INCORRECTA");
        }while (opcion !=8);

    }

}
