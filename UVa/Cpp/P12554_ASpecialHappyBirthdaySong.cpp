/* 
 * File:   P12554_ASpecialHappyBirthdaySong.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 4:59 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
using namespace std;

int n,idx,times;
char song[16][16]={"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
char names[103][103];

int main() {
    while(scanf("%d",&n)!=EOF){
        times=(int)ceil((double)n/16);
        //printf("T: %d\n",times);
        for(int i=0;i<n;i++){
            scanf("%s",&names[i]);
        }
        idx=0;
        while(times--){
            for(int i=0;i<16;i++,idx++){
                printf("%s: %s\n",names[idx%n],song[i]);
            }
        }
    }
    return 0;
}

