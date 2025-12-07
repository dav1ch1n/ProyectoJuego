package Objetos;

import Personajes.Personaje;

public class DefensaPlus extends Objeto{
	public DefensaPlus(Personaje personaje) {
        super(personaje);
        this.valorPlus=50;
    }
    @Override
    public int aplicarMejora() {
        return personaje.getDefensa() + valorPlus;
    }
}
