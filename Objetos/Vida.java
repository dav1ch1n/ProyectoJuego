package Objetos;
import Personajes.Personaje;

public class Vida extends Objeto{
	public Vida(Personaje personaje) {
        super(personaje);
        this.valorPlus=30;
    }
    @Override
    public int aplicarMejora() {
        return personaje.getVida() + valorPlus;
    }
}
