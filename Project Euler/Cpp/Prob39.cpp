/* 
 * File:   Prob39.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 11:25 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#include <utility>
#define smx 1000
using namespace std;

//Algebra with restrictions: a^2+b^2=c^2 , a+b+c=p -> b=(p^2-2pa)/(2(p-a)) must be an integer -> p=even
int r=0,rs=0,n=0;
int main() {
 
    for(int p=2;p<=smx;p+=2) {
        n=0;
        for(int a=2;a<p/2;a++) {
              if((p*(p-2*a))%(2*(p-a))==0)n++;
          }
          if(n>rs){
            rs=n;
            r=p;
        }
    }
    printf("n: %d, #pythagorean terns:%d\n",r,rs);
    return 0;
}

