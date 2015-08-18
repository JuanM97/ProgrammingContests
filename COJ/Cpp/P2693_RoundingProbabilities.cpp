/* 
 * File:   P2693_RoundingProbabilities.cpp
 * Author: JuanManuel
 *
 * Created on 3 de febrero de 2015, 16:58
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <iostream>
#include <iomanip>
#include <algorithm>
using namespace std;

int main() {
    double n;
    int t;
    while(scanf("%lf %d",&n,&t)!=EOF){
        cout<<fixed<<setprecision(t)<<n<<endl;
    }
    return 0;
}

