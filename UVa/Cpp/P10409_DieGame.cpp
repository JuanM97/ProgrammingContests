/* 
 * File:   P10409_DieGame.cpp
 * Author: JuanM
 *
 * Created on July 12, 2013, 11:39 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

int die[5];

void north(){
    int a=die[2];
    die[2]=die[1];
    die[1]=7-a;
}

void south(){
    int a=die[1];
    die[1]=die[2];
    die[2]=7-a;
}

void east(){
    int a=die[1];
    die[1]=die[0];
    die[0]=7-a;
}

void west(){
    int a=die[0];
    die[0]=die[1];
    die[1]=7-a;
}

void init(){
    die[0]=3;
    die[1]=1;
    die[2]=2;
}
int n;
char ins[13];
int main(){
    while(scanf("%d",&n)){
        if(n==0)break;
        init();
        while(n--){
            scanf("%s",&ins);
            if(strcmp(ins,"north")==0){
                north();
            }else{
                if(strcmp(ins,"south")==0){
                    south();
                }else{
                    if(strcmp(ins,"east")==0){
                        east();
                    }else{
                        west();
                    }
                }
            }
        }
        printf("%d\n",die[1]);
    }
    return 0;
}

