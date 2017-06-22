package inheritance;
import java.io.*;
public class reverse
public static void main(string[] args)
{
	Scanner input = new Scanner (System.in);
String word = input.next();
String reverse = "";
for(int i=word.length()-1; i>=0; i--)
    reverse += word.charAt(i);
System.out.println(reverse);        
}


		
		
		
}


