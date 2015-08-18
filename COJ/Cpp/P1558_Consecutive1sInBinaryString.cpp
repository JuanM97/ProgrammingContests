/* 
 * File:   P1558_Consecutive1sInBinaryString.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 11:15 PM
 */

#include <cstdlib>
#include <cstdio>
#define maxS 1000010
using namespace std;

long int ones[maxS];

void preCalc(){
    ones[0]=1;
    ones[1]=2;
    for(int i=2;i<maxS;i++){
        ones[i]=(ones[i-1]+ones[i-2])%1000000007;
    }
}

void print(int b){
    for(int i=0;i<b;i++){
        printf("%ld ",ones[i]);
    }printf("\n");
}

int main() {
    int t,n;
    scanf("%d",&t);
    preCalc();
    //print(15);
    while(t--){
        scanf("%d",&n);
        printf("%ld\n",ones[n]);
    }
    return 0;
}

