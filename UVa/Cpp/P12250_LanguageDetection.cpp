/* 
 * File:   P12250_LanguageDetection.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 12:03 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;



int main() {
    int caseN=1;
    char s[20];
    while(scanf("%s",&s)!=EOF){
        if(strcmp(s,"#")==0)break;
        if(strcmp(s,"HELLO")==0){
            printf("Case %d: ENGLISH\n",caseN++);
        }else{
            if(strcmp(s,"HALLO")==0){
                printf("Case %d: GERMAN\n",caseN++);
            }else{
                if(strcmp(s,"HOLA")==0){
                    printf("Case %d: SPANISH\n",caseN++);
                }else{
                    if(strcmp(s,"BONJOUR")==0){
                        printf("Case %d: FRENCH\n",caseN++);
                    }else{
                        if(strcmp(s,"CIAO")==0){
                            printf("Case %d: ITALIAN\n",caseN++);
                        }else{
                            if(strcmp(s,"ZDRAVSTVUJTE")==0){
                                printf("Case %d: RUSSIAN\n",caseN++);
                            }else{
                                printf("Case %d: UNKNOWN\n",caseN++);
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}

