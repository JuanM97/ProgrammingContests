/* 
 * File:   P630_AnagramsII.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 1:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <ctype.h>
#include <cmath>
#include <algorithm>
using namespace std;
//WA (?)
int t,n;
char words[1030][27];
char tw[27],two[27],tmp[27];
int csN;
bool anF;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%s",&words[i]);
        }
        csN=1;
        while(1){
            scanf("%s",&tw);
            if(strcmp(tw,"END")==0)break;
            printf("Anagrams for: %s\n",tw);
            strcpy(two,tw);
            sort(tw,tw+strlen(tw));
            csN=1;
            anF=false;
            for(int i=0;i<n;i++){
                strcpy(tmp,words[i]);
                sort(tmp,tmp+strlen(tmp));
                if(strcmp(tw,tmp)==0){
                    anF=true;
                    printf("%3d) %s\n",csN++,words[i]);
                }
            }
            if(!anF){
                printf("No anagrams for: %s\n",two);
            }
        }
    }
    return 0;
}

