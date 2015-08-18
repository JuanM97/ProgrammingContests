/* 
 * File:   P1848_FibonacciTerms.cpp
 * Author: JuanM
 *
 * Created on June 4, 2013, 12:16 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int fib[10005];

void preCalc(){
    fib[0]=0;
    fib[1]=1;
    for(int i=2;i<sizeof(fib)/sizeof(fib[0]);i++){
        fib[i]=(fib[i-1]+fib[i-2])%10000;
    }
}

int main() {
    preCalc();
    int t,n;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        if(n==1){
            printf("0 0 1\n");
        }else{
            printf("%d %d %d\n",fib[n-2],fib[n-1],fib[n]);
        }
    }
    return 0;
}

