/* 
 * File:   P3285_TobyAndTheStrangeFunction.cpp
 * Author: JuanManuel
 *
 * Created on 11 de junio de 2015, 22:28
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <vector>
#include <climits>
#include <cstring>
#define smx 110
using namespace std;


int main() {
    int t;
    long long int d;
    //printf("%lld\n",LONG_MAX);
    char s[smx],tmp;
    scanf("%lld",&t);
    while(t--){
        scanf("%d %s",&d,s);
        d%=strlen(s);
        if(!d){
            printf("%s\n",s);
        }else{
//            for(int i=0;i<d;i++){
//                tmp=s[strlen(s)-1];
//                for(int j=strlen(s)-1;j>0;j--){
//                    s[j]=s[j-1];
//                }
//                s[0]=tmp;
//            }
//            printf("%s\n",s);
            for(int i=strlen(s)-d;i<strlen(s);i++) printf("%c",s[i]);
            for(int i=0;i<strlen(s)-d;i++) printf("%c",s[i]);
            printf("\n");
        }
        
    }
    return 0;
}


