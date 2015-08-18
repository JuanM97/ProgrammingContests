/* 
 * File:   P11192_GroupReverse.cpp
 * Author: JuanM
 *
 * Created on July 18, 2013, 12:09 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int g,lg,ix;
char wrd[113];
char r[113];
int main() {
    while(scanf("%d",&g)&&g!=0){
        scanf("%s",&wrd);
        lg=strlen(wrd)/g;
        memset(r,0,sizeof r);
        ix=0;
        for(int i=0;i<strlen(wrd);i+=lg){
            for(int j=i+lg-1;j>=i;j--){
                r[ix++]=wrd[j];
            }
        }
        printf("%s\n",r);
    }
    return 0;
}

