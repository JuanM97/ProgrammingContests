/* 
 * File:   Prob40.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 11:36 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#include <utility>
#define smx 1000010
using namespace std;

vector<int>v;
char n[30];

long long int exp(int a,int b){
    int x=a,y=b;
    long long int z=1;
    while(y>0){
        if(y&1) z=z*x;
        x=x*x;
        y>>=1;
    }
    return z;
}

void add2v(int a){
    memset(n,0,sizeof(n));
    sprintf(n,"%d",a);
    for(int i=0;i<strlen(n);i++){
        v.push_back(n[i]-'0');
    }
}

int main() {
    int s=1;
    v.push_back(0);
    for(int i=1;v.size()<smx;i++){
        add2v(i);
    }
    /*for(int i=0;i<v.size();i++){
        printf("%d ",v[i]);
    }*/
    for(int i=0;i<6;i++){
        //printf("%d ",v[exp(10,i)]);
        s*=v[exp(10,i)];
    }
    printf("sp: %d\n",s);
    return 0;
}

