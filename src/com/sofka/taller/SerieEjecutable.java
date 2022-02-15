package com.sofka.taller;

public class SerieEjecutable {
    Serie[] series = new Serie[5];
    public SerieEjecutable() {
        series[0] = new Serie("Breaking Bad", 5, "Triller", "Vince Gilligan");
        series[1] = new Serie("Rick y Morty", 5, "comedia sci-fi", "Dan Harmon");
        series[2] = new Serie("Mr. Robot", 4, "Drama", "Sam Esmail");
        series[3] = new Serie("Supernatural", 15, "Drama,Accion", "Warner Bros");
        series[4] = new Serie("The Big Bang Theory", 12, "Comedia", "Warner Bros");
        int MaxHoras = series[0].getNumeroDeTemporadas();
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (series[i].getNumeroDeTemporadas() >= MaxHoras) {
                MaxHoras = series[i].getNumeroDeTemporadas();
                index = i;
            }
            if (series[i].isEntregado()) series[i].devolver();
            else series[i].entregar();
            System.out.println("" + series[i]);
        }
        System.out.println("El videojuego con mas Temporadas es: \n" + "" + series[index]);
    }
}
