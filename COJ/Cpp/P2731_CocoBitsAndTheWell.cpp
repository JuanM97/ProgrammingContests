/* 
 * File:   P2731_CocoBitsAndTheWell.cpp
 * Author: JuanM
 *
 * Created on January 21, 2015, 3:13 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define PI 3.141592653589793238462643383279
using namespace std;


int main() {
    int n;
    double L;
    
    scanf("%d",&n);
    while(n--){
        scanf("%lf",&L);
        printf("%.2lf\n",L*L*(1-PI/4));
    }
    
    return 0;
}

