/* 
 * File:   P1490_DoingTheBest.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 3:57 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;


int main() {
    int t;
    int n;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        if(n&1){
            printf("%.6lf\n",0.5f);
        }else{
            printf("%.6lf\n",(double)(n>>1)/(n+1));
        }
    }
    return 0;
}

