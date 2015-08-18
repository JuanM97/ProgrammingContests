/* 
 * File:   P2175_PrimeNumbersAgain.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 1:33 AM
 */

#include <cstdlib>
#include <cstdio>
#define maxS 1000050
using namespace std;

bool pb[maxS];

void sieve(){
    pb[0]=1;pb[1]=1;
    for(int i=2;2*i<maxS;i++){
        pb[2*i]=1;
    }
    for(int i=3;i<maxS/3+10;i++){
        if(pb[i]==0){
            for(int j=3;i*j<maxS;j++){
                pb[i*j]=1;
            }
        }
    }
}

void print(int b){
    for(int i=0;i<b;i++){
        printf("%s ,",pb[i]?"np":"p");
    }printf("\n");
}

int main() {
    sieve();
    int t,n,a,b;
    bool gA,gB;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        gA=false;gB=false;
        a=0;b=0;
        for(int i=n;i<maxS;i++){
            if(!gA&&pb[2*n-i]==0){
                a=2*n-i;
                gA=true;
            }
            if(!gB&&pb[i]==0){
                b=i;
                gB=true;
            }
            if(gA&&gB){
                break;
            }
        }
        
        printf("%d %d\n",a,b);
    }    
    return 0;
}

