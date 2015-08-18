/* 
 * File:   P3129_MysteriousNumber.cpp
 * Author: JuanManuel
 *
 * Created on 29 de abril de 2015, 16:37
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int t,n,p;
    char d[7];
    scanf("%d",&t);
    while(t--){
        scanf("%d %s %d",&n,&d,&p);
        if(!strcmp(d,"even")){
            printf("%d\n",(p<<1)-1);
        }else{
            printf("%d\n",(p<<1));
        }
    }    
    return 0;
}

