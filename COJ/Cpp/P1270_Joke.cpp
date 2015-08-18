/* 
 * File:   P1270_Joke.cpp
 * Author: JuanM
 *
 * Created on August 18, 2013, 1:51 AM
 */
// ):
#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

double x,y;
int main() {
    while(scanf("%lf %lf",&x,&y)!=EOF){
        printf("%d\n",(int)(x/y));
    }
    return 0;
}

