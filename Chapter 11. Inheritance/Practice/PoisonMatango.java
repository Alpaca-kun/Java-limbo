/**
 * PoisonMatango
 */
public class PoisonMatango extends Matango {
    private int timesToAttack = 5;

    public PoisonMatango (char newSuffix) {
        super(newSuffix);
    }

    public void attack (Hero h) {
        super.attack(h);

        if (this.timesToAttack > 0) {
            System.out.println("And spread poisonous pores!!!");

            int heroHP = h.getHP();
            int poisonDamage = heroHP / 5;

            h.setHP(heroHP - poisonDamage);

            System.out.println(h.getName() + " took " + poisonDamage + " damages!");

            this.timesToAttack--;
        }
    }
}