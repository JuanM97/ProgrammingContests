/* 
 * File:   P2019_Primality.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 7:37 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <vector>
#define maxS 10013
using namespace std;

char num[13];
bool pb[maxS+3];
vector<int>p;

void sieve(){
    p.push_back(2);
    pb[0]=pb[1]=true;
    
    for(int j=2;2*j<maxS;j++){
        pb[2*j]=true;
    }
    for(int i=3; i<maxS;i+=2){
        if(pb[i]==false){
            p.push_back(i);
            for(int j=2;i*j<maxS;j++){
                pb[i*j]=true;
            }
        }
    }
}


bool isPrime(int a){
    bool isP=true;
    if(a<maxS){
        return !pb[a];
    }else{
        for(int i=0;i<p.size();i++){
            if(a%p[i]==0){
                isP=false;
                break;
            }
        }
        return isP;
    }
}

int main() {
    int n,c;
    sieve();
    //printf("P: %ld %ld\n",p[0],p[p.size()-1]);
    while(scanf("%s",&num)!=EOF){
        sort(num,num+strlen(num));
        //printf("%s\n",num);
        c=0;
        do{
            n=atoi(num);
            //printf("%d ",n);
            if(isPrime(n))
                c++;
        }while(next_permutation(num,num+strlen(num)));
        printf("%d\n",c);
    }
    return 0;
}

