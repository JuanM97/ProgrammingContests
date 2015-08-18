/* 
 * File:   P11588_ImageCoding.cpp
 * Author: JuanM
 *
 * Created on March 17, 2013, 5:16 PM
 */

#include <cstdlib>
#include <algorithm>
#include <cstdio>
#include <iostream>
#include <cmath>
#include <cstring>
using namespace std;

void print(int*a, int n){
    printf("\n AA:: ");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}

int main() {
    int f[26];
    int t,m,n,p,q,max,count,ii=1;
    char l;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %d %d",&m,&n,&p,&q);
        //for(int i=0;i<26;i++)f[i]=0;
        memset(f,0,sizeof(f));
        for(int i=0;i<m;i++){
            for(int j=0;j<=n;j++){
                scanf("%c",&l);
                f[l-'A']++;
            }
        }
        
        std::sort(f,f+26,std::greater<int>());
        
        max=f[0];
        count=1;
        for(int i=1;i<26;i++){
            if(f[i]==max){
                count++;
            }else{
                break;
            }
        }
        printf("Case %d: %d\n",ii++,max*count*p+(n*m-max*count)*q);
    }
    return 0;
}

