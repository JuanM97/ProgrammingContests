/* 
 * File:   P1539_CodeNumber.cpp
 * Author: JuanM
 *
 * Created on July 14, 2013, 1:51 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int t;
char line[103];
int main() {
    scanf("%d\n",&t);
    while(t--){
        do{
            gets(line);
            for(int i=0;i<strlen(line);i++){
                switch(line[i]){
                    case '0':
                        line[i]='O';
                        break;
                    case '1':
                        line[i]='I';
                        break;
                    case '2':
                        line[i]='Z';
                        break;
                    case '3':
                        line[i]='E';
                        break;
                    case '4':
                        line[i]='A';
                        break;
                    case '5':
                        line[i]='S';
                        break;
                    case '6':
                        line[i]='G';
                        break;
                    case '7':
                        line[i]='T';
                        break;
                    case '8':
                        line[i]='B';
                        break;
                    case '9':
                        line[i]='P';
                        break;
                    default:
                        break;
                }
            }
            printf("%s\n",line);
        }while(strlen(line)!=0);
        printf("\n");
    }
    return 0;
}

