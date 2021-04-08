package StringConcatenation;

import java.util.Scanner;

public class Authority {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name = sc.nextLine();
        System.out.println("Inmate's father's name:");
        String father = sc.nextLine();
        if(!name.matches("^[ a-zA-Z]+$") || !father.matches("^[ a-zA-Z]+$")){
            System.out.println("Invalid name");
            return;
        }
        else{
            System.out.println(name.toUpperCase()+" "+father.toUpperCase());
        }
	}

}
