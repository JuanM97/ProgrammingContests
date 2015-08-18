/* 
 * File:   P11254_ConsecutiveIntegers.cpp
 * Author: JuanM
 *
 * Created on May 31, 2014, 1:39 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 45000
using namespace std;

        /*
        //En main ...
        for(a=ceil(sqrt(8*N));a<N*N;a++){
            m=sqrt(a*a-8*N);
            if(m==floor(m)&&(int)m%2==1){
                m=int(m-1)>>1;
                break;
            }
        }
        n=int(-1.+sqrt(1.+4.*(m*m+m+2.*N)))>>1;
        */
        /*
        for(m=0;m<N;m++){
        n=(-1.+sqrt(1.+4.*(m*m+m+2.*N)))/2.;
            if(n==floor(n)){
                break;
            }
        }
        */

/*
long int nums[smx];
void sums(){
    nums[0]=0;
    for(int i=1;i<smx;i++){
        nums[i]=nums[i-1]+i;
    }
}

int getNum(int a){
    for(int i=0;i<smx;i++){
        if(nums[i]>=a)return i;
    }
    return 0;
}
*/
int N;
double n,x,xa,y,ya,a,b;
bool f1;
int main() {
    //sums();
    while(scanf("%d",&N)&&N!=-1){
        n=2*N;x=0;xa=0;y=0;ya=0;a=0;b=0;
        a=n/2;
        b=n/2;
        for(int i=2;i*i<=n;i++){
            if((int)n%i==0){
                xa=n/i;
                ya=i;
                if(int(xa+ya-1)&1||int(xa-ya+1)&1)continue;
                x=int(xa-ya+1)>>1;
                y=int(xa+ya-1)>>1;
                if(y-x+1>b-a+1){
                    b=y;
                    a=x;
                }
            }
        }
        printf("%d = %d + ... + %d\n",N,(int)a,(int)b);
    }
    return 0;
}

