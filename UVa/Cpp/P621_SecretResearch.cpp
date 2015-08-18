/* 
 * File:   P621_SecretResearch.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 2:04 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

int t;
char n[153];
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%s",&n);
        if(strcmp(n,"1")==0||strcmp(n,"4")==0||strcmp(n,"78")==0){
            printf("+\n");
        }else{
            if(n[strlen(n)-2]=='3'&&n[strlen(n)-1]=='5'){
                printf("-\n");
            }else{
                if(n[0]=='9'&&n[strlen(n)-1]=='4'){
                    printf("*\n");
                }else{
                    printf("?\n");
                }
            }
        }
    }
    return 0;
}

