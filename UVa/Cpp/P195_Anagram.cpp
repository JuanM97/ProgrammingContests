/* 
 * File:   P195_Anagram.cpp
 * Author: JuanM
 *
 * Created on July 13, 2013, 1:46 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <ctype.h>
#include <algorithm>
using namespace std;

bool st(char x,char y){
    if(tolower(x)-tolower(y)){
        return tolower(x)<tolower(y);
    }else{
        return x<y;
    }
}

int t;
char wd[103000];
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%s",&wd);
        sort(wd,wd+strlen(wd),st);
        do{
            printf("%s\n",wd);
        }while(next_permutation(wd,wd+strlen(wd),st));
        
    }
    return 0;
}

