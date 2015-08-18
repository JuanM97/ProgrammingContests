/* 
 * File:   P2623_SuperEncryption.cpp
 * Author: JuanM
 *
 * Created on April 24, 2014, 12:23 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    char word[103];
    char rword[103];
    int mm,idx;
    bool hM;
    while(scanf("%s",&word)!=EOF){
        memset(rword,0,sizeof(rword));
        hM=strlen(word)%2;
        mm=strlen(word)/2-1;
        idx=0;
        for(;mm-idx>=0;idx++){
            rword[idx]=word[mm-idx];
        }
        if(hM) rword[idx++]=word[mm+1];
        for(int i=0;i<=mm;idx++,i++){
            rword[idx]=word[strlen(word)-i-1];
        }
        printf("%s\n",rword);
    }
    
    return 0;
}

