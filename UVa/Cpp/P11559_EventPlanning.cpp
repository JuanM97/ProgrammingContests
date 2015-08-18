/* 
 * File:   P11599_EventPlanning.cpp
 * Author: JuanM
 *
 * Created on January 21, 2013, 8:56 PM
 */

#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
    char line[1000];
    int n,b,h,w, pH, confW, wt;
    int minP;
    bool cool=false;
    sscanf(gets(line), "%d %d %d %d", &n, &b, &h, &w);
    
    while(h--){
        sscanf(gets(line), "%d", &pH);
        wt=w;
        while(wt--){
            sscanf("%d", &confW);
            if(confW>=w){
                cool=true;
            }
            if(cool){
                if(minP>n*pH)
                        minP=n*pH;
            }
        }
        
    }
    
    return 0;
}

