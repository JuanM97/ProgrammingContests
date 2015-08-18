/* 
 * File:   P3138_Transpose.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 2:20 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define smx 110
using namespace std;

int mat[smx][smx];

int main() {
    int t,m,n;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&m,&n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                scanf("%d",&mat[j][i]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                printf("%s%d",j==0?"":" ",mat[i][j]);
            }printf("\n");
        }
    }
    return 0;
}

