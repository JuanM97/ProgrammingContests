/* 
 * File:   P2525_DangerousDive.cpp
 * Author: JuanM
 *
 * Created on January 20, 2015, 12:20 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

int ds[10100];
int n,r,aux;

int main() {
    
    while(scanf("%d %d",&n,&r)!=EOF){
        memset(ds,0,sizeof(ds));
        for(int i=0;i<r;i++){
            scanf("%d",&aux);
            ds[aux]=1;
        }
        if(n-r>0){
            for(int i=1;i<=n;i++){
                if(ds[i]==0)printf("%d ",i);
            }
        }else{
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}

