/* 
 * File:   P1362_Diophantines.cpp
 * Author: JuanM
 *
 * Created on June 6, 2013, 1:35 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int egcd(long int a,long int b){
    if(b==0)
        return a;
    else
        return egcd(b,a%b);
}

int main() {
    long int a,b,c,g;
    while(1){
        scanf("%ld %ld %ld",&a,&b,&c);
        if(a==0&b==0&c==0)break;
        g=egcd(a,b);
        if(c%g==0){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}

