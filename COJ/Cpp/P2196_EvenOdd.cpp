/* 
 * File:   P2196_EvenOdd.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 4:30 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
    int t;
    char num[63];
    scanf("%d",&t);
    while(t--){
        scanf("%s",&num);
        if(num[strlen(num)-1]=='1'||num[strlen(num)-1]=='3'||num[strlen(num)-1]=='5'||num[strlen(num)-1]=='7'||num[strlen(num)-1]=='9'){
            printf("odd\n");
        }else{
            printf("even\n");
        }
    }
    return 0;
}

