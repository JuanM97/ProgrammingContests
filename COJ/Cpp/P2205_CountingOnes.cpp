/* 
 * File:   P2205_CountingOnes.cpp
 * Author: JuanManuel
 *
 * Created on 25 de marzo de 2015, 12:05
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 1005
using namespace std;

int ns[smx];

int getN(int s){
    int c=0;
    while(s>0){
        if(s&1) c++;
        s>>=1;
    }
    return c;
}

void preCalc(){
    ns[0]=0;
    ns[1]=1;
    ns[2]=2;
    for(int i=3;i<smx;i++){
        ns[i]=ns[i-1]+getN(i);
    }
}

int main() {
    int t,a,b;
    preCalc();
    
    
    scanf("%d",&t);
    
    while(t--){
        scanf("%d %d",&a,&b);
        printf("%d\n",ns[b]-ns[a]+getN(a));
        
    }
    
    return 0;
}

