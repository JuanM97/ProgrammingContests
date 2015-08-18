/* 
 * File:   P2946_InvertingTheParity.cpp
 * Author: JuanManuel
 *
 * Created on 8 de octubre de 2014, 11:26
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

int main() {
    int t,a;
    while(scanf("%d",&t)!=EOF){
        while(t--){
            scanf("%d",&a);
            if(a&1){
                printf("%d\n",a<<1);
            }else{
                while(!(a&1)){
                    a>>=1;
                }
                printf("%d\n",a);
            }
        }
    }
    return 0;
}

