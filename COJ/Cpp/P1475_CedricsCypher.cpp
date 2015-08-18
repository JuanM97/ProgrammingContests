/* 
 * File:   P1475_CedricsCypher.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 10:03 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <ctype.h>
using namespace std;

char s[260];

int main(){
    int shift=0;
    while(1){
        gets(s);
        if(strcmp(s,"#")==0)break;
        shift=(int)s[strlen(s)-1]-'A';
        for(int i=0;i<strlen(s);i++){
            if(isalpha(s[i])){
                if(isupper(s[i])){
                    s[i]=(char)('A'+((s[i]-shift-'A')<0?(s[i]-shift-'A')+26:(s[i]-shift-'A')));
                }else{
                    s[i]=(char)('a'+((s[i]-shift-'a')<0?(s[i]-shift-'a')+26:(s[i]-shift-'a')));
                }
            }
        }
        s[strlen(s)-1]='\0';
        printf("%s\n",s);
    }
    return 0;
}

