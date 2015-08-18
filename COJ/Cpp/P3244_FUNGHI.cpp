/* 
 * File:   P3244_FUNGHI.cpp
 * Author: JuanM
 *
 * Created on May 8, 2015, 1:46 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <cstring>
#define smx 13
using namespace std;
int p[smx];
int main() {
    int smax,s;
    while(scanf("%d %d %d %d %d %d %d %d",&p[0],&p[1],&p[2],&p[3],&p[4],&p[5],&p[6],&p[7])!=EOF){
        p[8]=p[0];p[9]=p[1];p[10]=p[2];
        smax=-1;
        for(int i=0;i<8;i++){
            s=p[i]+p[i+1]+p[i+2]+p[i+3];
            if(smax<s)smax=s;
        }
        printf("%d\n",smax);
    }
    return 0;
}

