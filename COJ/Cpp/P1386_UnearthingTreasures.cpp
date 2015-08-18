/* 
 * File:   P1386_UnearthingTreasures.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 6:00 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;

int p,q;
int primes[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83};

vector<int>f1;
vector<int>f2;

void getFactors(){
    for(int i=1;i<=p;i++){
        if(p%i==0){
            f1.push_back(i);
        }
    }
    for(int i=1;i<=q;i++){
        if(q%i==0){
            f2.push_back(i);
        }
    }    
}

void printV(){
    for(int i=0;i<f1.size();i++){
        printf("%d ",f1[i]);
    }printf("\n");
    
    for(int i=0;i<f2.size();i++){
        printf("%d ",f2[i]);
    }printf("\n");
}

int main(){
    while(scanf("%d %d",&p,&q)!=EOF){
        f1.clear();
        f2.clear();
        getFactors();
        sort(f1.begin(),f1.end());
        sort(f2.begin(),f2.end());
        for(int i=0;i<f1.size();i++){
            for(int j=0;j<f2.size();j++){
                printf("%d %d\n",f1[i],f2[j]);
            }
        }
    }
    return 0;
}

