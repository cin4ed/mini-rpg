package com.ids.proyecto_final;

import com.ids.proyecto_final.personajes.Personaje;

public class Jugador {

    private Personaje []personajes={null,null,null};
    private Personaje personajeActual;

    public Jugador(Personaje[] personajes, Personaje personajeActual) {
        this.personajes = personajes;
        this.personajeActual = personajeActual;
    }

    public void haPerdido(){
    }

    private void  cambiarDePersonaje(){
    }
}
