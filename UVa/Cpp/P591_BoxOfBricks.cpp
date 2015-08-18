/* 
 * File:   P591_BoxOfBricks.cpp
 * Author: JuanM
 *
 * Created on July 17, 2013, 2:19 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int n,mn,d,setN=1;
int bs[70];
int main() {
    while(scanf("%d",&n)&&n!=0){
        mn=0;
        for(int i=0;i<n;i++){
            scanf("%d",&bs[i]);
            mn+=bs[i];
        }
        mn/=n;
        d=0;
        for(int i=0;i<n;i++){
            if(bs[i]>mn)d+=(bs[i]-mn);
        }
        printf("Set #%d\nThe minimum number of moves is %d.\n\n",setN++,d);
    }
    return 0;
}

