/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V23;

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
public class P2352_PhoneList {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static ArrayList<String> phones = new ArrayList();
    static HashSet<String> st = new HashSet();
    
    public static void main(String[] args) {
        int T,N;
        boolean found;
        T = sc.nextInt();
        while(T-->0){
            N = sc.nextInt();
            phones.clear();
            st.clear();
            for(int i=0;i<N;i++){
                phones.add(sc.next());
            }
            found = false;
            for(String ph : phones){
                for(int i=1;i<ph.length();i++){
                    st.add(ph.substring(0,i));
                }
                //st.add(ph);
                //out.println(st);
            }
            for(String ph : phones){
                if(st.contains(ph)){
                    found = true;
                    break;
                }
            }
            out.println(found?"NO":"YES");
        }
        out.close();
    }
    
}


