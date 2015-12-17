
public abstract class Destructible {
	private double LifePoints;
	
	public void LooseLife(double p){
		LifePoints -= p;
	}

	public double getLifePoints() {
		return LifePoints;
	}
	
	public Destructible(double p){
		LifePoints = p;
	}
}
