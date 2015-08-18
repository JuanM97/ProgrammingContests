/* 
 * File:   Prob38.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 10:23 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#include <utility>
#define smx 10000100
using namespace std;

int digs[10];
vector<int>lims;
vector<int>nn;

bool isPand(int a){
    int aa=a,aux=0,r=0;
    memset(digs,0,sizeof(digs));
    /*printf("size: %d //:",nn.size());
    for(int i=1;i<10;i++){
        printf("%d ",digs[i]);
    }printf("   %d  ",aa);*/
    for(int i=0;i<nn.size();i++){
        aa=a;
        aux=aa*nn[i];
        while(aux>=1){
            r=aux%10;
            digs[r]++;
            if(digs[r]>1)return false;
            aux/=10;
        }
    }
    /*for(int i=1;i<10;i++){
        printf("%d ",digs[i]);
    }printf("\n");*/
    if(digs[0]>0)return false;
    for(int i=1;i<10;i++){
        if(digs[i]!=1)return false;
    }
    return true;
}

vector<pair<int,int> >pand;
vector<int>nns;
int main() {
    nn.push_back(1);
    lims.push_back(9999);
    lims.push_back(999);
    lims.push_back(99);
    lims.push_back(9);
    int mx=0,mxl=-1,iix=0;
    for(int i=0;i<4;i++){
        nn.push_back(i+2);
        for(int j=1;j<=lims[i];j++){
            if(isPand(j)){
                pand.push_back(make_pair(j,i));
                mx=j;
                if(mx>mxl){
                    iix=i;
                    mxl=mx;
                }
            }
        }
    }
    int dd=0;
    for(int i=0;i<pand.size();i++){
        printf("%d,%d  ",pand[i].first,pand[i].second);
        switch(pand[i].second){
            case 0:
                dd=pand[i].first*100000+pand[i].first*2;
                break;
            case 1:
                dd=pand[i].first*1000000+pand[i].first*20+pand[i].first*3;
                break;
            case 2:
                dd=pand[i].first*10000000+pand[i].first*200+pand[i].first*30+pand[i].first*4;
                break;
            case 3:
                dd=pand[i].first*100000000+pand[i].first*2000+pand[i].first*300+pand[i].first*40+pand[i].first*5;
                break;
        }
        nns.push_back(dd);
    }printf("\n");
    sort(nns.begin(),nns.end());
    printf("%d\n",nns[nns.size()-1]);
    return 0;
}

