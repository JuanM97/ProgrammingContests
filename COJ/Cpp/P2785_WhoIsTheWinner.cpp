/* 
 * File:   P2785_WhoIsTheWinner.cpp
 * Author: JuanM
 *
 * Created on September 25, 2014, 12:41 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;


int main() {
    int n,p;
    double sum;
    while(scanf("%d",&n)!=EOF){
        sum=0;
        for(int i=0;i<n;i++){
            scanf("%d",&p);
            sum+=p;
        }
        printf("%.2lf\n",sum/(double)n);
    }
    return 0;
}

