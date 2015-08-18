/* 
 * File:   P467_SynchingSignals.cpp
 * Author: JuanM
 *
 * Created on July 17, 2013, 12:26 PM
 */


#include <cstdlib>
#include <cstdio>
#include <string.h>
#include <cmath>
#include <algorithm>
using namespace std;

int n,nmx,hh,mm,ss,setN=1;

bool isGreen(int t,int n){
    return (t%(2*n))<(n-5);
}

void formatH(int t){
    hh=0;mm=0;ss=0;
    if(t<60){
        ss=t;
    }else{
        ss=t%60;
        mm=t/60;
        hh=mm/60;
        mm%=60;
        hh%=24;
    }
}

char line[217];
char *ln;
int ls[100];
bool g,ff;
int idx;
int main() {
    while(1){
        gets(line);
        if(strlen(line)<=0)break;
        idx=0;
        ln=strtok(line," ,.-");
        while(ln!=NULL){
            ls[idx++]=atoi(ln);
            ln=strtok(NULL," ,.-");
        }
        nmx=-1;
        for(int i=0;i<idx;i++){
            if(nmx<ls[n])nmx=ls[n];
        }
        ff=false;
        for(int t=2*nmx;t<=3600;t++){
            g=true;
            for(int i=0;i<idx;i++){
                if(!isGreen(t,ls[i])){
                    g=false;
                    break;
                }
            }
            if(g){
                formatH(t);
                printf("Set %d synchs again at %d minute(s) and %d second(s) after all turning green.\n",setN++,mm,ss);
                ff=true;
                break;
            }
        }
        if(!ff){
            printf("Set %d is unable to synch after one hour.\n",setN++);
        }
    }
    return 0;
}
