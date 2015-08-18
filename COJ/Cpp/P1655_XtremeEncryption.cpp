/* 
 * File:   P1655_XtremeEncryption.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 1:08 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char subseq[100003];
char seq[100003];

bool isIn(){
    bool isIn=false;
    int j=0;
    for(int i=0;i<strlen(seq);i++){
        if(seq[i]==subseq[j]){
            j++;
        }
    }
    if(j==strlen(subseq))isIn=true;
    return isIn;
}

int main() {
    while(scanf("%s %s",&subseq,&seq)!=EOF){
        if(isIn()){
            printf("Yes\n");
        }else{
            printf("No\n");
        }
    }
    return 0;
}

