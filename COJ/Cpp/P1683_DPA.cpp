/* 
 * File:   P1683_DPA.cpp
 * Author: JuanM
 *
 * Created on April 28, 2013, 2:24 AM
 */


#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <iostream>
#include <vector>
#define max 50
using namespace std;
vector<long int>v;
vector<long int>f;
bool bP[max];

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

void print(){
    for(int i=0;i<v.size();i++){
        printf("%ld ",v[i]);
    }printf("\n");
}

void printF(){
    for(int i=0;i<f.size();i++){
        printf("%ld ",f[i]);
    }printf("\n");
}

void printB(){
    for(int i=0;i<max;i++){
        printf("%ld ",bP[i]);
    }
}


int main() {
    long int t,num,cont,sum,act,num2;
    sieve();
    scanf("%ld",&t);
    while(t--){
        scanf("%ld",&num2);
        num=num2;
        f.clear();
        for(int ii=0;v[ii]<=num&&ii<v.size();ii++){
            if(num%v[ii]==0){
                while(num%v[ii]==0){
                    num/=v[ii];
                }
                f.push_back(v[ii]);
            }
        }
        if(num!=1){
            f.push_back(num);
        }
        sum=1;act=0;cont=0;
        for(int i=0;i<f.size();i++){
            cont=0;act=num2;
            while(act%f[i]==0){
                act/=f[i];
                cont++;
            }
            sum=sum*(long int)((pow((double)f[i],(double)(cont+1))-1)/(double)(f[i]-1));
            //printf("num: %ld, cont: %ld, act: %ld, sum: %ld\n",f[i],cont,act,sum);
        }
        if(sum-num2==num2){
            printf("Perfect\n");
        }else{
            if(sum-num2<num2){
                printf("Deficient\n");
            }else{
                printf("Abundant\n");
            }
        }
    }
    return 0;
}


