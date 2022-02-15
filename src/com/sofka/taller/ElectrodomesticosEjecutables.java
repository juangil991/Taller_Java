package com.sofka.taller;

public class ElectrodomesticosEjecutables {
    Electrodomestico[] electrodomesticos= new Electrodomestico[10];
    int precioTotal=0;

    public ElectrodomesticosEjecutables(){
        electrodomesticos[0]=new Television(100,"blanco",'A',20,50,true);
        electrodomesticos[1]=new Lavadora(130,"rojo",'B',40,45);
        electrodomesticos[2]=new Television(99,"amarillo",'C',70,30,true);
        electrodomesticos[3]=new Television(35,"violeta",'D',83,20,false);
        electrodomesticos[4]=new Lavadora(40,"verde",'E',82,30);
        electrodomesticos[5]=new Lavadora(200,"azul",'E',25,25);
        electrodomesticos[6]=new Television(250,"blanco",'F',40,50,true);
        electrodomesticos[7]=new Television(100,"rosa",'A',50,60,false);
        electrodomesticos[8]=new Television(110,"negro",'B',36,10,true);
        electrodomesticos[9]=new Lavadora(300,"azul",'C',48,50);

        for(int i=0;i<10;i++){
            System.out.println("precio "+i+": "+electrodomesticos[i].precioFinal()+"€");
            precioTotal+=electrodomesticos[i].precioFinal();
        }
        System.out.println("el precio total de los electrodomesticos es: "+precioTotal +"€");
    }

}
