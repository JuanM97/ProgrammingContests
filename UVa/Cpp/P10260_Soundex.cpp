/* 
 * File:   P!0260_Soundex.cpp
 * Author: JuanM
 *
 * Created on July 17, 2013, 10:47 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
using namespace std;

char tt[50];

void fill(){
    memset(tt,'0',sizeof tt);
    tt['B'-'A']='1'; tt['C'-'A']='2'; tt['D'-'A']='3'; tt['F'-'A']='1'; tt['G'-'A']='2';
    tt['J'-'A']='2'; tt['K'-'A']='2'; tt['L'-'A']='4'; tt['M'-'A']='5'; tt['N'-'A']='5';
    tt['P'-'A']='1'; tt['Q'-'A']='2'; tt['R'-'A']='6'; tt['S'-'A']='2'; tt['T'-'A']='3';
    tt['V'-'A']='1'; tt['X'-'A']='2'; tt['Z'-'A']='2';
}
char wrd[33],sdx[33];
int ix,i;
int main() {
    fill();
    while(scanf("%s",&wrd)!=EOF){
        memset(sdx,'\0',sizeof sdx);
        ix=0;
        i=0;
        while(tt[wrd[i]-'A']=='0'){
            i++;
        }
        sdx[ix++]=tt[wrd[i++]-'A'];
        for(;i<strlen(wrd);i++){
            if(tt[wrd[i]-'A']!='0'){
                if(tt[wrd[i]-'A']==tt[wrd[i-1]-'A'])continue;
                else{
                    sdx[ix++]=tt[wrd[i]-'A'];
                }
            }
        }
        printf("%s\n",sdx);
    }
    return 0;
}

