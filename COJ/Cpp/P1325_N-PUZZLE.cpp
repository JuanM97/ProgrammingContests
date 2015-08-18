/* 
 * File:   1325_N-PUZZLE.cpp
 * Author: JuanM
 *
 * Created on November 28, 2014, 3:40 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

char pz[20];

int main() {
    char r[7];
    int idx,d;
    while(scanf("%s",r)!=EOF){
        idx=0,d=0;
        for(int j=0;j<4;j++,idx++){
            pz[idx]=r[j];
            if(r[j]!='.')d+=(abs(idx/4-(r[j]-'A')/4)+abs(j-(r[j]-'A')%4));
        }
        for(int i=0;i<3;i++){
            scanf("%s",r);
            for(int j=0;j<4;j++,idx++){
                pz[idx]=r[j];
                if(r[j]!='.')d+=(abs(idx/4-(r[j]-'A')/4)+abs(j-(r[j]-'A')%4));
            }
        }
        //for(int i=0;i<20;i++)printf("%c ",pz[i]);
        printf("%d\n",d);
    }
    
    return 0;
}

