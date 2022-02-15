package com.sofka.taller;

public class Videojuego implements Entregable {
    String Titulo="";
    int HorasEstimadas = 10;
    boolean Entregado=false;
    String Genero="";
    String Compañia="";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        Titulo = titulo;
        HorasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        Titulo = titulo;
        HorasEstimadas = horasEstimadas;
        Genero = genero;
        Compañia = compañia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getHorasEstimadas() {
        return HorasEstimadas;
    }


    public String getGenero() {
        return Genero;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        HorasEstimadas = horasEstimadas;
    }

    public void setEntregado(boolean entregado) {
        Entregado = entregado;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setCompañia(String compañia) {
        Compañia = compañia;
    }

    @Override
    public String toString() {
        return "Titulo: "+Titulo+"\n"+"Horas estimado: "+HorasEstimadas+"\n"+"Entregado: "+Entregado+"\n"+"Genero: "+
                Genero+"\n"+"Compañia: "+Compañia+"\n"+"********** \n";
    }

    @Override
    public void entregar() {
        Entregado=true;
    }

    @Override
    public void devolver() {
        Entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return Entregado;
    }

    @Override
    public void compareTo(Object a) {
        Videojuego serie=(Videojuego) a;
        int horas=serie.getHorasEstimadas();
        if(HorasEstimadas > horas){
            System.out.println("El videojuego "+Titulo+" tiene mas horas estimadas que "+  ((Videojuego) a).getTitulo());
        }
        else System.out.println("El videojuego "+((Videojuego) a).getTitulo()+" tiene mas horas estimadas que "+ Titulo);
    }
}
