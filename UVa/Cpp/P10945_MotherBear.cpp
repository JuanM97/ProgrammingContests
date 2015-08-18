/* 
 * File:   P10945_MotherBear.cpp
 * Author: JuanM
 *
 * Created on July 13, 2013, 1:05 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <ctype.h>
using namespace std;

char sent[1000030];
char pal[1000030];

bool isP(){
    for(int i=0;i<=strlen(pal)/2;i++){
        if(pal[i]!=pal[strlen(pal)-i-1])return false;
    }
    return true;
}
int idx;
int main() {
    while(1){
        gets(sent);
        if(strcmp(sent,"DONE")==0)break;
        idx=0;
        memset(pal,'\0',sizeof pal);
        for(int i=0;i<strlen(sent);i++){
            if(isalpha(sent[i])){
                pal[idx++]=tolower(sent[i]);
            }
        }
        printf("%s\n",(isP()?"You won't be eaten!":"Uh oh.."));
    }
    return 0;
}

