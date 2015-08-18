/* 
 * File:   P1600_BigPowers.cpp
 * Author: JuanM
 *
 * Created on June 26, 2013, 11:24 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

int modPow(int a,int b,int mod){
    int z=1;
    while(b>0){
        if(b&1){
            z=(z*a)%mod;
        }
        a=(a*a)%mod;
        b=b>>1;
    }
    return z;
}

int main() {
    char na[105],nb[105],e[5];
    int a,b;
    while(1){
        scanf("%s %s",&na,&nb);
        if(strcmp(na,"0")==0&&strcmp(nb,"0")==0)break;
        a=(int)na[strlen(na)-1]-'0';
        if(strlen(nb)>4){
            memcpy(e,&nb[strlen(nb)-4],4);
            e[4]='\0';
        }else{
            strcpy(e,nb);
        }
        
        b=atoi(e);
        printf("%d\n",modPow(a,b,10));
    }
    return 0;
}
