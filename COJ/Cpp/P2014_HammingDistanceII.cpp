/* 
 * File:   P2014_HammingDistanceII.cpp
 * Author: JuanM
 *
 * Created on June 2, 2013, 11:28 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;
int t,d,ones;
char bits[103];
char hD[103];

int countOnes(){
    int c=0;
    for(int i=0;i<strlen(bits);i++){
        if(bits[i]=='1')
            c++;
    }
    return c;
}

void left2Right(){
    strcpy(hD,bits);
    for(int i=0;d&&i<strlen(bits);i++){
        if(bits[i]=='1'){
            hD[i]='0';
            d--;
        }
    }
}

void right2Left(){
    d=d-ones;
    memset(hD,'0',strlen(bits));
    for(int i=strlen(bits)-1;d&&i>=0;i--){
        if(bits[i]=='0'){
            hD[i]='1';
            d--;
        }
    }
}

int main() {
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
        memset(hD,'\0',sizeof(hD));
        scanf("%s %d",&bits,&d);
        ones=countOnes();
        if(ones>d){
            left2Right();
        }else{
            if(ones==d){
                memset(hD,'0',strlen(bits));
            }else{
                right2Left();
            }
        }
        printf("Case #%d: %s\n",i,hD);
        
    }
    return 0;
}

