/* 
 * File:   P353_PeskyPalindromes.cpp
 * Author: JuanM
 *
 * Created on July 13, 2013, 12:21 AM
 */

//WA :'(
#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

char s[83];
int abc[30];

int countRep(){
    int c=0;
    memset(abc,0,sizeof abc);
    for(int i=0;i<strlen(s);i++){
        if(abc[s[i]-'a']==0){
            abc[s[i]-'a']++;
        }else{
            c++;
        }
    }
    return c;
}

bool isP(int a,int b){
    for(int i=a;i<=(a+b+1)/2;i++){
        if(s[i]!=s[b+a-i])return false;
    }
    return true;
}
int c,r;
int main() {
    while(scanf("%s",&s)!=EOF){
        c=0;
        r=countRep();
        for(int i=0;i<strlen(s);i++){
            for(int j=i;j<strlen(s);j++){
                if(isP(i,j)){
                    /*for(int d=i;d<=j;d++)printf("%c",s[d]);
                    printf("\n");*/
                    c++;
                }
            }
        }
        printf("The string '%s' contains %d palindromes.\n",s,c-r);
    }
    return 0;
}

