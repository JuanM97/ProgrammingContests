/* 
 * File:   P3280_TheBookThief.cpp
 * Author: JuanManuel
 *
 * Created on 11 de junio de 2015, 22:20
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <vector>
#include <climits>
using namespace std;


int main() {
    long int n,tp,lp;
    while(scanf("%ld",&n)&&n){
        tp = 1+floor(((-1+sqrt(1+8*n))/2));
        lp = tp*(tp+1)/2-n;
        printf("%ld %ld\n",lp,tp);
    }
    return 0;
}

