/**
 * Hero
 */
public class Hero {
    String name;
    int hp;
    static int money; // A static field can share the data between instantiated classes, sometimes it
                      // is called a Class Variable

    static void setRandomMoney() { // A method with static keyword is called a Static method or Class method
        Hero.money = (int) (Math.random() * 1000);
    }
}