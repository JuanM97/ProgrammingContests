/* 
 * File:   P2967_TobbyAndGoldbachsConjecture.cpp
 * Author: JuanManuel
 *
 * Created on 15 de julio de 2014, 16:37
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <vector>
#define max 450
using namespace std;

bool pb[max+3];
vector<long long int>p;

void sieve(){
    p.push_back(2);
    pb[0]=pb[1]=true;
    
    for(int j=2;2*j<max;j++){
        pb[2*j]=true;
    }
    for(long long int i=3; i<max;i+=2){
        if(pb[i]==false){
            p.push_back(i);
            for(long long int j=2;i*j<max;j++){
                pb[i*j]=true;
            }
        }
    }
}

int t,n,cc;
int main() {
    sieve();
    scanf("%d",&t);
    
    while(t--){
        cc=0;
        scanf("%d",&n);
        for(int i=0;p[i]<=n/2;i++){
            if(!pb[n-p[i]])cc++;
        }
        printf("%d\n",cc);
    }
    
    return 0;
}

