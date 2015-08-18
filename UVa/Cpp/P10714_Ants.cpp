/* 
 * File:   P10714_Ants.cpp
 * Author: JuanM
 *
 * Created on March 16, 2013, 3:02 AM
 */

#include <cstdlib>
#include <iostream> 
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <string>
#include <cctype>
#include <stack>
#include <queue>
#include <list>
#include <vector>
#include <map>
#include <sstream>
#include <utility>
#include <set>
#include <math.h>
#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
    int t,n,ants,ct,min,max,Ma,ma;
    double nm;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&n,&ants);
        min=n;
        max=0;
        nm=n/2;
        for(int i=0;i<ants;i++){
            scanf("%d",&ct);
            Ma=ct>n-ct?ct:n-ct;
            if(Ma>max){
                max=Ma;
            }
            if(Ma<min){
                min=Ma;
            }
        }
        printf("%d %d\n",n-min,max);
    }
    return 0;
}

