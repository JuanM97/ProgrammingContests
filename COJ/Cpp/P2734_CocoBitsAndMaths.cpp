/* 
 * File:   P2734_CocoBitsAndMaths.cpp
 * Author: JuanManuel
 *
 * Created on 5 de noviembre de 2014, 12:22
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
    long long int ans=0,num;
    char op[10];
    while(scanf("%s %lld",op,&num)!=EOF){
        //if(strcmp(op,"lol")==0)break;
        if(strcmp(op,"suma")==0){
            ans+=num;
        }else{
            ans-=num;
        }
    }
    printf("resultado: %lld",ans);
    return 0;
}

