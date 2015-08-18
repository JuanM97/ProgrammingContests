/* 
 * File:   P2968_TobbyAndTheRiver.cpp
 * Author: JuanManuel
 *
 * Created on 15 de julio de 2014, 17:04
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;
bool grt(int a,int b){return a>b;};
int main() {
    
    int t,w[7],s;
    bool pp,ts;
    scanf("%d",&t);
    
    while(t--){
        pp=false;
        ts=false;
        s=0;
        for(int i=0;i<6;i++){
            scanf("%d",&w[i]);
            s+=w[i];
        }
        if(s%2){
            pp=true;
        }
        
        if(pp){
            printf("Tobby no puede cruzar\n");
        }else{
            
            sort(w,w+6);
            //for(int i=0;i<6;i++)printf("%d ",w[i]);
            int ds=0;
            do{
                ds=0;
                for(int i=0;!ts,i<6;i++){
                    for(int j=i+1;!ts,j<6;j++){
                        ds=0;
                        for(int k=i;!ts,k<=j;k++){
                            ds+=w[k];
                        }
                        //printf("%d  ",ds);
                        if(ds==s/2){
                            ts=true;
                            break;
                        }
                    }
                }
            }while(next_permutation(w,w+6));
            
            if(ts){
                printf("Tobby puede cruzar\n");
            }else{
                printf("Tobby no puede cruzar\n");
            }
        }
        
    }
    
    return 0;
}

