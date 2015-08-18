/* 
 * File:   P2620_Aaaaaaaah.cpp
 * Author: JuanM
 *
 * Created on January 10, 2014, 11:30 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int r,i;
char a[100000];
int main() {
    while(scanf("%d",&r)!=EOF){
        a[0]='A';
        for(i=1;i<=4*r;i++){
            a[i]='a';
        }
        a[i++]='h';
        a[i++]='\0';
        printf("%s\n",a);
    }
    return 0;
}

