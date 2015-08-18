/* 
 * File:   P1622_Apples.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 9:55 PM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;


int main() {
    int b,o,e,c,s;
    while(scanf("%d",&b)!=EOF){
        s=0;o=0;e=0;c=0;
        while(b--){
            scanf("%d",&c);
            s^=c;
            c&1?o++:e++;
        }
        printf("%d\n",s&1?o:e);
    }
    return 0;
}

