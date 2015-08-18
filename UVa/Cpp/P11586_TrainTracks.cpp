/* 
 * File:   P11586_TrainTracks.cpp
 * Author: JuanM
 *
 * Created on July 12, 2013, 1:29 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

int t,m,f;
char line[230];
int main(){
    scanf("%d\n",&t);
    while(t--){
        gets(line);
        m=0;f=0;
        for(int i=0;i<strlen(line);i++){
            m+=(line[i]=='M'?1:0);
            f+=(line[i]=='F'?1:0);
        }
        printf("%s\n",(f==m && f>1 && m>1)?"LOOP":"NO LOOP");
    }
    return 0;
}

