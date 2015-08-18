/* 
 * File:   P1268_Hometask.cpp
 * Author: JuanM
 *
 * Created on June 6, 2013, 1:47 AM
 */

#include <cstdlib>
#include <cstdio>
#include <vector>
#define maxS 100005
using namespace std;

vector<long int>p;
bool bP[maxS];
long int n;

void sieve(){
    bP[0]=true;
    bP[1]=true;
    p.push_back(2);
    for(int i=2;2*i<maxS;i++){
        bP[2*i]=true;
    }
    for(int i=3;i<maxS;i+=2){
        if(bP[i]==false){
            p.push_back(i);
            for(int j=3;i*j<maxS;j++){
                bP[i*j]=true;
            }
        }
    }
}

bool isN(){
    if(n==4){
        return true;
    }
    if(n<maxS){
        return !bP[n];
    }else{
        for(int i=0;i<p.size();i++){
            if(n%p[i]==0){
                return false;
            }
        }
        return true;
    }
}
int main() {
    sieve();
    while(scanf("%ld",&n)!=EOF){
        printf("%s\n",(!isN())?"YES":"NO");
    }
    return 0;
}

