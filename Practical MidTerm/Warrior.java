public class Warrior extends Character {
	private int armor;
  
	public Warrior(String name) {
		super(name, 120, 15);
	}
  
	@Override
	public void takeDamage(int amount) {
		if (amount < 0) {
			return;
		}
    int blocked = Math.min(amount, armor);
    int damage = amount - blocked;
    
    System.out.println(getName() + " armor blocks " + blocked + " damage.");
    super.takeDamage(damage);
  }
}
