
public class Jeudegeek {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Destructible Zombie = new Monster(10);
		Destructible Arbre = new Obstacle(20);
		
		Weapon Swoop = new Axe(5);
		Weapon Smash = new Hammer(8);
		Weapon Sweep = (Weapon) Swoop.clone();
		
		/*Swoop.attack(Zombie);
		System.err.println(Zombie.getLifePoints());
		Smash.attack(Arbre);
		System.err.println(Arbre.getLifePoints());
		*/
		int compteur = 0;
		while(Zombie.getLifePoints() > 0){
			Swoop.attack(Zombie);
			compteur++;
		}
		System.out.println("Il aura fallu "+compteur+" coups de hache sur le zombie pour le tuer");
		
		compteur = 0;
		while(Arbre.getLifePoints() > 0){
			Smash.attack(Arbre);
			compteur++;
		}
		System.out.println("Il aura fallu "+compteur+" coups de marteau sur l'arbre pour le tuer");

		System.out.println(Sweep);
		System.out.println(Sweep.equals(Smash));
	}

}
