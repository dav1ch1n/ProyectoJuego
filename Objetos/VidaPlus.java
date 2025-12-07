package Objetos;

import Personajes.Personaje;

public class VidaPlus extends Objeto{
	public VidaPlus(Personaje personaje) {
        super(personaje);
        this.valorPlus=50;
    }
    @Override
    public int aplicarMejora() {
        return personaje.getVida() + valorPlus;
    }
}
