/* 
 * File:   P2955_TheMightyPowerSquares.cpp
 * Author: JuanM
 *
 * Created on September 22, 2014, 11:48 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 23
using namespace std;

long long int marker[smx];
long long int powersOfTwo[smx];
long long int howMany[smx];

void fillHowMany(){
    howMany[0]=1;
    for(int i=1;i<smx;i++){
        howMany[i]=marker[i+1]-marker[i];
    }
}

void fillPowersOfTwo(){
    int n=1;
    powersOfTwo[0]=0;
    for(int i=1;i<smx;i++){
        powersOfTwo[i]=n;
        n<<=1;
    }
}

void fillMarkers(){
    int n=1;
    marker[0]=0;
    for(int i=1;i<smx;i++){
        marker[i]=n;
        n<<=2;
    }
}

void printt(){
    printf("powers of two:\n");
    for(int i=0;i<smx;i++){
        printf("%d ",powersOfTwo[i]);
    }printf("\nmarkers:\n");
    for(int i=0;i<smx;i++){
        printf("%d ",marker[i]);
    }printf("\nhow many:\n");
    for(int i=0;i<smx;i++){
        printf("%d ",howMany[i]);
    }printf("\n");
}

int getMaxPowerOfTwoIdx(int n){
    int idx=-1;
    do{
        idx++;
    }while(n>=marker[idx]);
    return idx-1;
}

int main() {
    int t,a,b,idxA,idxB;
    long long int sum,dif;
    fillPowersOfTwo();
    fillMarkers();
    fillHowMany();
    //printt();
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&a,&b);
        dif=b-a+1;
        sum=0;
        idxA=getMaxPowerOfTwoIdx(a);
        idxB=getMaxPowerOfTwoIdx(b);
        //printf("idx: %d %d\n",idxA,idxB);
        if(dif>=marker[idxA+1]-a){
            sum+=((marker[idxA+1]-a)*powersOfTwo[idxA]);
            dif-=marker[idxA+1]-a;
        }else{
            sum+=((dif)*powersOfTwo[idxA]);
            dif=0;
        }
        if(dif>0)
        for(int i=idxA+1;dif>0;i++){
            if(dif>=howMany[i]){
                sum+=((howMany[i])*powersOfTwo[i]);
                dif-=howMany[i];
                //printf("%lld %lld\n",sum,dif);
            }else{
                sum+=((dif)*powersOfTwo[i]);
                dif-=howMany[i];
                //printf("%lld %lld\n",sum,dif);
            }
        }
        printf("%lld\n",sum);
    }
    return 0;
}

