/* 
 * File:   Prob45.cpp
 * Author: JuanM
 *
 * Created on June 12, 2014, 7:27 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 5000
using namespace std;

bool isPent(long long int number) {
    double penTest=(sqrt(1+24*number)+1.0)/6.0;
    return penTest==(long long int)penTest;
}

//The set of hex numbers is a subset of Triangular numbers, so this is not necessary...
bool isHex(long long int number) {
    double penTest=(sqrt(1+8*number)+1.0)/4.0;
    return penTest==(long long int)penTest;
}


int main() {
    bool f=false;
    long long int ix=285;
    long long int tn=0;
    while(!f){
        ix++;
        //GEnerate an hex number
        tn=ix*(2*ix-1);
        if(isPent(tn))f=true;
    }
    printf("%lld\n",tn);
    return 0;
}

