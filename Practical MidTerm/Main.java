public class Main {
  public static void duel(Character a, Character b) {
		int round = 1;

		do {
      System.out.println("\n=====ROUND " + round + "======");
      System.out.println(a.status() + " vs " + b.status());

      
      a.attack(b);
      //b.attack(a);
      
      if (b.isAlive()) {
        b.attack(a);
      }
      /*if (a.isAlive()) {
        a.attack(b);
      }*/
      round++;
    } while (a.isAlive() && b.isAlive());

		Character winner;
		if (a.isAlive()) {
			winner = a;
		} else {
      winner = b;
		}
    System.out.println(winner.getName() + " wins!");
	}
  public static void main(String[] args) {
    System.out.println("Practical Midterms\n");
		System.out.println("====== A VS B =====");
		Warrior Thorin = new Warrior("Thorin");
		Mage Merlin = new Mage("Merlin");
		duel(Thorin, Merlin);
  }
}
