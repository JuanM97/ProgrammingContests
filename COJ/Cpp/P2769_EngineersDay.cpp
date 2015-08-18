/* 
 * File:   P2769_EngineersDay.cpp
 * Author: JuanM
 *
 * Created on September 23, 2014, 1:37 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int n;
    while(scanf("%d",&n)!=EOF){
        for(int i=1;i<=n;i++){
            printf("%d: I am participating in the Engineer's day.\n",i);
        }
    }
    return 0;
}

