package Personajes;

public abstract class Personaje {
	public static int vida;
	public static int ataque;
	public static int defensa;
	public abstract int getVida();
	public abstract int getAtaque();
	public abstract int getDefensa();
	public abstract void atributos();
	public abstract int getBonus();
	@Override
	public String toString() {
		return "caracteristicas: vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa;
	}
	public void Bonus(int objeto) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
