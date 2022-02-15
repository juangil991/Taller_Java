package com.sofka.taller;

public class VideojuegoEjecutable {
    Videojuego[] videojuegos = new Videojuego[5];

    public  VideojuegoEjecutable() {
        videojuegos[0] = new Videojuego("DMC", 50, "Hack and slash", "Capcom");
        videojuegos[1] = new Videojuego("Resident Evil 2", 80, "Survival-Horror", "Capcom");
        videojuegos[2] = new Videojuego("Final Fantasy X", 120, "RPG", "Squaresoft");
        videojuegos[3] = new Videojuego("God of War", 70, "Hack and slash", "Santa Monica");
        videojuegos[4] = new Videojuego("Castlevania", 60, "Metroidvania", "Konami");
        int MaxHoras = videojuegos[0].getHorasEstimadas();
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (videojuegos[i].getHorasEstimadas() >= MaxHoras) {
                MaxHoras = videojuegos[i].getHorasEstimadas();
                index = i;
            }
            if (videojuegos[i].isEntregado()) videojuegos[i].devolver();
            else videojuegos[i].entregar();
            System.out.println("" + videojuegos[i]);
        }
        System.out.println("El videojuego con mas horas es: \n" + "" + videojuegos[index]);

    }
}
