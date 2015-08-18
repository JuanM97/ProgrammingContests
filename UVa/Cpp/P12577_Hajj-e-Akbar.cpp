/* 
 * File:   P12577_Hajj-e-Akbar.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 12:41 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char s[23];
int caseN=1;
int main() {
    while(1){
        scanf("%s",&s);
        if(strcmp(s,"*")==0)break;
        if(strcmp(s,"Hajj")==0){
            printf("Case %d: Hajj-e-Akbar\n",caseN++);
        }else{
            printf("Case %d: Hajj-e-Asghar\n",caseN++);
        }
    }
    return 0;
}

