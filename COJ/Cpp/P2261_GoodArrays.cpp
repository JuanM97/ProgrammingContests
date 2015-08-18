/* 
 * File:   P2261_GoodArrays.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 20:32
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#define smx 2500
using namespace std;

//Doesn't work ):

vector<int>p;
bool pb[smx];
void preCalc(){
    pb[1]=0;
    for(int i=4;i<smx;i+=2){
        pb[i]=1;
    }
    p.push_back(2);
    for(int i=3;i<smx;i+=2){
        if(!pb[i]){
            p.push_back(i);
            for(int j=2;i*j<smx;j++){
                pb[i*j]=1;
            }
        }
    }
}
int nums[smx];
int main() {
    preCalc();
    /*for(int i=0;i<10;i++){
        printf("%d ",p[i]);
    }printf("\n");*/
    memset(nums,0,sizeof(nums));
    nums[0]=0;nums[1]=1;
    for(int i=0;i<p.size();i++){
        for(int j=1;j*p[i]<smx;j++){
            nums[j*p[i]]++;
        }
    }   
    int n,a;
    bool isDiv=true;
    while(scanf("%d",&n)!=EOF){
        isDiv=true;
        for(int i=0;i<n;i++){
            scanf("%d",&a);
            //printf("%d ",nums[a]);
            if(nums[a]!=3){
                isDiv=false;
            }
        }
        printf("%s\n",isDiv?"YES":"NO");
    }
    return 0;
}

