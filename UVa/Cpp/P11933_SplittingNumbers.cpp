/* 
 * File:   P11933_SplittingNumbers.cpp
 * Author: JuanManuel
 *
 * Created on 11 de febrero de 2015, 1:07
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int n,a,lx,idx,z;
    while(scanf("%d",&n)&&n){
        z=n;
        idx=0;
        lx=0;
        a=0;
        while(z){
            if(z&1){
                idx^=1;
                if(idx&1){
                    a|=(1<<lx);
                }
            }
            lx++;
            z>>=1;
        }
        printf("%d %d\n",a,n^a);
    }
    return 0;
}

