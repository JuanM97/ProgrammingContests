/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package V22;

/**
 *
 * @author JuanManuel
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
	int x, y;
	public int compareTo(Point p) {
		if (this.x == p.x) {
			return this.y - p.y;
		} else {
			return this.x - p.x;
		}
	}
	public String toString() {
		return "("+x + "," + y+")";
	}
}

class ConvexHull {
 
	public static long cross(Point O, Point A, Point B) {
		return (A.x - O.x) * (B.y - O.y) - (A.y - O.y) * (B.x - O.x);
	}
 
	public static Point[] convex_hull(Point[] P) {
 
		if (P.length > 1) {
			int n = P.length, k = 0;
			Point[] H = new Point[2*n];
			Arrays.sort(P);
			for (int i = 0; i < n; ++i) {
				while (k >= 2 && cross(H[k - 2], H[k - 1], P[i]) <= 0)
					k--;
				H[k++] = P[i];
			}
			// Build upper hull
			for (int i = n - 2, t = k + 1; i >= 0; i--) {
				while (k >= t && cross(H[k - 2], H[k - 1], P[i]) <= 0)
					k--;
				H[k++] = P[i];
			}
			H[k-1]=null; // remove repetition
			return H;
		} else if (P.length <= 1) {
			return P;
		} else{
			return null;
		}
	}
}
public class P2277_DiamondDealer { 
        static PrintWriter out=new PrintWriter(System.out);
        static Scanner sc=new Scanner(new InputStreamReader(System.in));
        static Point[] ps;
        static ConvexHull ch=new ConvexHull();
	public static void main(String[] args) throws IOException {
                int t,p,q,n,a,b,ll,r;
                t=sc.nextInt();
                for(int i=0;i<t;i++){
                    p=sc.nextInt();
                    q=sc.nextInt();
                    n=sc.nextInt();
                    ps=new Point[n];
                    for(int j=0;j<n;j++){
                        a=sc.nextInt();
                        b=sc.nextInt();
                        ps[j]=new Point();
                        ps[j].x=a;
                        ps[j].y=b;
                    }
                    /*for(int j=0;j<n;j++){
                        System.out.println(ps[j].x+" "+ps[j].y);
                    }*/
                    Point[] hall=ch.convex_hull(ps).clone();
                    ll=0;
                    for (Point hall1 : hall) {
                        if (hall1 != null) {
                            //System.out.print(hall[kk]);
                            ll++;
                        }
                    }
                    
                    r=-(n-ll)*p+(2*ll-n)*q>0?-(n-ll)*p+(2*ll-n)*q:0;
                    System.out.printf("%d\n",r);
                    
                }
		
	}
 
}
