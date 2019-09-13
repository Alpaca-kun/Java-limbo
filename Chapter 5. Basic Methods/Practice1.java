/**
 * Practice1
 * Create a method called "introduceOneSelf" that print a simple
 * text with Name, Age, Height, Sex
 */
public class Practice1 {

    public static void main(String[] args) {
        introduceOneSelf();
    }

    public static void introduceOneSelf() {
        String name = "Christian";
        int age = 26;
        double height = 1.66;
        char sex = 'M';

        System.out.println("Hello. My name is " + name + "." + 
                            " I`m " + age + "." +
                            " I have " + height + "m. And my sex is " + sex);
        
    }
}