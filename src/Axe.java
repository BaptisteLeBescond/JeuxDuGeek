
public class Axe extends Weapon{

	public Axe(int d) {
		super(d);
	}

	@Override
	public void attack(Monster m) {
		double dmg = Damage*0.8;
		m.LooseLife(dmg);
	}
	
	@Override
	public void attack(Obstacle o) {
		double dmg = Damage*1.2;
		o.LooseLife(dmg);
	}
	
	@Override
	public void attack(Destructible d) {
		if(d instanceof Monster){
			double dmg = Damage*0.8;
			d.LooseLife(dmg);
		}
		else if(d instanceof Obstacle){
			double dmg = Damage*1.2;
			d.LooseLife(dmg);
		}
		else
			return;
	}

}
