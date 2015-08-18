/* 
 * File:   P3093_RemainderOfWord.cpp
 * Author: JuanManuel
 *
 * Created on 3 de febrero de 2015, 2:16
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smx 100100
using namespace std;

char wd[smx];
int ret;
int main() {
    
    while(scanf("%s",wd)!=EOF){
        ret=1;
        for(int i=0;i<strlen(wd);i++){
            ret=(ret*((int)(wd[i]-'A'+1)))%26;
            if(i&0b11)ret=ret%26;
        }
        printf("%02d\n",ret);
    }
    
    return 0;
}

