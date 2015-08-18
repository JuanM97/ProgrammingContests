/* 
 * File:   P2420_BinaryPalindrome.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 3:38
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 50
using namespace std;

int main(){
    int t,n,z,a;
    
    scanf("%d",&t);
    
    while(t--){
        scanf("%d",&n);
        z=n;
        a=0;
        while(z){
            a=(a<<1)|(z&1);
            z>>=1;
        }
        printf("%s\n",a==n?"YES":"NO");
    }
    
    return 0;
    
}


/*

char bin[smx];

bool isPal(){
    bool isp=true;
    for(int i=0;i<strlen(bin)>>1;i++){
        if(bin[i]!=bin[strlen(bin)-1-i]){
            isp=false;
            break;
        }
    }
    return isp;
}

int main() {
    int n,idx;
    long int b;
    scanf("%d",&n);
    while(n--){
        scanf("%ld",&b);
        memset(bin,0,sizeof(bin));
        idx=0;
        while(b>0){
            bin[idx++]=('0'+(b&1));
            b=(b>>1);
        }
        //101010101010100101010 & 0000000000000000001
        printf("%s\n",isPal()?"YES":"NO");
    }
    return 0;
}

*/