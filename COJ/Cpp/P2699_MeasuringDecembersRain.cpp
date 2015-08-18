/* 
 * File:   P2699_MeasuringDecembersRain.cpp
 * Author: JuanM
 *
 * Created on September 25, 2014, 12:47 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int a,sum;
    while(scanf("%d",&a)!=EOF){
        sum=0;
        sum+=a;
        for(int i=0;i<29;i++){
            scanf("%d",&a);
            sum+=a;
        }
        printf("%.3lf",sum+double(sum)/30.);
    }
    
    return 0;
}

