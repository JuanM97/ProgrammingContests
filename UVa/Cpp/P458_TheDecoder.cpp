/* 
 * File:   P458_TheDecoder.cpp
 * Author: JuanM
 *
 * Created on April 4, 2014, 10:53 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    char str[100003];
    
    while(scanf("%s",&str)!=EOF){
        for(int i=0;i<strlen(str);i++){
            str[i]=str[i]-'1'+'*';
        }
        printf("%s\n",str);
    }
    
    return 0;
}

