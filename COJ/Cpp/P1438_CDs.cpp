/* 
 * File:   P1438_CDs.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 2:26 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
#include <set>
#define smx 1000010
using namespace std;
//TLE :'(


int main() {
    long int jk,jl,k,c,nmx;
    set<long int>s;
    
    while(1){
        scanf("%ld %ld",&jk,&jl);
        if(jk==0&&jl==0)break;
        s.clear();
        c=0;
        while(jk--){
            scanf("%ld",&k);
            s.insert(k);
            if(jk==0)nmx=k;
        }//printf("N: %ld",nmx);
        while(jl--){
            scanf("%ld",&k);
            if(k>nmx){
                break;
            }
            if(s.find(k)!=s.end()){
                c++;
            }
        }
        while(jl--){
            scanf("%ld",&k);
        }
        printf("%ld\n",c);
    }
    return 0;
}




/*
int main(){
    //printf("Holla");
    int a,b,c,x;
    int cds[smx];
    while(scanf("%d %d",&a,&b)&&a!=0&&b!=0){
        c=0;
        memset(cds,0,sizeof(cds));
        while(a--){
            scanf("%d",&x);
            cds[x]++;
        }
        while(b--){
            scanf("%d",&x);
            cds[x]++;
        }
        for(int i=0;i<smx;i++) if(cds[i]==2)c++;
        printf("%d\n",c);        
    }
    
    return 0;
}
*/
