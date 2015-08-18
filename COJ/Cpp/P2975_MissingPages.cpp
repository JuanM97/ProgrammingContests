/* 
 * File:   P2975_MissingPages.cpp
 * Author: JuanManuel
 *
 * Created on 7 de octubre de 2014, 12:15
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define smx 43
using namespace std;

void getNum(int a,int b,int c,int d,int ref){
    if(a==ref)printf("%d %d %d\n",b,c,d);
    if(b==ref)printf("%d %d %d\n",a,c,d);
    if(c==ref)printf("%d %d %d\n",a,b,d);
    if(d==ref)printf("%d %d %d\n",a,b,c);
    
}

int main() {
    int p,n,c;
    bool b=false;
    
    while(scanf("%d",&p)){
        if(p==0)break;
        b=false;
        scanf("%d",&n);
        c=1;
        if(n<=p>>1){
            b=true;
            while(c<=n){
                c+=2;
            }
        }else{
            while(p-c>n){
                c+=2;
            }
        }
        if(b)c-=2;
        //printf("%d %d %d %d\n",c,c+1,p-c,p-c+1);
        getNum(c,c+1,p-c,p-c+1,n);
    }
    
    return 0;
}

