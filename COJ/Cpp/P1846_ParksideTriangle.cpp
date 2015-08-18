/* 
 * File:   1846_PArksideTriangle.cpp
 * Author: JuanM
 *
 * Created on June 28, 2013, 11:47 PM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;


int main() {
    int n,sd,s,c,a;
    bool f,l;
    while(scanf("%d %d",&n,&sd)!=EOF){
        c=1;
        a=sd-1;
        for(int i=0;i<n;i++){
            s=a;
            if(s>=10)s=(s+1)%10;
            l=true;
            f=true;
            for(int j=0;j<i;j++){
                printf("  ");
            }
            for(int j=i;j<n;j++){
                if(l){
                    s=s+1;
                    if(s>=10)s=(s+1)%10;
                    printf("%d",s);
                    l=false;
                }else{
                    s=s+j;
                    if(s>=10)s=(s+s/10)%10;
                    if(s==0)s=(s+1)%10;
                    printf(" %d",s);
                    if(f){
                        a=s;
                        if(a>=10)a=(a+1)%10;
                        //printf("\nF: %d\n",a);
                        f=false;
                    }
                }
                
            }
            printf("\n");
        }
    }
    return 0;
}

