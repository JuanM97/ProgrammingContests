/* 
 * File:   P11956_Brainfuck.cpp
 * Author: JuanM
 *
 * Created on July 12, 2013, 1:50 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char mem[100030];
unsigned char led[103];
int t,caseN=1,p;
int main() {
    scanf("%d",&t);
    while(t--){
        memset(led,0,sizeof led);
        scanf("%s",&mem);
        printf("Case %d:",caseN++);
        p=0;
        for(int i=0;i<strlen(mem);i++){
            switch(mem[i]){
                case '<':
                    p--;
                    break;
                case '>':
                    p++;
                    break;
                case '+':
                    led[p]++;
                    break;
                case '-':
                    led[p]--;
                    break;
                case '.':
                    break;
            }
            p=(p==-1?99:(p==100?0:p));
        }
        for(int i=0;i<100;i++){
            printf(" %02X",led[i]);
        }printf("\n");
    }
    return 0;
}

