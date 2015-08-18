/* 
 * File:   P2434_MathematicianAna.cpp
 * Author: JuanM
 *
 * Created on January 10, 2014, 11:14 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#include <vector>
#define smx 97
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

void printP(){
    for(int i=0;i<vp.size();i++){
        printf("%d ",vp[i]);
    }
}
int n;
long long s;
int main() {
    preCalc();
    while(scanf("%d",&n)&&n!=0){
        s=1;
        for(int i=0;n>=vp[i];i++){
            s*=vp[i];
        }
        printf("%lld\n",s);
    }
    return 0;
}

