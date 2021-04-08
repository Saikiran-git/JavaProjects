package DisplayCharacters;

import java.util.Scanner;

public class AsciValue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the digits:");
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    int num3 = sc.nextInt();
	    int num4 = sc.nextInt();
	    char c1 = (char)num1;
	    char c2 = (char)num2;
	    char c3 = (char)num3;
	    char c4 = (char)num4;
	    System.out.println(num1+"-"+c1);
	    System.out.println(num2+"-"+c2);
	    System.out.println(num3+"-"+c3);
	    System.out.println(num4+"-"+c4);
	}

}
