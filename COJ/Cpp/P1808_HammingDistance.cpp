/* 
 * File:   P1808_HammingDistance.cpp
 * Author: JuanM
 *
 * Created on May 3, 2013, 1:18 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main() {
    char n1[105];
    char n2[105];
    int hd;
    while(1){
        scanf("%s",&n1);
        if(n1[0]=='X')break;
        scanf("%s",&n2);
        hd=0;
        for(int i=0;n1[i]!='\0';i++){
            if((n1[i])^(n2[i]))hd++;
        }
        printf("Hamming distance is %d.\n",hd);
    }
    return 0;
}

