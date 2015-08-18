/* 
 * File:   P10963_TheSwallowingGround.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 4:04 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

int t,n,gap,a,b;
bool f,C,isF=true;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        f=true;
        C=true;
        while(n--){
            scanf("%d %d",&a,&b);
            if(f){
                gap=abs(b-a);
                f=false;
            }else{
                if(abs(b-a)!=gap){
                    C=false;
                }
            }
        }
        isF=false;
        if(C){
            printf("yes\n");
        }else{
            printf("no\n");
        }
        if(t>=1){
            printf("\n");
        }
    }
    return 0;
}

