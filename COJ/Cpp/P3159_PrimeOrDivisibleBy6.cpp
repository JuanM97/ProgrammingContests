/* 
 * File:   P3159_PrimeOrDivisibleBy6.cpp
 * Author: JuanManuel
 *
 * Created on 6 de mayo de 2015, 12:42
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 1000100
using namespace std;
bool pb[smx];
void sieve(){
    pb[0]=1;
    pb[1]=1;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=1;
    }
    for(int i=3;i<smx;i+=2){
        if(!pb[i]){
            for(int j=2;i*j<smx;j++){
                pb[i*j]=1;
            }
        }
    }
}

int main() {
    sieve();
    /*for(int i=0;i<30;i++){
        printf("%s ",pb[i]?"Y":"N");
    }*/
    char num[9];
    int n;
    bool is6,isP;
    while(scanf("%s",&num)!=EOF){
        is6=false;
        isP=false;        
        sort(num,num+strlen(num));
        do{
            //printf("%s\n",num);
            n=atoi(num);
            if(!is6)is6=((n%6)==0);
            if(!isP)isP=!pb[n];
        }while(next_permutation(num,num+strlen(num)));
        
        if(is6&&isP){
            printf("Both\n");
        }else{
            if(is6){
                printf("Divisible by 6\n");
            }else{
                if(isP){
                    printf("Prime\n");
                }else{
                    printf("Neither\n");
                }
            }
        }
        
    }
    
    return 0;
}

