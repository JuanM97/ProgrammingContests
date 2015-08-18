/* 
 * File:   P2700_UniqwordsComparison.cpp
 * Author: JuanM
 *
 * Created on November 17, 2014, 5:42 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
#include <cstring>
#include <algorithm>
#define smx 50
using namespace std;

int main(){
    char a[smx],b[smx];
    bool ca[smx],cb[smx];
    while(scanf("%s %s",a,b)!=EOF){
        memset(ca,0,smx);
        memset(cb,0,smx);
        for(int i=0;i<strlen(a);i++) ca[a[i]-'A']++;
        for(int i=0;i<strlen(b);i++) cb[b[i]-'A']++;
        /*
        for(int i=0;i<30;i++) printf("%c: %d ",'A'+i,ca[i]?1:0);
        printf("\n");
        for(int i=0;i<30;i++) printf("%c: %d ",'A'+i,cb[i]?1:0);
        printf("\n");
        */
        printf("First:");
        for(int i=0;i<strlen(a);i++) if(!cb[a[i]-'A'])printf("%c",a[i]);
        printf("\nSecond:");
        for(int i=0;i<strlen(b);i++) if(!ca[b[i]-'A'])printf("%c",b[i]);
        printf("\nFirst&Second:");
        for(char i='A';i<='Z';i++) if(ca[i-'A']&&cb[i-'A'])printf("%c",i);
        printf("\n");
    }
    
    return 0;
}

