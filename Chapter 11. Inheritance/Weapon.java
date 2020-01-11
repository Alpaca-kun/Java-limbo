/**
 * Weapon
 */
public class Weapon extends Item {
    // By default, when the class inherit the members from your parent class, the constructors come together
    // However, sometimes can cause errors. Because, by default, when the child class is instantiated the parent class is instantiated together by the super() method
    // So. needs to detail the child constructor to avoid errors

    // super();
    // In that case, the constructors of Item class will be called
    // But it will cause an error, because it doesn'r have the required parameters by the Item class constructors

    public Weapon () {
        super("First sword");
    }
}