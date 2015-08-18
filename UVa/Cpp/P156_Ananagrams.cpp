/* 
 * File:   P156_Ananagrams.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 12:21 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
#include <ctype.h>
#include <vector>
#include <string>
using namespace std;

char words[1030][27];
char ord[1030][27];
char w[27];
vector<char*> v;
int l;
bool anF;

void printN(int b){
    printf("\n");
    for(int i=0;i<b;i++){
        printf("%s ",words[i]);
    }printf("\n");
    for(int i=0;i<b;i++){
        printf("%s ",ord[i]);
    }printf("\n");
}

bool stdd(char*a, char*b){
    return strcmp(a,b);
}

int main() {
    l=0;
    while(1){
        scanf("%s",&words[l]);
        if(strcmp(words[l],"#")==0)break;
        memcpy(&w,words[l],sizeof words[l]);
        for(int i=0;i<strlen(w);i++)w[i]=tolower(w[i]);
        sort(w,w+strlen(w));
        memcpy(&ord[l],w,sizeof w);
        l++;
    }
    //printN(l);
    anF=false;
    for(int i=0;i<l;i++){
        anF=false;
        for(int j=0;j<l;j++){
            if(j!=i)
                if(strcmp(ord[i],ord[j])==0){
                    anF=true;
                    break;
                }
        }
        if(!anF){
            v.push_back(words[i]);
            //printf("P_ %s\n",words[i]);
        }
    }
    //sort(v.begin(),v.end(),stdd);
    
    for ( int i = 0; i <v.size(); i++ ) {
        for ( int j = i + 1; j <v.size(); j++ ) {
            if ( strcmp (v[i],v[j]) > 0 ) {
                char temp [25];
                strcpy (temp,v[i]);
                strcpy (v[i],v[j]);
                strcpy (v[j], temp);
            }
        }
    }
    
    for(int i=0;i<v.size();i++){
        printf("%s\n",v[i]);
    }
    return 0;
}

