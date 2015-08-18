/* 
 * File:   Prob43.cpp
 * Author: JuanM
 *
 * Created on June 12, 2014, 5:38 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

int digs[10];

bool isPand(long long int a){
    long aa=a;
    int r=0;
    memset(digs,0,sizeof(digs));
    while(aa>=1){
        r=aa%10;
        digs[r]++;
        if(digs[r]>1)return false;
        aa/=10;
    }
    /*for(int i=1;i<10;i++){
        printf("%d ",digs[i]);
    }printf("\n");*/
    for(int i=0;i<10;i++){
        if(digs[i]!=1)return false;
    }
    return true;
}
char n[13];
char nn[13];
bool prop(long long int a){
    int aa=0;
    memset(n,0,sizeof(n));
    memset(nn,0,sizeof(nn));
    sprintf(n,"%lld",a);
    //2
    strncpy(nn,n+1,3);
    aa=atoi(nn);
    if(aa%2!=0)return false;
    //3
    strncpy(nn,n+2,3);
    aa=atoi(nn);
    if(aa%3!=0)return false;
    //5
    strncpy(nn,n+3,3);
    aa=atoi(nn);
    if(aa%5!=0)return false;
    //7
    strncpy(nn,n+4,3);
    aa=atoi(nn);
    if(aa%7!=0)return false;
    //11
    strncpy(nn,n+5,3);
    aa=atoi(nn);
    if(aa%11!=0)return false;
    //13
    strncpy(nn,n+6,3);
    aa=atoi(nn);
    if(aa%13!=0)return false;
    //17
    strncpy(nn,n+7,3);
    aa=atoi(nn);
    if(aa%17!=0)return false;
    return true;
}

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

char num[]="1023456789";

long long int toInt(){
    long long int c=0;
    for(int i=0;i<10;i++){
        c+=((num[9-i]-'0')*exp(10,i));
    }
    return c;
}

int main() {
    long long int cc=0,a=0;
    //printf("%d\n",prop(4106357289LL));
    while(next_permutation(num,num+10)){
        a=toInt();
        if((a/1000000)%2!=0||(a/10000)%10!=5)continue;
        if(prop(a)){
            //printf("%lld ",a);
            cc+=a;
        }
    }
    printf("ss: %lld\n",cc);
    return 0;
}

