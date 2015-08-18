/* 
 * File:   P1924_RegularHexagon.cpp
 * Author: JuanManuel
 *
 * Created on 20 de mayo de 2015, 21:24
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;
//Didn't work ):
int main() {
    int t;
    double R;
    scanf("%d",&t);
    while(t--){
        scanf("%lf",&R);
        printf("%.1lf",R*(sqrt(3)-1));
    }
    return 0;
}

