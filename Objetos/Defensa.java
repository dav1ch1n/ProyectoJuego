package Objetos;
import Personajes.Personaje;

public class Defensa extends Objeto{
	public Defensa(Personaje personaje) {
        super(personaje);
        this.valorPlus=30;
    }

    @Override
    public int aplicarMejora() {
        return personaje.getDefensa() + valorPlus;
    }
}
