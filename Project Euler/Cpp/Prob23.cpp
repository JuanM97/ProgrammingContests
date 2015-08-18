/* 
 * File:   Prob23.cpp
 * Author: JuanM
 *
 * Created on June 5, 2014, 11:00 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 29000
using namespace std;
//Some mistake...4179871
int sDivs[smx];
vector<int>abnum;
void preCalc(){
    sDivs[0]=0;sDivs[1]=1;
    sDivs[2]=1;sDivs[3]=1;
    int c=0;
    for(int i=4;i<smx;i++){
        c=1;
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                if(j!=i/j){
                    c+=(j+(i/j));
                }else{
                    c+=j;
                }
            }
        }
        sDivs[i]=c;
    }
}
bool un[10*smx]={false};
int main() {
    preCalc();
    abnum.clear();
    abnum.push_back(0);
    for(int i=1;i<smx;i++){
        if(sDivs[i]>i)abnum.push_back(i);
    }
    for(int i=0;i<abnum.size();i++){
        /*for(int j=i;j<abnum.size();j++){
            if(abnum[i]+abnum[j]<10*smx)un[abnum[i]+abnum[j]]=true;
        }*/
        //printf("%d ",abnum[i]);
        un[abnum[i]]=true;
    }printf("\n\n");
    int sumN=0;
    bool f1=false;
    for(int i=1;i<28124;i++){
        f1=false;
        for(int j=0;abnum[j]<=i&&j<abnum.size();j++){
            if(i-abnum[j]>=0&&un[i-abnum[j]]){
                f1=true;
                break;
            }
        }
        if(!f1&&i<smx){
            //printf("%d ",i);
            sumN+=i;
        }
    }
    /*for(int i=0;i<smx;i++){
        if(!un[i])sumN+=i;
    }*/
    printf("\n%d\n",sumN);
    return 0;
}

