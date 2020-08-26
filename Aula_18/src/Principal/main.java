package Principal;

import java.util.ArrayList;
import java.util.List;

import animais.Animal;
import animais.Cachorro;
import animais.Mamifero;
import animais.Passaro;

public class main {

	public static void main(String[] args) {
		Animal a1 = new Cachorro();
		Animal a2 = new Mamifero();
		Animal a3 = new Passaro();
		
		List<Animal> lista = new ArrayList<>();
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		a1.falar();
		a2.falar();
		a3.falar();
		
		for(Animal a : lista) {
			if( a instanceof Mamifero) {
				System.out.println("Mamifero");
			}
			if( a instanceof Passaro) {
				System.out.println("Passaro");
			}
		}
	}
}
