package V11;

import java.util.Scanner;
import java.io.PrintWriter;
public class P1177_GroupReverse{

	public static void main(String[] args){

		StringBuilder string;
		StringBuilder aux;
		StringBuilder ans;

		Scanner sc = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out);
		int g,a;

		while((g = sc.nextInt())!=0){
			string = new StringBuilder(sc.nextLine().trim());
                        //out.println(string.toString());
                        ans = new StringBuilder("");
			int length = string.length();
                        a=length/g;
			for(int i = 0; i<length; i+=a){
				aux = new StringBuilder(string.substring(i,i+a));
				aux.reverse();
				ans.append(aux);
			}
                        out.println(ans);
		}
                out.flush();
		
	}
}
