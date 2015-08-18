/* 
 * File:   P3248_Jabuke.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 12:11 AM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
    int n,m,t,mn,mx,ap,ct,d;
    while(scanf("%d %d",&n,&m)!=EOF){
        scanf("%d",&t);
        mn=1;mx=mn+m-1;
        ct=0;d=0;
        while(t--){
            scanf("%d",&ap);
            if(ap>mx){
                d=ap-mx;
                ct+=d;
                mn+=d;
                mx+=d;
            }else if(ap<mn){
                d=mn-ap;
                ct+=d;
                mn-=d;
                mx-=d;
            }
        }printf("%d\n",ct);
    }
    return 0;
}

