/* 
 * File:   P10813_TraditionalBingo.cpp
 * Author: JuanM
 *
 * Created on May 30, 2014, 10:46 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int t,xx,yy;
int bng[7][7];
bool occ[7][7];
int cds[77];
bool f1=false;

bool checkWin(){
    if(occ[0][0]&&occ[1][0]&&occ[2][0]&&occ[3][0]&&occ[4][0]) return true;
    if(occ[0][1]&&occ[1][1]&&occ[2][1]&&occ[3][1]&&occ[4][1]) return true;
    if(occ[0][2]&&occ[1][2]&&occ[2][2]&&occ[3][2]&&occ[4][2]) return true;
    if(occ[0][3]&&occ[1][3]&&occ[2][3]&&occ[3][3]&&occ[4][3]) return true;
    if(occ[0][4]&&occ[1][4]&&occ[2][4]&&occ[3][4]&&occ[4][4]) return true;
    if(occ[0][0]&&occ[0][1]&&occ[0][2]&&occ[0][3]&&occ[0][4]) return true;
    if(occ[1][0]&&occ[1][1]&&occ[1][2]&&occ[1][3]&&occ[1][4]) return true;
    if(occ[2][0]&&occ[2][1]&&occ[2][2]&&occ[2][3]&&occ[2][4]) return true;
    if(occ[3][0]&&occ[3][1]&&occ[3][2]&&occ[3][3]&&occ[3][4]) return true;
    if(occ[4][0]&&occ[4][1]&&occ[4][2]&&occ[4][3]&&occ[4][4]) return true;
    if(occ[0][0]&&occ[1][1]&&occ[2][2]&&occ[3][3]&&occ[4][4]) return true;
    if(occ[0][4]&&occ[1][3]&&occ[2][2]&&occ[3][1]&&occ[4][0]) return true;
    return false;
}

int main() {
    scanf("%d",&t);
    while(t--){
        memset(bng,0,sizeof(bng));
        memset(occ,0,sizeof(occ));
        memset(cds,0,sizeof(cds));
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==2&&j==2)continue;
                scanf("%d",&bng[i][j]);
            }
        }
        for(int i=0;i<75;i++){
            scanf("%d",&cds[i]);
        }
        occ[2][2]=true;
        bng[2][2]=-1;
        f1=false;
        for(int k=0;k<75;k++){
            f1=false;
            for(int i=0;i<5;i++){
                if(!f1)
                for(int j=0;j<5;j++){
                    if(cds[k]==bng[i][j]){
                        occ[i][j]=true;
                        f1=true;
                        break;
                    }
                }
            }
            if(checkWin()){
                printf("BINGO after %d numbers announced\n",k+1);
                f1=true;
                break;
            }
        }
        if(!f1)
        printf("BINGO after %d numbers announced\n",-1);
    }
    
    return 0;
}

