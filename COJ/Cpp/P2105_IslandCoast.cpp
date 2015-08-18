/* 
 * File:   P2105_IslandCoast.cpp
 * Author: JuanM
 *
 * Created on January 19, 2015, 11:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

int n,m,ct;
char map[1010][1010];

int main() {
    while(scanf("%d %d",&n,&m)!=EOF){
        for(int i=1;i<=n;i++){
            scanf("%s",&map[i]);
        }
        /*
        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                printf("%c",map[i][j]);
            }
            printf("\n");
        }
        */
        ct=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]=='+'&&(map[i-1][j]=='-'||map[i+1][j]=='-'||map[i][j-1]=='-'||map[i][j+1]=='-')){
                    ct++;
                }
            }
        }
        printf("%d\n",ct);
    }
    return 0;
}

