/* 
 * File:   P2564_PandigitalNumbers.cpp
 * Author: JuanM
 *
 * Created on February 15, 2015, 7:00 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int t;
    unsigned long long n,z;
    bool j1=false;
    scanf("%d",&t);
    while(t--){
        scanf("%llu",&n);
        z=n;
        j1=false;
        while(z){
            if(!(z&1)){
                j1=true;
                break;
            }
            z>>=1;
        }
        printf("%s\n",(j1&&n>1)?"YES":"NO");
    }
    return 0;
}

