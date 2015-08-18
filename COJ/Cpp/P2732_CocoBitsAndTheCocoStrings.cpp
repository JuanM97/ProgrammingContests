/* 
 * File:   P2732_CocoBitsAndTheCocoStrings.cpp
 * Author: JuanM
 *
 * Created on January 19, 2015, 10:52 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#include <ctype.h>
using namespace std;

char ss[1000000];

int main() {
    int n;
    scanf("%d",&n);
    while(n--){
        scanf("%s",ss);
        for(int i=0;i<strlen(ss);i++){
            if(islower(ss[i]))ss[i]=toupper(ss[i]);
            else ss[i]=tolower(ss[i]);
        }
        printf("%s\n",ss);
    }
    
    return 0;
}

