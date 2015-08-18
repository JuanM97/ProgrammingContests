/* 
 * File:   P2152_SumOfTheDigits.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 3:50 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;


int main() {
    int t,sm;
    char n[30];
    scanf("%d",&t);
    while(t--){
        sm=0;
        scanf("%s",n);
        for(int i=0;i<strlen(n);i++){
            if(i==0&&n[i]=='-')continue;
            sm+=(n[i]-'0');
        }
        printf("%d\n",sm);
        //printf("%d\n",(sm%9)==0?9:sm%9);
    }
    return 0;
}

