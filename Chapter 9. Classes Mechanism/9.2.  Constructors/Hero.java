/**
 * Hero
 */
public class Hero {
    int hp;
    String name;

    void attack () {

    }

    Hero () {
        // This constructor can call following processes but it is very repetitive
        // this.hp = 100;
        // this.name = "Unknown";

        // So, it can call another constructor as follows
        this("Unknwon");

        // That process is called "Constructor Chaining"
    }

    Hero (String name) {
        this.hp = 100;
        this.name = name;
    }
}