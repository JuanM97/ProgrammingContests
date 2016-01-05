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
public class P476_PointsInFiguresRectangles {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static class Rectangle{
        double xi,yi,xf,yf;
        public Rectangle(double xi,double yf, double xf, double yi){
            this.xi = xi;
            this.yi = yi;
            this.xf = xf;
            this.yf = yf;
        }
        @Override
        public String toString(){
            return String.format("[%d,%d; %d,%d]",xi,yi,xf,yf);
        }
    }
    
    static void test(double x, double y, int fig){
        boolean fd = false;
        for(int i=0;i<k;i++){
            if( (x>rs[i].xi && x<rs[i].xf) && (y<rs[i].yf && y>rs[i].yi) ){
                fd = true;
                System.out.printf("Point %d is contained in figure %d%n",fig,(i+1));
            }
        }
        if(!fd)
            System.out.printf("Point %d is not contained in any figure%n",fig);
    }
    static int k = 0;
    static int smx = 30;
    static Rectangle[] rs = new Rectangle[smx];
    public static void main(String[] args) {
        String s;
        int fig = 1;
        double xi,yf,xf,yi;
        while(sc.hasNext()){
            s = sc.next();
            if(s.equals("r")){
                xi = sc.nextDouble();
                yf = sc.nextDouble();
                xf = sc.nextDouble();
                yi = sc.nextDouble();
                rs[k++] = new Rectangle(xi,yf,xf,yi);
            }
            if(s.equals("s"))break;
            if(s.equals("*")){
                while(sc.hasNext()){
                    xi = sc.nextDouble();
                    yi = sc.nextDouble();
                    if(xi==9999.9 && yi ==9999.9) break;
                    test(xi,yi,fig++);
                }
            }
        }
        
    }
    
}

