/* 
 * File:   P10324_ZerosAndOnes.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 11:10 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

char ones[1000010];
int n,a,b,m,caseN=1;
bool bk;
int main() {
    while(scanf("%s",&ones)!=EOF){
        scanf("%d",&n);
        printf("Case %d:\n",caseN++);
        while(n--){
            scanf("%d %d",&a,&b);
            m=max(a,b);
            bk=false;
            for(int i=min(a,b);i<=m;i++){
                if(ones[i]!=ones[m]){
                    bk=true;
                    break;
                }
            }
            printf("%s\n",bk?"No":"Yes");
        }
    }
    return 0;
}

