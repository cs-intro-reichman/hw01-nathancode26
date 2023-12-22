/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        // Put your code here
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int random1 = (int) ((b - a + 1) * Math.random() + a);
        int random2 = (int) ((b - a + 1) * Math.random() + a);
        int random3 = (int) ((b - a + 1) * Math.random() + a);
        int minus = Math.min(random1,Math.min(random2, random3));
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random2);
        System.out.println("The minimal generated number was " + minus);
	}
}
