/* 
 * File:   P2374_AddingNumbersII.cpp
 * Author: JuanM
 *
 * Created on September 25, 2014, 12:14 AM
 */


#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;


int main() {
    
    char a[9],b[9];
    int smin,smax;
    while(scanf("%s %s",a,b)!=EOF){
        smin=0;
        smax=0;
        for(int i=0;i<strlen(a);i++){
            if(a[i]=='6')a[i]='5';
        }
        for(int i=0;i<strlen(b);i++){
            if(b[i]=='6')b[i]='5';
        }
        smin=atoi(a)+atoi(b);
        for(int i=0;i<strlen(a);i++){
            if(a[i]=='5')a[i]='6';
        }
        for(int i=0;i<strlen(b);i++){
            if(b[i]=='5')b[i]='6';
        }
        smax=atoi(a)+atoi(b);
        printf("%d %d\n",smin,smax);
    }
    
    return 0;
}

