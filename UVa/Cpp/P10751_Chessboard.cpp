/* 
 * File:   P10751_Chessboard.cpp
 * Author: JuanM
 *
 * Created on June 3, 2014, 7:20 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

//Formula. Larger path <-> most diagonals (sqrt(2)).
int t,n;

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        if(n==1)printf("0.000\n");
        else printf("%.3lf\n",4*(n-1)+sqrt(2)*(n-2)*(n-2));
    }
    return 0;
}

