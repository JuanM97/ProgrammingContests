/* 
 * File:   P2147_DisplacingCharacters.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 11:38 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char ow[1003];
char rw[1003];

int main() {
    int t,k,l,c;
    scanf("%d",&t);
    while(t--){
        memset(rw,'\0',sizeof(rw));
        scanf("%s %d",&ow,&k);
        l=strlen(ow);
        for(int i=0;i<l;i++){
            c=(i-k)%l>=0?(i-k)%l:(i-k)%l+l;
            rw[i]=ow[c];
        }
        printf("%s\n",rw);
    }
    return 0;
}

