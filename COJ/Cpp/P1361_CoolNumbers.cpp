/* 
 * File:   P1361_CoolNumbers.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 2:31 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#define max 100000005
using namespace std;

long int coolNumbersCount[max];

bool isPerfectSquare(int n) {
    if (n < 0)
        return false;
    int root(round(sqrt(n)));
    return n == root * root;
}

bool isPerfectCube(int n) {
    int root(round(cbrt(n)));
    return n == root * root * root;
}

void preCalc(){
    coolNumbersCount[0]=0;
    coolNumbersCount[1]=1;
    for(int i=2;i<max;i++){
        if(isPerfectSquare(i)&&isPerfectCube(i)){
            coolNumbersCount[i]=coolNumbersCount[i-1]+1;
        }else{
            coolNumbersCount[i]=coolNumbersCount[i-1];
        }
    }
}

void printA(){
    for(int i=0;i<max;i++){
        printf("%ld ",coolNumbersCount[i]);
    }printf("\n");
}

int main() {
    preCalc();
    //printA();
    long int a,b;
    while(scanf("%ld %ld",&a,&b)!=EOF){
        printf("%ld\n",coolNumbersCount[b]-coolNumbersCount[a-1]);
    }
    return 0;
}

