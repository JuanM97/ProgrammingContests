/* 
 * File:   P3025_PROSJEK.cpp
 * Author: JuanManuel
 *
 * Created on 18 de mayo de 2015, 21:10
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 110
using namespace std;
long long int nums[smx];
int main() {
    int n;
    long long int sum,dd;
    while(scanf("%d",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%lld",&nums[i]);
        }
        printf("%d",nums[0]);
        sum=nums[0];
        for(int i=1;i<n;i++){
            dd=(i+1)*nums[i]-sum;
            printf(" %lld",dd);
            sum+=dd;
        }printf("\n");
    }
    return 0;
}

