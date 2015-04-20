package com.basico.hechoscuriosos;

import java.util.Random;


public class BaseCurioso{

        public String[] hecho = {
        "En 2000 se patentó en EEUU un juguete que absorbe tus pedos y luego los enciende para lanzar un pequeño misil.",
        "Los números de la serie Lost corresponden a jugadores retirados de los Yankees de NY. ",
        "El koala duerme 22 horas al día. ",
        "En el Líbano esta permitido tener relaciones sexuales con un animal, siempre y cuando sea del sexo opuesto. ",
        "Los cocodrilos no pueden sacar la lengua.",
        "En 1939 Adolf Hitler fue nominado para el Premio Nobel de la Paz.",
        "Los pingüinos hembra se prostituyen para conseguir piedras para sus nidos.",
        "En los juegos olímpicos antiguos los participantes tenían que competir desnudos. ",
        "En Ebay se vende la novela de ‘Moby Dick’ escrita sobre papel higiénico.",
        "El caracol cónico es uno de los animales mas venenosos de la tierra.",
        "Los colores del logotipo de Google vienen de que el ordenador que se usó para crear Google estaba hecho con piezas de lego. "
        };

    public String ObtenerHecho(){

        String hechoAlea = "";

        Random genAlea = new Random();
        int numAlea = genAlea.nextInt(hecho.length);

        hechoAlea = hecho[numAlea];

        return hechoAlea;
    }
}
