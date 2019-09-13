import java.util.Scanner;

public class driver {
	public static void main(String[]args) {
         link l=new link();
         l.push(7);
         l.push(8);
         l.pop();
         l.pop();
         link l1=new link();
        l1.push_s('a');
         l1.push_s('m');
         l1.push_s('r');
         l1.push_s('u');
         l1.push_s('t');
         l1.push_s('h');
         l1.push_s('a');
        System.out.println("reversed string is ");
        l1.pop_s(); l1.pop_s(); l1.pop_s(); l1.pop_s(); l1.pop_s(); l1.pop_s(); l1.pop_s();
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the num/string to be checked a palindrome");
         String s=in.nextLine();
        int len= s.length();
       int i= l1.check_palindrome(s);
       if(i==1) {System.out.println("string is a palindrome");}
      else {System.out.println("string is not a palindrome");}
        link s1=new link();
        link s2=new link();
        for(int j=len-1;j>0;j--) {
        s1.push_s(s.charAt(j));
        }
        s1.check_palindrome2(s);
        
	}
}
