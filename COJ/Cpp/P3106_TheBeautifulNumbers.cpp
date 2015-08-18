/* 
 * File:   P3106_TheBeautifulNumbers.cpp
 * Author: JuanManuel
 *
 * Created on 3 de febrero de 2015, 1:57
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 100
using namespace std;

int main() {
    long int idx=0L,ln=0L;
    bool isP=true;
    char a[smx],b[smx],c[2*smx];
    while(scanf("%s %s",a,b)!=EOF){
        memset(c,'\0',sizeof(c));
        for(idx=0;idx<strlen(a);idx++) c[idx]=a[idx];
        for(long int i=0;i<strlen(b);i++) c[idx++]=b[i];
        isP=true;
        ln=strlen(c);
        for(long int i=0;i<ln/2;i++){
            if(c[i]!=c[ln-i-1]){
                isP=false;
                break;
            }
        }
        printf("%s\n",isP?"Yes":"No");
    }
    return 0;
}

