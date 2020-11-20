/*
(Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(100) method.
 */

public class Opgave9_4 {
    public static void main(String[] args) {
        //Create random object with 1000 seed
        java.util.Random randomNumber = new java.util.Random(1000);

        //Display the first 50 random integers between 0 and 100
        for (int i = 1; i <=50; i++) {

            if (i % 10 == 0)
                System.out.println(randomNumber.nextInt(100));
            else
                System.out.println(randomNumber.nextInt(100));
            
        }
    }
}
