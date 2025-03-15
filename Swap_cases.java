package strings;
import java.util.Scanner;
public class Swap_cases {
	public static String lower(String s){
	String a="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z') {
		a=a+(char)(ch+32);
	}
	else if(ch>='a'&&ch<='z'){
		a=a+(char)(ch-32);
	}
	else {
		a=a+ch;
	}
	}
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter string");
	    String s=scan.next();
	    String res=lower(s);
	    System.out.println(res);
	}

}
