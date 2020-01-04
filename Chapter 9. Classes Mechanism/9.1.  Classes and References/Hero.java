public class Hero {
    String name;
    int hp;
    Sword sword;

    void attack () {
        System.out.println(this.name + " attacked!");
        System.out.println("Caused 5 damage to enemy.:");
    }
}