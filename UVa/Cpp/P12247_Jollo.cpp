/* 
 * File:   P12247_Jollo.cpp
 * Author: JuanM
 *
 * Created on May 29, 2014, 5:44 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#include <functional>
using namespace std;

int pcs[5];
int pce[5];
vector<int>nd;
bool pt=false;
bool winPcs(int a){
    int pce2[5];
    for(int i=0;i<2;i++){
        pce2[i]=pce[i];
    }
    pce2[2]=a;
    sort(pce2,pce2+3,greater<int>());
    /*for(int i=0;i<3;i++){
        printf("%d ",pce2[i]);
    }printf("\n");*/
    return ((pcs[0]>pce2[0]&&pcs[1]>pce2[1])||(pcs[0]>pce2[0]&&pcs[1]>pce2[2])||(pcs[0]>pce2[1]&&pcs[1]>pce2[2]));
}

int main() {
    /*
    FILE *pf;
    pf=fopen("output.txt","w");
    */
    while(1){
        for(int i=0;i<3;i++){
            scanf("%d",&pcs[i]);
        }
        for(int i=0;i<2;i++){
            scanf("%d",&pce[i]);
        }
        if(!pcs[0]&&!pcs[1]&&!pcs[2]&&!pce[0]&&!pce[1])break;
        sort(pcs,pcs+3,greater<int>());
        sort(pce,pce+2,greater<int>());
        
        if(pcs[0]>pce[0]&&pcs[1]>pce[1]){
            printf("-1\n");
            //fprintf(pf,"-1\n");
        }else{
            nd.clear();
            for(int i=1;i<53;i++){
                if(pcs[0]!=i&&pcs[1]!=i&&pcs[2]!=i&&pce[0]!=i&&pce[1]!=i)nd.push_back(i);
            }
            pt=false;
            for(int i=0;i<nd.size();i++){
                if(!winPcs(nd[i])){
                    printf("%d\n",nd[i]);
                    pt=true;
                    //fprintf(pf,"%d\n",nd[i]);
                    break;
                }
            }
            if(!pt)printf("-1\n");
        }
        
    }
    
    return 0;
}

