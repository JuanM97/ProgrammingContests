package V02;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

//Moth Eradication
public class P218_MothEradication {
    static PrintWriter out = new PrintWriter(System.out);
    
    /*************************************/
    static class Point <T extends Comparable<T>>{

        public double x;
        public double y;
        public double polarAngle;

        public Point(double x, double y){
            this.x=x;
            this.y=y;
        }

        @Override
        public String toString(){
            return "(" +this.x +","+this.y+")";
        }

        public int compareTo(Point p){
            if(this.polarAngle<p.polarAngle){
                return -1;
            }else{
                if(this.polarAngle==p.polarAngle){
                    return 0;
                }else{
                    return 1;}
            }

        }

        public int equals(Point p){
            if(this.x==p.x && this.y==p.y){
                return 0;
            }else{
                return 1;}
        }

    }
    /*************************************/
    
    public static void swap(Point[] arr, int ind1, int ind2){
        Point aux = arr[ind2];
        arr[ind2]=arr[ind1];
        arr[ind1]=aux;
    }
    
    public static int partition(Point[] arr, int p, int r){
        Point x = arr[r];
        int i = p-1;
        for(int j=p; j<r; j++){
            if(arr[j].polarAngle<x.polarAngle){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }
    
    public static int randomizedPartition(Point[] arr, int p, int r){
        int rand = (int)(Math.random()*(Math.abs(p-r))+Math.min(p, r));
        swap(arr, r, rand);
        return partition(arr, p, r);
    }
        
    public static void randomizedQuickSort(Point[] arr, int p, int r){
        if(p<r){
            int q = randomizedPartition(arr, p, r);
            randomizedQuickSort(arr, p, q-1);
            randomizedQuickSort(arr, q+1, r);
        }
    }
    
    public static void randomizedQuickSort(Point[]arr){
        randomizedQuickSort(arr, 0, arr.length-1);
    }
    
    /************************************************************/
    
    public static int getMin(Point[]p){
        int pMin=0;
        for(int i=1;i<p.length;i++){
            if(p[pMin].y>p[i].y){
                pMin=i;
            }else{
                if(p[pMin].y==p[i].y){
                    if(p[pMin].x>p[i].x){
                        pMin=i;}
                }
            }
        }
        return pMin;
    }
    
    public static double direction(Point p0, Point p2, Point p1){
        return (p1.x-p0.x)*(p2.y-p0.y)-(p2.x-p0.x)*(p1.y-p0.y);
    }
    
    public static void setPolarAngles(Point[]p, Point ref){
        for(int i=0;i<p.length;i++){
            if(ref.equals(p[i])==0){
                p[i].polarAngle=0;
            }else{
                if(p[i].x!=ref.x && p[i].y!=ref.y){
                    p[i].polarAngle=Math.atan(((p[i].y-ref.y))/((p[i].x-ref.x)));
                    if(p[i].polarAngle<0){
                        p[i].polarAngle+=Math.PI;}
                }else{
                    if(p[i].x==ref.x){
                        p[i].polarAngle=Math.PI/2;}
                    else{
                        p[i].polarAngle=0;}
                }
                    
            }
        }
    }
    
    public static Stack<Point>grahamScan(Point[] p){
        Stack<Point> s = new Stack<Point>();
        Point p0=p[getMin(p)];
        setPolarAngles(p, p0);
        randomizedQuickSort(p);
        s.push(p[0]);
        s.push(p[1]);
        s.push(p[2]);
        for(int i=3;i<p.length;i++){
            out.print("List: ");
            print(s);
            out.println("dir: "+direction(s.get(s.size()-2),s.get(s.size()-1),p[i]));
            while(direction(s.get(s.size()-2),s.get(s.size()-1),p[i])>0.0){
                    s.pop();
            }
            s.push(p[i]);
        }
        return s;
    }
    
    
    public static double distT(Stack<Point>s){
        double ans=0;
        for(int i=0, j=i+1; i<s.size();i++,j++){
            if(j==s.size()){
                j=0;
            }
            ans+=Math.sqrt(Math.pow(s.get(i).y-s.get(j).y,2)+Math.pow(s.get(i).x-s.get(j).x,2));
        }
        return ans;
    }
    
    static void print(Stack<Point> s){
        out.print(s.get(0).toString()+"-");
        for(int i=s.size()-1;i>=0;i--){
            if(i==0){
                out.print(s.get(i).toString());
            }else{
            out.print(s.get(i).toString()+"-");}
        }
        out.println();
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int region=1;
        while(true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            Point[] ps=new Point[num];
            for(int i=0; i<num;i++){
                ps[i]=new Point(sc.nextDouble(),sc.nextDouble());
            }
            out.println("Region #"+region++ +":");
            Stack<Point>s=grahamScan(ps);
            print(s);
            out.printf("Perimeter length = %.2f\n",distT(s));
        }
        out.flush();     
    }
    
}
