/* 
 * File:   P2012_ChallengingWords.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 2:00 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <iostream>
using namespace std;

char word[1003];
int indx[2003];
int ll,maxV;

int getValue(){
    int v=0;
    for(int i=0;i<strlen(word);i++){
        if((word[i]>=97&&word[i]<=122)||(word[i]>=65&&word[i]<=90)){
            v=v+(int)(tolower(word[i])-'a');
        }
    }
    return v;
}

int main() {
    int idx=1;
    int pos=0;
    maxV=-1;
    while(scanf("%s",&word)!=EOF){
        //if(strcmp(word,"lolol")==0)break;
        ll=getValue();
        if(ll==maxV){
            indx[pos++]=idx;
        }else{
            if(ll>maxV){
                maxV=ll;
                pos=0;
                indx[pos++]=idx;
            }
        }
        ++idx;
    }
    printf("%d\n",maxV);
    for(int i=0;i<pos;i++){
        printf("%d\n",indx[i]);
    }
    return 0;
}

