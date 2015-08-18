/* 
 * File:   P12403_SaveSetu.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 12:37 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

int t,m;
long long int mny;
char q[13];
int main() {
    scanf("%d",&t);
    mny=0;
    while(t--){
        scanf("%s",&q);
        if(strcmp(q,"donate")==0){
            scanf("%d",&m);
            mny+=m;
        }else{
            printf("%ld\n",mny);
        }
    }
    return 0;
}

