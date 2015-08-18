/* 
 * File:   P1753_Numbersrebmun.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 2:40 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <iostream>
using namespace std;

int t;
char comp[23];
char num[23];

int value(char a){
    int v=0;
    switch(a){
        case 'a':
        case 'b':
        case 'c':v=2;break;
        case 'd':
        case 'e':
        case 'f':v=3;break;
        case 'g':
        case 'h':
        case 'i':v=4;break;
        case 'j':
        case 'k':
        case 'l':v=5;break;
        case 'm':
        case 'n':
        case 'o':v=6;break;
        case 'p':
        case 'q':
        case 'r':
        case 's':v=7;break;
        case 't':
        case 'u':
        case 'v':v=8;break;
        case 'w':
        case 'x':
        case 'y':
        case 'z':v=9;break;
    }
    return v;
}

int getNumb(){
    for(int i=0;i<strlen(comp);i++){
        num[i]=(char)(value(tolower(comp[i]))+'0');
    }
}

bool isPalindrome(){
    bool isP=true;
    for(int i=0;i<strlen(num)/2;i++){
        if(num[i]!=num[strlen(num)-i-1]){
            isP=false;
            break;
        }
    }
    return isP;
}

void printN(){
    for(int i=0;i<strlen(num);i++){
        printf("%c ",num[i]);
    }printf("\n");
}

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%s",&comp);
        memset(num,0,sizeof(num));
        getNumb();
        //printN();
        if(isPalindrome()){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    return 0;
}

