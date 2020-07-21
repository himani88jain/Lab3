import java.util.Scanner;

public class OddEvenNum {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scr.next();
		boolean b = true;
		System.out.println("Hey " + name + " Please enter an integar between 1 and 100");

		while (b == true) {
			int num = scr.nextInt();
			if (num >= 0 && num <= 100) {
				if (num % 2 == 0) {
					if (num < 25) {
						System.out.println("Hey "+name+" This number is even and less than 25");
					} else if (num >= 26 && num < 60) {
						System.out.println(("Even"));
					} else if (num >= 60) {
						System.out.println("Hey "+name +" the number entered is " + num + " and is Even");
					}
				} else {
					if (num <= 60) {
						System.out.println("Hey "+name+" the number entered is " + num + " and is Odd");
					} else {
						System.out.println("Hey "+name+"the number entered is " + num + " and is Odd and over 60");
					}
				}
				b = false;
			} else {
				System.out.println("Please enter a valid integar between 1 and 100");
				b = true;

			}
		}
		scr.close();
	}

}
