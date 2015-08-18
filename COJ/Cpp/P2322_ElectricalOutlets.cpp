/* 
 * File:   P2322_ElectricalOutlets.cpp
 * Author: JuanM
 *
 * Created on August 25, 2014, 2:00 AM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <algorithm>
#include <cstring>
using namespace std;


int main() {
    int t,n,aux,ct;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        ct=0;
        n--;
        while(n--){
            scanf("%d",&aux);
            ct+=(aux-1);
        }
        scanf("%d",&aux);
        ct+=aux;
        printf("%d\n",ct);
    }
    return 0;
}

