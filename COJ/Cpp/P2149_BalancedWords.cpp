/* 
 * File:   P2149_BalancedWords.cpp
 * Author: JuanM
 *
 * Created on June 27, 2013, 1:13 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;


int main() {
    int t,c;
    char word[103];
    scanf("%d",&t);
    while(t--){
        scanf("%s",&word);
        c=0;
        for(int i=0;i<strlen(word);i++){
            if(word[i]>=97&&word[i]<=122){
                c++;
            }
        }
        if(strlen(word)&1){
            printf("NO\n");
        }else{
            if(c==strlen(word)/2){
                printf("SI\n");
            }else{
                printf("NO\n");
            }
        }
    }
    return 0;
}

