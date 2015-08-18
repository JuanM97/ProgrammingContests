/* 
 * File:   P1774_Capitalization.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 8:59 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cctype>
#include <cstring>
using namespace std;


int main() {
    char word[103];
    bool fM,anyM;
    while(scanf("%s",&word)!=EOF){
        fM=false;anyM=false;
        if(isupper(word[0])){
            fM=true;
        }
        for(int i=1;i<strlen(word);i++){
            if(isupper(word[i])){
                anyM=true;
                break;
            }
        }
        //printf("B: %s %s\n",fM?"true":"false",anyM?"true":"false");
        if(!(!anyM || (!anyM && fM))){
            for(int i=0;i<strlen(word);i++){
                if(islower(word[i])){
                    word[i]=toupper(word[i]);
                }else{
                    word[i]=tolower(word[i]);
                }
            }
        }
        printf("%s\n",word);
    }
    return 0;
}

