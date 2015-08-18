/* 
 * File:   P2746_FleasFestivalOfReading.cpp
 * Author: JuanManuel
 *
 * Created on 12 de noviembre de 2014, 11:27
 */
#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#define smx 1006
using namespace std;

char word[smx];
int v;

int main() {
    
    while(scanf("%s",word)!=EOF){
        v=0;
        for(int i=0;i<strlen(word);i++){
            if(word[i]=='A'||word[i]=='E'||word[i]=='I'||word[i]=='O'||word[i]=='U')
                v++;
        }
        printf("%d %d\n",v,strlen(word)-v);
    } 
    return 0;
}

