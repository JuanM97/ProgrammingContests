/* 
 * File:   P1165_GuessTheNumber.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 8:59 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char g[23];
long int n;
bool c;

int egcd(int a, int b){
    if(b==0)
        return a;
    else
        return egcd(b,a%b);
}

int main() {
    
    while(1){
        scanf("%s",&g);
        if(g[0]=='*')break;
        n=1;
        for(int i=strlen(g)-1;i>=0;i--){
            if(g[i]=='Y'&&n%(i+1)!=0){
                n=n*(i+1)/egcd(n,i+1);
            }
        }
        c=true;
        for(int i=0;i<strlen(g);i++){
            if(g[i]=='N'&&n%(i+1)==0){
                c=false;
                break;
            }
        }
        printf("%d\n",c?n:-1);
    }
    return 0;
}

