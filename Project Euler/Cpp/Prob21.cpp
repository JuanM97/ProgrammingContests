/* 
 * File:   Prob21.cpp
 * Author: JuanM
 *
 * Created on June 5, 2014, 10:16 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#define smx 10010
using namespace std;

int sDivs[smx];

void preCalc(){
    sDivs[0]=0;sDivs[1]=1;
    sDivs[2]=1;sDivs[3]=1;
    int c=0;
    for(int i=4;i<smx;i++){
        c=1;
        for(int j=2;j*j<i;j++){
            if(i%j==0){
                c+=j;
                c+=(i/j);
            }
        }
        sDivs[i]=c;
    }
}
bool un[10003]={false};
int main() {
    preCalc();
    int a2,as=0;
    for(int i=1;i<=10000;i++){
        a2=sDivs[i];
        if(sDivs[a2]==i&&!un[i]&&!un[a2]&&a2!=i){
            as+=i;
            as+=a2;
            //amicable pairs
            //printf("%d %d\n",i,a2);
            un[i]=true;
            un[a2]=true;
        }
    }
    printf("%d\n",as);
    return 0;
}

