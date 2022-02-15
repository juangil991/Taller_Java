package com.sofka.taller;

public class Serie implements Entregable {
    String Titulo="";
    int NumeroDeTemporadas=3;
    boolean Entregado=false;
    String Genero="";
    String Creador="";

    public Serie(){

    }

    public Serie(String titulo, String creador) {
        Titulo = titulo;
        Creador = creador;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        Titulo = titulo;
        NumeroDeTemporadas = numeroDeTemporadas;
        Genero = genero;
        Creador = creador;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getNumeroDeTemporadas() {
        return NumeroDeTemporadas;
    }

    public String getGenero() {
        return Genero;
    }

    public String getCreador() {
        return Creador;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        NumeroDeTemporadas = numeroDeTemporadas;
    }

    public void setEntregado(boolean entregado) {
        Entregado = entregado;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    @Override
    public String toString() {
        return "Titulo: "+Titulo+"\n"+"Temporadas: "+NumeroDeTemporadas+"\n"+"Entregado: "+Entregado+"\n"+"Genero: "+
                Genero+"\n"+"Creador: "+Creador+"\n"+"************** \n";
    }

    @Override
    public void entregar() {
        Entregado=true;
    }

    @Override
    public void devolver() {
        Entregado=false;
    }

    public boolean isEntregado() {
        return Entregado;
    }
    @Override
    public void compareTo(Object a) {
        Serie serie=(Serie)a;
        int temporadas=serie.NumeroDeTemporadas;
        if(NumeroDeTemporadas > temporadas){
         System.out.println("la serie "+Titulo+" tiene mas temporadas que "+  ((Serie) a).getTitulo());
        }
        else System.out.println("la serie "+((Serie) a).getTitulo()+" tiene mas temporadas que "+ Titulo);
    }
}
