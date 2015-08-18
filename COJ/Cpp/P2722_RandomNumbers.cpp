/* 
 * File:   P2722_RandomNumbers.cpp
 * Author: JuanM
 *
 * Created on April 24, 2014, 12:12 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int y0,yi;
    
    scanf("%d",&y0);
    
    for(int i=0;i<10;i++){
        yi=(y0*13821)%32768;
        printf("%d : %d\n",yi,yi%7+1);
        y0=yi;
    }
    
    return 0;
}

