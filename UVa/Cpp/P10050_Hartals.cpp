/* 
 * File:   P10050_Hartals.cpp
 * Author: JuanM
 *
 * Created on July 17, 2013, 10:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

bool table[130][3700];
int t,N,p,h,ctr;
bool op;
int main() {
    scanf("%d",&t);
    while(t--){
        memset(table,false,sizeof table);
        scanf("%d %d",&N,&p);
        for(int i=0;i<p;i++){
            scanf("%d",&h);
            for(int j=1;j<=N;j++){
                if(j%h==0){
                    table[i][j]=true;
                }
            }
        }
        
        ctr=0;
        for(int i=1;i<=N;i++){
            op=false;
            if(i%7==6||i%7==0)continue;
            for(int j=0;j<p;j++){
                op=op|table[j][i];
                //printf("%s ",op?"t":"f");
            }//printf("\n");
            if(op){
                //printf("I: %d\n",i);
                ctr++;
            }
        }
        printf("%d\n",ctr);
    }
    return 0;
}

