package Objetos;

import Personajes.Personaje;

public class AtaquePlus extends Objeto{
	public AtaquePlus(Personaje personaje) {
        super(personaje);
        this.valorPlus=50;
    }

    @Override
    public int aplicarMejora() {
        return personaje.getAtaque() + valorPlus;
    }
	
}
