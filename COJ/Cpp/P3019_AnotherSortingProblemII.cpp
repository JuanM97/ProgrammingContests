/* 
 * File:   P3019_AnotherSortingProblemII.cpp
 * Author: JuanManuel
 *
 * Created on 18 de mayo de 2015, 21:26
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 60
using namespace std;

int main() {
    int t,n,d,sum;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        sum=0;
        for(int i=1;i<=n;i++){
            scanf("%d",&d);
            sum+=(abs(d-i));
        }
        printf("%d\n",sum);
    }
    return 0;
}

