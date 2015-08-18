/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package V123;

/**
 *
 * @author JuanM
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashMap;
public class P12376_AsLongAsILearnILive {
    
    public class Nodo{
        int id;
        int valor;
        HashMap<Integer,Nodo> h;
        
        public Nodo(int id, int valor){
            this.id=id;
            this.valor=valor;
            h=new HashMap<Integer,Nodo>();
        }
        
        @Override
        public String toString(){
            return this.id+" "+this.valor;
        }
        
        public void add(int id, Nodo n){
            h.put(id, n);
        }
    }
    
    public static void main(String[]args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int nds,adj;
        P12376_AsLongAsILearnILive all=new P12376_AsLongAsILearnILive();
        for(int i=1;i<=t;i++){
            nds=sc.nextInt();
            adj=sc.nextInt();
            Nodo root=all.new Nodo(-1,-1);
            for(int j=0;j<nds;j++){
                root.add(j, all.new Nodo(j,sc.nextInt()));
            }
            Nodo act;
            int a,b;
            for(int j=0;j<adj;j++){
                a=sc.nextInt();
                b=sc.nextInt();
                act=root.h.get(a);
                act.add(b, root.h.get(b));
            }
            Nodo sig=null, now=root.h.get(0);
            int count=0, maxV=-1, id=-1;
            
            for(int j=0;;j++){
                if(now.h.isEmpty()){
                        break;
                }
                for(int f=0;f<now.h.size();f++){
                    if(now.h.get(f).valor>maxV){
                        sig=now.h.get(f);
                    }
                    count+=sig.valor;
                    now=sig;
                }
            }
            out.println("Case "+i+": "+count+" "+now.id);
        }
        out.flush();        
    }
}
