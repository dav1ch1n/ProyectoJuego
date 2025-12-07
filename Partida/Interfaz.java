package Partida;
import Personajes.Gohan;
import Personajes.Goku;
import Personajes.Mario;
import Personajes.Maxattack;
import Personajes.Personaje;
import Personajes.Pikachu;
import Personajes.Sonic;
import Personajes.Tanque;
import Personajes.Tidus;
import java.util.Scanner;

public class Interfaz {
	static Personaje ataque;
	static Personaje defensa;
	static Personaje vida;
	static void inicio() {
		System.out.println("1-Escoger personaje: ");
		System.out.println("2-Información del personaje.");
		System.out.println("3-Objeto.");
		System.out.println("4-Atacar.");
		System.out.println("5-Finalizar.");
		System.out.println("Tienes que escribir los numeros que ocan en cada paso.");
	}
	static void personajes() {
		System.out.println("La lista de personajes disponibles según tengan mas ataque, vida o defensa: ");
		System.out.println("Ataque:  Tidus, Maxatattack, Sonic");
		System.out.println("Defensa: Tanque");
		System.out.println("Vida: Gohan, Goku");
		System.out.println("Equlibrados: Mario, Pikachu");
	}

	static int ValorAtaque(String personaje) {
		Personaje atributos[] = new Personaje[8];
		atributos [0] = new Gohan(personaje);
		atributos [1] = new Goku(personaje);
		atributos [2] = new Mario(personaje);
		atributos [3] = new Maxattack(personaje);
		atributos [4] = new Pikachu(personaje);
		atributos [5] = new Sonic(personaje);
		atributos [6] = new Tanque(personaje);
		atributos [7] = new Tidus(personaje); 
		
		int ataques = switch(personaje) {
		case "gohan" ->  {yield atributos[0].getAtaque(); }
		case "goku" -> {yield atributos[1].getAtaque();}
		case "mario" -> {yield atributos[2].getAtaque();}
		case "maxattack" -> {yield atributos[3].getAtaque();}
		case "pikachu" -> {yield atributos[4].getAtaque();}
		case "sonic" -> {yield atributos[5].getAtaque();}
		case "tanque" -> {yield atributos[6].getAtaque();}
		case "tidus" -> {yield atributos[7].getAtaque();}
		default -> {yield -1;}
		};
		return ataques;
	}
	static int ValorDefensa(String personaje) {
		Personaje atributos[] = new Personaje[8];
		atributos [0] = new Gohan(personaje);
		atributos [1] = new Goku(personaje);
		atributos [2] = new Mario(personaje);
		atributos [3] = new Maxattack(personaje);
		atributos [4] = new Pikachu(personaje);
		atributos [5] = new Sonic(personaje);
		atributos [6] = new Tanque(personaje);
		atributos [7] = new Tidus(personaje); 
		
		int defensas = switch(personaje) {
		case "gohan" ->  {yield atributos[0].getDefensa(); }
		case "goku" -> {yield atributos[1].getDefensa();}
		case "mario" -> {yield atributos[2].getDefensa();}
		case "maxattack" -> {yield atributos[3].getDefensa();}
		case "pikachu" -> {yield atributos[4].getDefensa();}
		case "sonic" -> {yield atributos[5].getDefensa();}
		case "tanque" -> {yield atributos[6].getDefensa();}
		case "tidus" -> {yield atributos[7].getDefensa();}
		default -> {yield -1;}
		};
		return defensas;
	}
	static int ValorVida(String personaje) {
		Personaje atributos[] = new Personaje[8];
		atributos [0] = new Gohan(personaje);
		atributos [1] = new Goku(personaje);
		atributos [2] = new Mario(personaje);
		atributos [3] = new Maxattack(personaje);
		atributos [4] = new Pikachu(personaje);
		atributos [5] = new Sonic(personaje);
		atributos [6] = new Tanque(personaje);
		atributos [7] = new Tidus(personaje); 
		
		int vidas = switch(personaje) {
		case "gohan" ->  {yield atributos[0].getVida(); }
		case "goku" -> {yield atributos[1].getVida();}
		case "mario" -> {yield atributos[2].getVida();}
		case "maxattack" -> {yield atributos[3].getVida();}
		case "pikachu" -> {yield atributos[4].getVida();}
		case "sonic" -> {yield atributos[5].getVida();}
		case "tanque" -> {yield atributos[6].getVida();}
		case "tidus" -> {yield atributos[7].getVida();}
		default -> {yield -1;}
		};
		return vidas;
	}
	public static void main (String[] args) {
		System.out.println("Di tu nombre Jugador 1");
		String nombre1 = new Scanner(System.in).nextLine();
		System.out.println("Di tu nombre Jugador 2");
		String nombre2 = new Scanner(System.in).nextLine();
		String personaje="";
		String personaje2="";
		int ataque1=0;
		int defensa1=0;
		int vida1=0;
		int ataque2=0;
		int defensa2=0;
		int vida2=0;
		int daño;
		Personaje atributos[] = new Personaje[8];
		atributos [0] = new Gohan(personaje);
		atributos [1] = new Goku(personaje);
		atributos [2] = new Mario(personaje);
		atributos [3] = new Maxattack(personaje);
		atributos [4] = new Pikachu(personaje);
		atributos [5] = new Sonic(personaje);
		atributos [6] = new Tanque(personaje);
		atributos [7] = new Tidus(personaje);
		boolean comprobacion = false;
		
		atributos [0] = new Gohan(personaje2);
		atributos [1] = new Goku(personaje2);
		atributos [2] = new Mario(personaje2);
		atributos [3] = new Maxattack(personaje2);
		atributos [4] = new Pikachu(personaje2);
		atributos [5] = new Sonic(personaje2);
		atributos [6] = new Tanque(personaje2);
		atributos [7] = new Tidus(personaje2);
		comprobacion = false;
		System.out.println("Vas a entrar al menu del juego, que es lo que vas a queres hacer: ");
		inicio();
		int accion = new Scanner(System.in).nextInt();
		while(accion==5) {
			if (accion==1) {
				personajes();
				System.out.println("Jugador 1: "+nombre1+" selecciona tu personaje");
				personaje = new Scanner(System.in).nextLine().toLowerCase();
				System.out.println("Jugador 2: "+nombre2+" selecciona tu personaje");
				personaje2 = new Scanner(System.in).nextLine().toLowerCase();

	            System.out.println("Pasa al siguiente paso");
				inicio();
				accion = new Scanner(System.in).nextInt();
			}
			else if(accion==2) {
				System.out.println("Ahora verás la información de tu personaje "+nombre1);					
				while(!personaje.equals("salir") && !comprobacion) {
					switch(personaje) {
					case "gohan" ->  {atributos[0].atributos(); comprobacion=true;}
					case "goku" -> {atributos[1].atributos(); comprobacion=true;}
					case "mario" -> {atributos[2].atributos(); comprobacion=true;}
					case "maxattack" -> {atributos[3].atributos(); comprobacion=true;}
					case "pikachu" -> {atributos[4].atributos(); comprobacion=true;}
					case "sonic" -> {atributos[5].atributos(); comprobacion=true;}
					case "tanque" -> {atributos[6].atributos(); comprobacion=true;}
					case "tidus" -> {atributos[7].atributos(); comprobacion=true;}
					default -> {System.out.println("Seleciona un personaje correcto"); 
							personaje = new Scanner(System.in).nextLine().toLowerCase();}	
					}
				}
				System.out.println("Ahora verás la información de tu personaje "+nombre2);
				while(!personaje2.equals("salir") && !comprobacion) {
					switch(personaje2) {
					case "gohan" ->  {atributos[0].atributos(); comprobacion=true;}
					case "goku" -> {atributos[1].atributos(); comprobacion=true;}
					case "mario" -> {atributos[2].atributos(); comprobacion=true;}
					case "maxattack" -> {atributos[3].atributos(); comprobacion=true;}
					case "pikachu" -> {atributos[4].atributos(); comprobacion=true;}
					case "sonic" -> {atributos[5].atributos(); comprobacion=true;}
					case "tanque" -> {atributos[6].atributos(); comprobacion=true;}
					case "tidus" -> {atributos[7].atributos(); comprobacion=true;}
					default -> {System.out.println("Seleciona un personaje correcto"); 
							personaje2 = new Scanner(System.in).nextLine().toLowerCase();}	
					}
				}
	            System.out.println("Pasa al siguiente paso");
				inicio();
				accion = new Scanner(System.in).nextInt();
			}
			else if(accion==3) {
				int objeto = (int)(Math.random()*4);
				
				while(!personaje.equals("salir") && !comprobacion) {
					switch(personaje) {
					case "gohan" ->  {atributos[0].Bonus(objeto); comprobacion=true;}
					case "goku" -> {atributos[1].Bonus(objeto); comprobacion=true;}
					case "mario" -> {atributos[2].Bonus(objeto); comprobacion=true;}
					case "maxattack" -> {atributos[3].Bonus(objeto); comprobacion=true;}
					case "pikachu" -> {atributos[4].Bonus(objeto); comprobacion=true;}
					case "sonic" -> {atributos[5].Bonus(objeto); comprobacion=true;}
					case "tanque" -> {atributos[6].Bonus(objeto); comprobacion=true;}
					case "tidus" -> {atributos[7].Bonus(objeto); comprobacion=true;}
					default -> {System.out.println("ERROR");
					}
				}
			}

				accion = new Scanner(System.in).nextInt();
			}
			else if(accion==4) {
				System.out.println("Comienza el combate!!!!");
				Movimientos accion1 = new Movimientos(ataque1, defensa2, vida2);
				Movimientos accion2 = new Movimientos(ataque2, defensa1, vida1);
				System.out.println("De manera aleatoria se elegira el que empieza.");
				int empezar = (int)(Math.random()*2);
				boolean combate = true;
				
				while(combate) {
					if (empezar==0) {
						System.out.println(nombre1+" ataca");
						accion1.Movimiento();
                        if (accion1.getVidaActual() <= 0) {
                            System.out.println(nombre2 + " ha ganado!");
                            combate = false;
                            break;
                        }
                        System.out.println(nombre2+" ataca");
                        accion2.Movimiento();
                        if (accion2.getVidaActual() <= 0) {
                            System.out.println(nombre1 + " ha ganado!");
                            combate = false;
                            break;
                        }
					}
					else {
						System.out.println(nombre2+" ataca");
						accion2.Movimiento();
                        if (accion2.getVidaActual() <= 0) {
                            System.out.println(nombre1 + " ha ganado!");
                            combate = false;
                            break;
                        }
                        System.out.println(nombre1+" ataca");
                        accion1.Movimiento();
                        if (accion1.getVidaActual() <= 0) {
                            System.out.println(nombre2 + " ha ganado!");
                            combate = false;
                            break;
                        }
					}
				}
	            System.out.println("Finaliza la partida o escoge nuevos personajes y empieza de nuevo");
				inicio();
				accion = new Scanner(System.in).nextInt();
			}
			else {
				System.out.println("Pon las palabras correctas.");
				accion = new Scanner(System.in).nextInt();
			}
		}
	}
}
