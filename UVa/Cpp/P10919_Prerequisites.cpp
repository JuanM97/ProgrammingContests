/* 
 * File:   P10919_Prerequisites.cpp
 * Author: JuanM
 *
 * Created on July 12, 2013, 12:19 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int tc[103];
int n,m,a,b,ct,cc;
bool cp;

bool courseTaken(int a,int n){
    for(int i=0;i<n;i++){
        if(tc[i]==a)return true;
    }
    return false;
}

int main() {
    while(scanf("%d",&n)){
        if(n==0)break;
        scanf("%d",&m);
        for(int i=0;i<n;i++){
            scanf("%d",&tc[i]);
        }
        cp=true;
        while(m--){
            scanf("%d %d",&a,&b);
            ct=0;
            while(a--){
                scanf("%d",&cc);
                if(courseTaken(cc,n)){
                    ct++;
                }
            }
            if(ct<b)cp=false;
        }
        printf("%s\n",cp?"yes":"no");
    }
    return 0;
}

