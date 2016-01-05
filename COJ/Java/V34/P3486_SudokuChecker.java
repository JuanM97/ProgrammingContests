/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V34;

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class P3486_SudokuChecker {
    static PrintWriter out=new PrintWriter(System.out);
    static Scanner sc=new Scanner(System.in);
    static final int smx = 10;
    static int[][] sud = new int[smx][smx];
    //static boolean[] st = new boolean[smx];
    static HashSet<Integer> set = new HashSet();
    /*
    static boolean checkSq(int r, int c){
        set.clear();
        //for(int i=0;i<smx;i++)st[i] = false;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                set.add(sud[i][j]);
                //st[sud[i][j]] = true;
            }
        }
        //for(int i=1;i<smx;i++)if(!st[i])return false;
        //return true;
        return set.size()==9;
    }
    
    static boolean checkH(int r){
        set.clear();
        //for(int i=0;i<smx;i++)st[i] = false;
        for(int i=0;i<9;i++){
            set.add(sud[r][i]);
            //st[sud[r][i]] = true;
        }
        //for(int i=1;i<smx;i++)if(!st[i])return false;
        //return true;
        return set.size()==9;
    }
    
    static boolean checkV(int r){
        set.clear();
        //for(int i=0;i<smx;i++)st[i] = false;
        for(int i=0;i<9;i++){
            set.add(sud[i][r]);
            //st[sud[i][r]] = true;
        }
        //for(int i=1;i<smx;i++)if(!st[i])return false;
        //return true;
        return set.size()==9;
    }
    */
    public static void main(String[] args) {
        char[] line;
        int r,c;
        boolean ch, tmp;
        //while(sc.hasNext()){
            //r = sc.nextInt();
            //sc.nextLine();
            //if(r<0)break;
            r = 0;
            for(int i=0;i<11;i++){
                line = sc.nextLine().toCharArray();
                if(line[0]=='-')continue;
                c = 0;
                for(int j=0;j<line.length;j++){
                    if(line[j]>='0' && line[j]<='9')
                        sud[r][c++] = line[j]-'0';
                }
                r++;
            }
            //out.println(Arrays.deepToString(sud));
            ch = true;
            for(int i=0;i<6;i+=3){
                for(int j=0;j<6;j+=3){
                    set.clear();
                    for(int ii=i;ii<i+3;ii++){
                        for(int jj=j;jj<j+3;jj++){
                            set.add(sud[ii][jj]);
                        }
                    }
                    ch &= (set.size()==9);
                    if(!ch)break;
                }
            }
            if(ch){
                for(int i=0;i<9;i++){
                    set.clear();
                    for(int ii=0;ii<9;ii++) set.add(sud[i][ii]);
                    ch &= (set.size()==9);
                    if(!ch)break;
                    
                    set.clear();
                    for(int ii=0;ii<9;ii++) set.add(sud[ii][i]);
                    ch &= (set.size()==9);
                    if(!ch)break;
                }
            }
            out.println(ch?"CORRECT":"WRONG");
        //}
        out.close();
    }
    
}


