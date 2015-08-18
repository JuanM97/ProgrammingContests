/* 
 * File:   P2150_BalancedWords.cpp
 * Author: JuanManuel
 *
 * Created on 12 de noviembre de 2014, 12:00
 */

// ):
#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 103
using namespace std;


int main() {
    
    int t,m1,m2,M1,M2;
    scanf("%d",&t);
    char w[smx];
    while(t--){
        scanf("%s",w);
        m1=0,m2=0,M1=0,M2=0;
        for(int i=0;i<strlen(w)>>1;i++){
            if(w[i]>='a'&&w[i]<='z')m1++;
            if(w[i]>='A'&&w[i]<='Z')M1++;
            if(w[i+(strlen(w)>>1)]>='a'&&w[i+(strlen(w)>>1)]<='z')m2++;
            if(w[i+(strlen(w)>>1)]>='A'&&w[i+(strlen(w)>>1)]<='Z')M2++;
        }
        for(int i=strlen(w);i<strlen(w);i++){
            if(w[i]>='a'&&w[i]<='z')m2++;
            if(w[i]>='A'&&w[i]<='Z')M2++;
        }
        //printf("%d %d %d %d",m1,M1,m2,M2);
        printf("%s\n",(m1==M1&&m2==M2)?"SI":"NO");
    }
    
    return 0;
}

