/* 
 * File:   P1898_Meeting.cpp
 * Author: JuanM
 *
 * Created on June 11, 2013, 12:48 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int t;
double a,b,d;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%lf %lf %lf",&a,&b,&d);
        printf("%0.4lf\n",d/(a+b));
    }
    return 0;
}

