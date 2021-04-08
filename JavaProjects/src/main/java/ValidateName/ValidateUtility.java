package ValidateName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidateUtility
{
    @SuppressWarnings("resource")
	public static void main(String args[])
    {
        //fill code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String proname = sc.nextLine();
        
        Validate nameValid = validateEmployeeName();
        boolean nameValidate = nameValid.validateName(name);
        
        if(nameValidate)
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        
        Validate proValid = validateProductName();
        boolean proValidate = proValid.validateName(proname);
        
        if(proValidate)
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");

    }

    public static Validate validateEmployeeName() 
    {
        //fill code here
        return name -> {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\s]{5,20}$");
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        };
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        return name -> {
            Pattern pattern = Pattern.compile("^[a-zA-Z]\\d{5}$");
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        };
    }
}