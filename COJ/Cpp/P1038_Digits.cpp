/* 
 * File:   P1038_Digits.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 10:53 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <math.h>
using namespace std;

int main() {
    char digits[1000010];
    int c,len;
    while(1){
        scanf("%s",&digits);
        if(strcmp(digits,"END")==0)break;
        if(strcmp(digits,"1")==0){
            printf("%d\n",1);
        }else{
            len=strlen(digits);
            if(len==1){
                c=2;
            }else{
                if(len<=9){
                    c=3;
                }else{
                    c=4;
                }
            }
            printf("%d\n",c);
        }
    }
    return 0;
}

