
abstract public class Weapon {
	protected int Damage;
	
	public Weapon(int d){
		Damage = d;
	}

	abstract public void attack(Monster m);
	abstract public void attack(Obstacle o);
	abstract public void attack(Destructible d);
	
	protected Object clone() throws CloneNotSupportedException {
		if(this instanceof Axe)
			return new Axe(Damage);
		else if(this instanceof Hammer)
			return new Hammer(Damage);
		return null;
	}
	
	public boolean equals(Object obj){
		return ((Weapon)obj).Damage == Damage;
	}
	
	public String toString(){
		return "Weapon which can deal "+Damage+" amount of damage." ;
	}
}
