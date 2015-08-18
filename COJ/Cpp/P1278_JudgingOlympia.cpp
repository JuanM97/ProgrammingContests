/* 
 * File:   P1278_JudgingOlympia.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 9:41 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
using namespace std;

double grades[9];

int main() {
    double c;
    while(1){
        for(int i=0;i<6;i++){
            scanf("%lf",&grades[i]);
        }
        sort(grades,grades+6);
        c=0;
        for(int i=1;i<5;i++){
            c+=grades[i];
        }
        if(c==0)break;
        printf("%.3G\n",c/4);
    }
    return 0;
}

