/* 
 * File:   P2698_AmBiC.cpp
 * Author: JuanM
 *
 * Created on February 11, 2014, 3:08 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

char let[50];
int tot;
int main() {
    
    while(scanf("%s",let)!=EOF){
        tot=0;
        for(int i=0;i<strlen(let);i++){
            tot+=(let[i]-'A'+1);
        }
        printf("%d\n",tot);
    }
    
    return 0;
}

