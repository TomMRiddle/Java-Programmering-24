
public class JavaPlayground {
    public static void main(String[] args) {
        int myAge = 37;
        String myFirstName = "Victor";
        System.out.println("My name is " + myFirstName + " and I am " + myAge + " years old");
        boolean allowed = true;
        int x = 257;
        byte y = 8;
        int z = x % y;
        if (z <= 0) {
            System.out.println("Yes! " + x + " is evenly dividable by " + y);
        } else {
            System.out.println("No! " + x + " is not evenly dividable by " + y + ". the remainder is " + z + ".");
        }
    }
    
}
