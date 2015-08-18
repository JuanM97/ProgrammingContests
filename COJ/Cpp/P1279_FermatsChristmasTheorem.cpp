/* 
 * File:   P1279_FermatsChristmasTheorem.cpp
 * Author: JuanM
 *
 * Created on February 11, 2014, 2:02 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <vector>
#define max 1000100

using namespace std;
vector<long int>v;
bool bP[max];
long int numPrimes[max];

void sieve(){
    bP[0]=true;
    bP[1]=true;
    v.push_back(2);
    for(int i=2;2*i<max;i++){
        bP[2*i]=true;
    }
    for(int i=3;i<max;i++){
        if(bP[i]==false){
            v.push_back(i);
            for(int j=3;i*j<max;j++){
                bP[i*j]=true;
            }
        }
    }
}

void getNumPrimes(){
    numPrimes[0]=0;
    for(int i=1;i<max;i++){
        if(!bP[i]){
            numPrimes[i]=numPrimes[i-1]+1;
        }else{
            numPrimes[i]=numPrimes[i-1];
        }
    }
}

void print(){
    for(int i=0;i<v.size();i++){
        printf("%ld ",v[i]);
    }printf("\n");
}

long int l,u,x,y;



int main() {
    sieve();
    getNumPrimes();
    while(1){
        scanf("%ld %ld",&l,&u);
        if(l==-1&&u==-1)break;
        y=0;
        for(int i=l;i<=u;i++){
            if(!bP[i]&&i%4==1)y++;
        }
        x=numPrimes[u]-numPrimes[(l-1)>0?(l-1):0];
        if(l<=2&&u>=2)y++;
        printf("%ld %ld %ld %ld\n",l,u,x,y);
    }
    
    return 0;
}

