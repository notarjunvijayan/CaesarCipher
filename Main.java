import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    //Variable Declaration
	    String str = "";
	    String res = "";
	    int k,len,i;
	    char ch;
	    
	    //Input and Value Initialization
		System.out.print("Enter input: ");
		Scanner io = new Scanner(System.in);
		str = io.nextLine();
		System.out.print("Enter key: ");
		Scanner n = new Scanner(System.in);
		k = io.nextInt();
		
	    System.out.print("1.Encryption 2.Decryption: ");
		Scanner v = new Scanner(System.in);
		int val = v.nextInt();
		
		//Key Shift
		switch(val){
		    case 1:
		        len = str.length();
		        for(i=0;i<len;i++){
		            ch = str.charAt(i);
		            int ascii = (int) ch;
		            ascii +=k;
		            res = res + (char)ascii;
		        }
		        break;
		     case 2:
		        len = str.length();
		        for(i=0;i<len;i++){
		            ch = str.charAt(i);
		            int ascii = (int) ch;
		            ascii -=k;
		            res = res + (char)ascii;
		        }
		        break;
		}
		
		//Output
		System.out.println(res);
	}
}
