public class Archer extends Character {
	private int attackCount;
  
	public Archer(String name) {
		super(name, 90, 12);
		this.attackCount = attackCount;
	}
  
	@Override
	public void attack(Character target) {
		attackCount++;
		if (attackCount % 3 == 0) {
			System.out.println(getName() + " fires a DOUBLE SHOT!");
			super.attack(target);
			super.attack(target);
		} else {
			super.attack(target);
		}
  }
}
