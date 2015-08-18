/* 
 * File:   P1915_FunnySpiral.cpp
 * Author: JuanM
 *
 * Created on February 11, 2014, 2:32 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

long long int t,n,l,r;
double x,y;
int uno=1;

void fillA(){
    
}

int main() {
    
    scanf("%lld",&t);
    
    while(t--){
        scanf("%lld",&l);
        //Get n from a relationship with l (triangular numbers)
        n=(long long int)floor((-1+sqrt(1+8*l))/2);
        r=l-n*(n+1)/2;
        
        x=0;
        y=0;
        uno=1;
        for(int i=2;i<=n;i+=2){
            x+=(uno*i);
            uno*=-1;
        }
        uno=1;
        for(int i=1;i<=n;i+=2){
            x+=(0.5*uno);
            y+=(sqrt(3)*uno/2);
            uno*=-1;
        }
        
        if(n%2==1){
            if((n+1)%4==0){
                x-=r;
            }else{
                x+=r;
            }
        }else{
            if(n%4==2){
                x-=r*0.5;
                y-=(sqrt(3)*r/2);
            }else{
                x+=r*0.5;
                y+=(sqrt(3)*r/2);
            }
        }
        //printf("%lld %lf %lf %.2lf\n",n,x,y,sqrt(x*x+y*y));
        printf("%.2lf\n",sqrt(x*x+y*y));
    }
    
    return 0;
}

