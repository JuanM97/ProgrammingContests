/* 
 * File:   P1568_SquareMatrix.cpp
 * Author: JuanM
 *
 * Created on January 14, 2014, 1:01 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#define ll 1000010
using namespace std;

long long int n,k,r,c,tmp,left;

int main() {
    while(scanf("%ld %ld %ld %ld",&n,&k,&r,&c)!=EOF){
        left=1;
        k<0?(k*=-1):(left=0);
        k%=4;
        if(left&&k==1)k=3;
        else{
            if(left&&k==3)k=1;
        }
        tmp=0;
        if(k==0){
            //printf("0rc: %d %d\n",c,r);
            printf("%ld\n",(r-1)*n+c);
        }else{
            if(k==1){
                tmp=c;
                c=r;
                r=n-tmp+1;
                //printf("1rc: %d %d\n",c,r);
                printf("%ld\n",(r-1)*n+c);
            }else{
                if(k==2){
                    tmp=r;
                    r=n-c+1;
                    c=n-tmp+1;
                    //printf("2rc: %d %d\n",c,r);
                    printf("%ld\n",(r-1)*n+c);
                }else{
                    tmp=r;
                    r=c;
                    c=n-tmp+1;
                    //printf("3rc: %d %d\n",c,r);
                    printf("%ld\n",(r-1)*n+c);
                }
            }
        }
    }
    return 0;
}

