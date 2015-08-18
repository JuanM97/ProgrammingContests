/* 
 * File:   P10706_NumberSequence.cpp
 * Author: JuanM
 *
 * Created on March 16, 2013, 2:05 AM
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
    long long int t,d,g,n;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        scanf("%d",&n);
        d=(int)floor((-1+sqrt(1+8*(double)n))/2);
        g=(d*(d+1))/2;
        if(n-g==0){
            printf("ans: %d\n",d);
        }else{
            printf("ans: %d\n",n-g);
        }
    }
    return 0;
}

