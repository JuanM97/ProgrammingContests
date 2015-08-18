/* 
 * File:   P2363_Veci.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 5:18 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    char a[9];
    while(scanf("%s",&a)!=EOF){
        if(next_permutation(a,a+strlen(a))){
            printf("%s\n",a);
        }else{
            printf("0\n");
        }
    }
    return 0;
}

