/* 
 * File:   P1840_BrokenStrings.cpp
 * Author: JuanManuel
 *
 * Created on 17 de septiembre de 2014, 12:34
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

int main() {
    int t,b;
    char st[110];
    int freq[33];
    scanf("%d",&t);
    while(t--){
        scanf("%s",st);
        memset(freq,0,sizeof(freq));
        for(int i=0;i<strlen(st);i++){
            freq[st[i]-'A']++;
        }
        /*for(int i=0;i<30;i++){
            printf("%d ",freq[i]);
        }*/
        b=freq['B'-'A'];
        if(b==freq['R'-'A']&&b==freq['O'-'A']&&b==freq['K'-'A']&&b==freq['E'-'A']&&b==freq['N'-'A'])
            printf("No Secure\n");
        else
            printf("Secure\n");
    }
    
    return 0;
}

