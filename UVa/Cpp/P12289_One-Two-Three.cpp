/* 
 * File:   P12289_One-Two-Three.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 12:23 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

int t;
char num[9];

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%s",&num);
        if(strlen(num)==5){
            printf("3\n");
        }else{
            if((num[0]=='o'&&num[1]=='n')||(num[0]=='o'&&num[2]=='e')||(num[1]=='n'&&num[2]=='e')){
                printf("1\n");
            }else{
                printf("2\n");
            }
        }
    }
    return 0;
}

