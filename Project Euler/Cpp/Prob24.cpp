/* 
 * File:   Prob24.cpp
 * Author: JuanM
 *
 * Created on June 6, 2014, 12:19 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;


int main() {
    char n[]="0123456789";
    for(int i=1;i<1000000;i++){
        next_permutation(n,n+10);
    }
    printf("%s\n",n);
    return 0;
}

