/* 
 * File:   P1504_EvenDigitProductEasy.cpp
 * Author: JuanM
 *
 * Created on June 26, 2013, 9:44 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#define lmax 1000020
using namespace std;

bool d2[lmax];
int cnt[lmax];

void preCalc(){
    int c=0;
    for(int i=0;i<lmax;i++,c++){
        if(!(c&1)){
            d2[i]=true;
        }
    }
    c=0;
    for(int i=10;i<lmax;i++,c++){
        if(c>=10){
            d2[i]=d2[i]|true;
            if(c==20){
                c=0;
            }
        }
    }
    c=0;
    for(int i=100;i<lmax;i++,c++){
        if(c>=100){
            d2[i]=d2[i]|true;
            if(c==200){
                c=0;
            }
        }
    }
    c=0;
    for(int i=1000;i<lmax;i++,c++){
        if(c>=1000){
            d2[i]=d2[i]|true;
            if(c==2000){
                c=0;
            }
        }
    }
    c=0;
    for(int i=10000;i<lmax;i++,c++){
        if(c>=10000){
            d2[i]=d2[i]|true;
            if(c==20000){
                c=0;
            }
        }
    }
    c=0;
    for(int i=100000;i<lmax;i++,c++){
        if(c>=100000){
            d2[i]=d2[i]|true;
            if(c==200000){
                c=0;
            }
        }
    }
    c=0;
    for(int i=1000000;i<lmax;i++,c++){
        if(c>=1000000){
            d2[i]=d2[i]|true;
            if(c==2000000){
                c=0;
            }
        }
    }
    cnt[0]=1;
    for(int i=1;i<lmax;i++){
        if(d2[i]){
            cnt[i]=cnt[i-1]+1;
        }else{
            cnt[i]=cnt[i-1];
        }
    }
}

void printD(int b){
    for(int i=0;i<b;i++){
        printf("%d:%s ",i,d2[i]?"s":"n");
    }
}

void printC(int b){
    for(int i=0;i<b;i++){
        printf("%d ",cnt[i]);
    }
}

int main() {
    preCalc();
    //printC(30);
    int t,a,b;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&a,&b);
        printf("%d\n",cnt[b]-cnt[a-1]);
    }
    return 0;
}

