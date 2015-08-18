/* 
 * File:   P1390_MaxFactor.cpp
 * Author: JuanM
 *
 * Created on July 1, 2013, 4:32 PM
 */

#include <cstdlib>
#include <cstdio>
#include <vector>
#define smx 20003
using namespace std;

bool pb[smx];
vector<int>vp;

void preCalc(){
    pb[0]=1;
    pb[1]=1;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=1;
    }
    vp.push_back(2);
    for(int i=3;i<smx;i++){
        if(!pb[i]){
            vp.push_back(i);
            for(int j=3;i*j<smx;j++){
                pb[i*j]=1;
            }
        }
    }
}

void printP(int b){
    for(int i=0;i<b;i++){
        printf("%s ",pb[i]?"true":"false");
    }
}

int getMaxP(int n){
    if(!pb[n]){
        return n;
    }else{
        int mxp=-1;
        for(int i=0;vp[i]*vp[i]<=n;i++){
            while(n%vp[i]==0){
                if(vp[i]>mxp){
                    mxp=vp[i];
                }
                n/=vp[i];
            }
        }
        if(n>1)mxp=n;
        return mxp;
    }
}

int main() {
    preCalc();
    //printP(30);
    int t,n,maxn=-1,maxp=-1;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        //printf("M: %d\n",getMaxP(n));
        if(getMaxP(n)>maxp){
            maxp=getMaxP(n);
            maxn=n;
        }
    }
    printf("%d\n",maxn);
    return 0;
}

