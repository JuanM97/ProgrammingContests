/* 
 * File:   P1025_DemocracyInDanger.cpp
 * Author: JuanM
 *
 * Created on March 16, 2013, 1:08 AM
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
    int n,s;
    while(scanf("%d",&n)!=EOF){
        int a[105];
        for(int i=0;i<n;i++){
            scanf("%d",&a[i]);
        }
        std::sort(a,a+n);
        s=0;
        for(int i=0;i<(n+1)/2;i++){
            s+=(a[i]+1)/2;
        }
        printf("%d\n",s);
    }
    return 0;
}

