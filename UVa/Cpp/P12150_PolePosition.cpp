/* 
 * File:   P12150_PolePosition.cpp
 * Author: JuanM
 *
 * Created on July 25, 2013, 1:53 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int n,car,p;
int pos[1000010];
bool valid;

int main() {
    while(scanf("%d",&n)&&n!=0){
        memset(pos,0,sizeof pos);
        valid=true;
        for(int i=0;i<n;i++){
            scanf("%d %d",&car,&p);
            if((i+p)<n&&(i+p)>=0&&pos[i+p]==0){
                pos[i+p]=car;
            }else{
                valid=false;
            }
        }
        if(valid){
            for(int i=0;i<n;i++){
                if(i==0) printf("%d",pos[i]);
                else printf(" %d",pos[i]);
            }printf("\n");
        }else{
            printf("-1\n");
        }
    }
    return 0;
}

