/* 
 * File:   P3012_FlexibleSpaces.cpp
 * Author: JuanManuel
 *
 * Created on 18 de mayo de 2015, 20:38
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 110
using namespace std;
bool isIn[smx];
int nums[smx];
int main() {
    int w,p;
    bool first;
    while(scanf("%d %d",&w,&p)!=EOF){
        nums[0]=0;
        nums[1]=w;
        for(int i=2;i<p+2;i++){
            scanf("%d",&nums[i]);
        }
        sort(nums,nums+p+2);
        memset(isIn,0,sizeof(isIn));
        for(int i=0;i<p+2;i++){
            for(int j=i+1;j<p+2;j++){
                isIn[nums[j]-nums[i]]=1;
            }
        }
        isIn[w]=1;
        first=true;
        for(int i=0;i<smx;i++){
            if(isIn[i]&&first){
                printf("%d",i);
                first=false;
            }
            else if(isIn[i])printf(" %d",i);
        }
        printf("\n");
    }
    return 0;
}

