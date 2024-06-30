import java.util.Scanner;
public class passwordchecker 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a password: ");
String password = scanner.nextLine();
scanner.close();
if (isStrong(password)) 
{
System.out.println("Strength of password: Strong");
} 
else 
{
System.out.println("Strength of password: Weak");
}
}
public static boolean isStrong(String password) 
{
int length = password.length();
boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecialChar = false;
for (char ch : password.toCharArray()) 
{
if (Character.isLowerCase(ch)) 
{
hasLower = true;
} 
else if(Character.isUpperCase(ch)) 
{
hasUpper = true;
} 
else if (Character.isDigit(ch)) 
{
hasDigit = true;
} 
else if (isSpecialChar(ch)) 
{
hasSpecialChar = true;
}
}
return length >= 8 && hasLower && hasUpper && hasDigit && hasSpecialChar;
}
public static boolean isSpecialChar(char ch) 
{
String specialChars = "!@#$%^&*()-+";
return specialChars.contains(String.valueOf(ch));
}
}
