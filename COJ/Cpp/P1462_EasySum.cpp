/* 
 * File:   P1462_EasySum.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 12:29 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char num[100007];
char n2[11];
int t,n;

int main() {
    scanf("%d",&t);
    n=0;
    while(t--){
        scanf("%s",&num);
        if(strlen(num)>8){
            memcpy(n2,&num[strlen(num)-8],8);
        }else{
            strcpy(n2,num);
        }
        //printf("N: %s %d %d\n",n2,atoi(n2),atoi(n2)%128);
        n=(n+atoi(n2))%128;
    }
    printf("%d\n",n%128);
    return 0;
}

