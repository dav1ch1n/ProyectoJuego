package Personajes;

public class Tidus extends Personaje{
	protected String nombre;
	protected int bonus;
	public Tidus(String nombre) {
		this.nombre = "Tidus";
		this.bonus=30;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int getAtaque() {
		ataque=150;
		return ataque;
	}
	@Override
	public int getDefensa() {
		defensa=50;
		return defensa;
	}
	@Override
	public int getVida() {
		vida=400;
		return vida;
	}
	@Override
	public void atributos() {
		vida=400;
		ataque=150;
		defensa=50;
		System.out.println("El personaje "+nombre+" tiene unas caracteristicas: vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa);
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public void Bonus(int num) {
		int vuelta=0;
		if (num == 0) {
			vida+=bonus;
		}
		else if (num == 1){
			ataque+=bonus;
		}
		else if (num == 2){
			defensa+=bonus;
		}	
	}
	public String toString() {
		return "El personaje "+nombre+" tiene unas "+ super.toString();
	}
}
