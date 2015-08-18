/* 
 * File:   P12060_AllIntegerAverage.cpp
 * Author: JuanM
 *
 * Created on May 29, 2014, 12:19 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int n,a,b,c,sgn,act,sum,g,aux,ssz,auxs,ax2,sz2;

int gcd(int a,int b){
    if(b==0)return a;
    else return gcd(b,a%b);
}
int main() {
    int idx=1;
    while(scanf("%d",&n)&&n!=0){
        sum=0;
        for(int i=0;i<n;i++){
            scanf("%d",&act);
            sum+=act;
        }
        sgn=sum<0?1:0;
        sum=abs(sum);
        a=sum/n;
        c=n;
        printf("Case %d:\n",idx++);
        if(sum%n!=0){
            b=sum%n;
            g=gcd(b,c);
            if(g!=1){
                b/=g;
                c/=g;
            }
            if(sgn){printf("  ");}
            aux=a;
            ssz=0;
            while(aux>=1){
                ssz++;
                aux/=10;
            }
            for(int i=0;i<ssz;i++){
                printf(" ");
            }
            auxs=ssz;
            if(sgn)auxs+=2;
            aux=c;
            ssz=-1;
            while(aux>=1){
                ssz++;
                aux/=10;
            }
            ax2=b;
            sz2=-1;
            while(ax2>=1){
                sz2++;
                ax2/=10;
            }
            for(int i=0;i<ssz-sz2;i++){
                printf(" ");
            }
            printf("%d\n",b);
            printf("%s",sgn?"- ":"");
            if(a>0){printf("%d",a);}
            for(int i=-1;i<ssz;i++){
                printf("-");
            }printf("\n");
            for(int i=0;i<auxs;i++){
                printf(" ");
            }
            printf("%d\n",c);
        }else{
            printf("%s%d\n",sgn?"- ":"",a);
        }
    }
    return 0;
}

