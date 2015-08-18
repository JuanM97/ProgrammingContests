/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V04;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
public class P445_MarvelousMazes {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        String line;
        StringBuilder maze = new StringBuilder("");
        int cont = 0;
        char cc = '0';
        while(sc.hasNext()){
            line = sc.nextLine().trim();
            if(line.equals("p")) break;
            if(line.length()==0){
                out.println();
                maze.delete(0,maze.length());
                continue;
            }
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)=='!'){
                    out.println(maze.toString());
                    maze.delete(0,maze.length());
                }
                if(line.charAt(i)>='0' && line.charAt(i)<='9'){
                    cont += (line.charAt(i)-'0');
                }else{
                    cc = line.charAt(i);
                    if(line.charAt(i)=='b') cc = ' ';
                    for(int j=0;j<cont;j++){
                        maze.append(cc);
                    }
                    cont = 0;
                }
            }
            if(maze.length()!=0){
                out.println(maze.toString());
                maze.delete(0,maze.length());
            }
        }
        
        out.flush();
    }
    
}


