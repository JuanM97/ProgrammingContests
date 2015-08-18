/* 
 * File:   P2806_Keks.cpp
 * Author: JuanM
 *
 * Created on April 24, 2014, 1:02 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int N,K,idx;
    char num[500010],num2[500010];
    while(scanf("%d %d",&N,&K)!=EOF){
        scanf("%s",&num);
        memset(num2,0,sizeof(num2));
        for(int i=0;K>0&&i<N-1;i++){
            if(num[i]<num[i+1]){
                num[i]='a';
                K--;
            }
            if(K==0){
                break;
            }
        }
        idx=0;
        for(int i=0;i<N;i++){
            if(num[i]!='a'){
                num2[idx++]=num[i];
            }
        }
        printf("%s\n",num2);
        
    }
    
    return 0;
}

