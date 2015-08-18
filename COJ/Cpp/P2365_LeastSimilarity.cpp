/* 
 * File:   P2365_LeastSimilarity.cpp
 * Author: JuanManuel
 *
 * Created on 26 de noviembre de 2014, 12:29
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#define smx 1000010
using namespace std;


int main() {
    char st[smx];
    int adn[5],idx,ct;
    bool cont;
    while(scanf("%s",st)!=EOF){
        ct=0;
        memset(adn,0,sizeof(adn));
        for(int i=0;i<strlen(st);i++){
            if(ct==4)break;
            if(adn[0]==0&&st[i]=='A'){adn[0]=1;ct++;}
            if(adn[1]==0&&st[i]=='C'){adn[1]=1;ct++;}
            if(adn[2]==0&&st[i]=='G'){adn[2]=1;ct++;}
            if(adn[3]==0&&st[i]=='T'){adn[3]=1;ct++;}
        }
        cont=true;idx=0;
        for(int i=0;i<4;i++){
            if(adn[i]==0){
                idx=i;
                cont=false;
                break;
            }
        }
        if(cont){
            printf("A\n");
        }else{
            if(idx==0){
                printf("A\n");
            }else{
                if(idx==1){
                    printf("C\n");
                }else{
                    if(idx==2){
                        printf("G\n");
                    }else{
                        printf("T\n");
                    }
                }
            }
        }
        
    }
    
    return 0;
}

