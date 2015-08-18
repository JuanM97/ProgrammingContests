/* 
 * File:   P1629_CommonPermutation.cpp
 * Author: JuanM
 *
 * Created on August 18, 2013, 1:35 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

char a[1010],b[1010],tt[2050];
int na[50], nb[50],mm,idx;
int main() {
    while(scanf("%s",&a)!=EOF){
        scanf("%s",&b);
        memset(na,0,sizeof na);
        memset(nb,0,sizeof nb);
        memset(tt,'\0',sizeof tt);
        for(int i=0;i<strlen(a);i++){
            na[(int)(a[i]-'a')]++;
        }
        for(int i=0;i<strlen(b);i++){
            nb[(int)(b[i]-'a')]++;
        }
        idx=0;
        
        for(int i=0;i<30;i++){
            if(na[i]>0&&nb[i]>0){
                mm=min(na[i],nb[i]);
                while(mm--){
                    tt[idx++]=(char)('a'+i);
                }
            }
        }
        printf("%s\n",tt);
    }
    return 0;
}

