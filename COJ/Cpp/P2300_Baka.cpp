/* 
 * File:   P2300_Baka.cpp
 * Author: JuanManuel
 *
 * Created on 12 de noviembre de 2014, 12:22
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 33
using namespace std;

int valor(char a){
    if(a>='A'&&a<='C')return 2;
    else if(a>='A'&&a<='C')return 2;
    else if(a>='D'&&a<='F')return 3;
    else if(a>='G'&&a<='I')return 4;
    else if(a>='J'&&a<='L')return 5;
    else if(a>='M'&&a<='O')return 6;
    else if(a>='P'&&a<='S')return 7;
    else if(a>='T'&&a<='V')return 8;
    else return 9;
}

int main() {
    char ws[smx];
    int cnt=0;
    while(scanf("%s",ws)!=EOF){
        cnt=0;
        for(int i=0;i<strlen(ws);i++){
            cnt+=valor(ws[i]);
        }
        printf("%d\n",cnt+strlen(ws));
    }
    
    return 0;
}

