/* 
 * File:   P2364_StrongCryptoanalysis.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 19:23
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 26
using namespace std;
int abc[smx];

int main() {
    int t;
    scanf("%d",&t);
    while(t--){
        for(int i=0;i<smx;i++){
            scanf("%d",&abc[i]);
        }
        sort(abc,abc+smx);
        for(int i=0;i<smx;i++){
            if(abc[i]==smx-i-1)break;
            for(int j=0;j<abc[smx-i-1];j++){
                printf("%c",('z'-i));
            }
        }printf("\n");
    }
    return 0;
}

