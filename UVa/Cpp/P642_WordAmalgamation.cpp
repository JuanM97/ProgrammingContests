/* 
 * File:   P642_WordAmalgamation.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 1:24 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <ctype.h>
#include <cmath>
#include <algorithm>
#include <vector>
using namespace std;

char words[130][10];
char tw[10],two[10],tmp[10];
int csN;
bool anF;
vector<char*>v;
int n;

bool gt(char*a,char*b){
    return strcmp(a,b)<0;
}

int main() {
    for(n=0;;n++){
        scanf("%s",&words[n]);
        if(strcmp(words[n],"XXXXXX")==0)break;
    }
    csN=1;
    while(1){
        scanf("%s",&tw);
        if(strcmp(tw,"XXXXXX")==0)break;
        sort(tw,tw+strlen(tw));
        anF=false;
        v.clear();
        for(int i=0;i<n;i++){
            strcpy(tmp,words[i]);
            sort(tmp,tmp+strlen(tmp));
            if(strcmp(tw,tmp)==0){
                anF=true;
                v.push_back(words[i]);
            }
        }
        if(!anF){
            printf("NOT A VALID WORD\n");
        }else{
            sort(v.begin(),v.end(),gt);
            for(int i=0;i<v.size();i++)printf("%s\n",v[i]);
        }
        printf("******\n");
    }
    return 0;
}


