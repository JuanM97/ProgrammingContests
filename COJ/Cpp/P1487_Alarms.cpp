/* 
 * File:   P1487_Alarms.cpp
 * Author: JuanManuel
 *
 * Created on 5 de febrero de 2015, 15:09
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 10010
#define maxTime 1000000
using namespace std;

int nums[smx];

long int bgcd(unsigned int u, unsigned int v){
    // simple cases (termination)
    if (u == v) return u;
    if (u == 0) return v;
    if (v == 0) return u;
    // look for factors of 2
    if (~u & 1) {// u is even
        if (v & 1) // v is odd
            return bgcd(u >> 1, v);
        else // both u and v are even
            return bgcd(u >> 1, v >> 1) << 1;
    }
 
    if (~v & 1) // u is odd, v is even
        return bgcd(u, v >> 1);
 
    // reduce larger argument
    if (u > v)
        return bgcd((u - v) >> 1, v);
 
    return bgcd((v - u) >> 1, u);
}

long int bgcd(long int a,long int b){
    if(a==0) return b;
    return bgcd(b%a,a);
}

int main() {
    int n;
    long int lcm;
    while(scanf("%ld",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%d",&nums[i]);
        }
        lcm=nums[0];
        for(int i=1;lcm<=maxTime&&i<n;i++){
            lcm=((lcm*nums[i])/bgcd(lcm,nums[i]));
        }
        if(lcm<=maxTime){
            for(int i=1;lcm*i<=maxTime;i++){
                printf("%ld\n",lcm*i);
            }
        }else{
            printf("SILENCE\n",lcm);
        }
        
    }
    
    return 0;
}

