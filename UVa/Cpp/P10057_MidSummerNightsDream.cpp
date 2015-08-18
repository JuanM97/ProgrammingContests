/* 
 * File:   P10057_MidSummerNightsDream.cpp
 * Author: JuanM
 *
 * Created on July 25, 2013, 6:44 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int n,cn,ml,mh,mid,fml,fmh,med,ix;
int nms[1000013];

int main() {
    while(scanf("%d",&n)!=EOF){
        for(int i=1;i<=n;i++){
            scanf("%d",&nms[i]);
        }
        sort(nms,nms+n);
        ix=0;fml=0;fmh=0;mid=0;mh=0;ml=0;
        mid=n/2+1;
        if(n&1){
            med=nms[mid];
            fml=0;
            if(nms[mid+1]!=nms[mid]){
                ix=mid;
                while(nms[mid-(ix++)]==nms[mid]){
                    fml++;
                }
                printf("%d %d %d\n",med,fml,1);
            }else{
                while(nms[mid-(ix++)]==nms[mid]){
                    fml++;
                }
                ix=1;
                while(nms[mid+(ix++)]==nms[mid]){
                    fml++;
                }
                printf("%d %d %d\n",med,fml,1);
            }
        }else{
            ix=0;
            ml=n/2;
            mh=n/2+1;
            fml=0;fmh=0;
            if(nms[ml]==nms[mh]){
                while(nms[ml-ix]==nms[ml]){
                    fml++;ix++;
                }
                ix=0;
                while(nms[mh+ix]==nms[mh]){
                    fml++;ix++;
                }
                printf("%d %d %d\n",nms[ml],fml,1);
            }else{
                while(nms[ml-(ix++)]==nms[ml]){
                    fml++;
                }
                ix=0;
                while(nms[mh+(ix++)]==nms[mh]){
                    fmh++;
                }
                printf("%d %d %d\n",nms[ml],fmh+fml,nms[mh]-nms[ml]+1);
            }
        }
    }
    return 0;
}

