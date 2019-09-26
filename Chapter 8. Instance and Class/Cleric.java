import java.util.Random;

/**
 * Cleric
 * 
 * An exercise of the tutorial I need to make a Cleric class that has other
 * properties
 */
public class Cleric {
    String name;

    int hp = 50;
    final int maxHP = 50;
    int mp = 10;
    final int maxMP = 10;

    void selfAid() {
        if ((this.hp < this.maxHP) && (this.mp >= 5)) {
            this.mp -= 5;
            this.hp = this.maxHP;

            System.out.println(this.name + "\'s HP was restored.");
        }

        else if (this.hp == this.maxHP) {
            System.out.println(this.name + "\'s HP is already full!'");
        }

        else if (this.mp < 5) {
            System.out.println(this.name + " hasn't enough MP to spell!");
        }

        System.out.println(this.name + "\'s actual MP is " + this.mp);
    }

    int pray(int second) {
        int recoveredMP = new Random().nextInt(3) + second;
        int realValueOfGainedMP = Math.min(this.maxMP - this.mp, recoveredMP);

        System.out.println(this.name + " prayed...");
        System.out.println(this.name + " gained " + realValueOfGainedMP + " of MP!");

        return realValueOfGainedMP;
    }
}