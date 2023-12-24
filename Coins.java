/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
        // Put your code here
		int number_quarter = 0;
        int number_cent = 0;
        int quarter = 25;
        int cent = 1;
        int number = Integer.parseInt(args[0]);

        if (number % quarter == 0) {
            number_quarter = number / quarter;
        } else {
            while (number > 24) {
                number_quarter += 1;
                number -= quarter;
            }
            number_cent = number;
        }
        System.out.println("Use " + number_quarter + " quarters and " +  number_cent + " cents"); 
	}
}
