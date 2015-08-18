/* 
 * File:   P1115_SequenceSumPossibilities.cpp
 * Author: JuanManuel
 *
 * Created on 7 de mayo de 2015, 15:34
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int sum=0,t,c,n;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&c,&n);
        sum=0;
        // k+(k+1)+...+(k+n) = k(n+1)+n(n+1)/2 -> k = s/(n+1)- n/2 = (2s-n(n+1))/(2(n+1))
        // = (s-n(n+1)/2)/(n+1) Iterar sobre n y verificar que exista k.
        for(int i=1;i*(i+1)/2<n;i++){
            if((n-i*(i+1)/2)%(i+1)==0) sum++;
        }
        printf("%d %d\n",c,sum);
    }
    
    return 0;
}

// Generación de sumas: para nums pequeños ):
//    for(int i=1;i<smx;i++){
//        sum=i;
//        for(int j=i+1;sum<smx;j++){
//            sum+=j;
//            if(sum>smx)break;
//            num[sum]++;
//        }
//    }