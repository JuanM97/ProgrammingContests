/* 
 * File:   P489_HangmanJudge.cpp
 * Author: JuanM
 *
 * Created on May 29, 2014, 6:59 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#include <vector>
using namespace std;

int rd=0;
char word[50];
char guess[50];
bool used[50];
bool found=false,win=false,loose=false;
int rt=0;
int wg=0;

int main() {
    
    while(scanf("%d",&rd)!=EOF&&rd!=-1){
        printf("Round %d\n",rd);
        scanf("%s %s",&word,&guess);
        memset(used,0,sizeof(used));
        win=false;loose=false;
        rt=0;wg=0;
        for(int i=0;i<strlen(guess);i++){
            found=false;
            for(int j=0;j<strlen(word);j++){
                if(guess[i]==word[j]&&!used[guess[i]-'a']){
                    //word[j]='0';
                    rt++;
                    found=true;
                }
            }
            if(!found&&!used[guess[i]-'a'])wg++;
            //printf("wrong!: %d\n",wg);
            if(rt==strlen(word)){
                printf("You win.\n");
                win=true;
                break;
            }else{
                if(wg==7){
                    printf("You lose.\n");
                    loose=true;
                    break;
                }
            }
            used[guess[i]-'a']=true;
        }
        if(!win&&!loose){
            printf("You chickened out.\n");
        }
        
    }
    return 0;
}

