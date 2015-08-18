/* 
 * File:   P1369_InscribedTriangle.cpp
 * Author: JuanM
 *
 * Created on June 9, 2013, 10:00 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>

int main(){
  double l,a,b;
  int n,k;
  while(1){
    scanf("%lf %d %d",&l,&n,&k);
    if(l==0&&n==0&&k==0)break;
    b=(double)k*l/n;
    a=n-b;
    printf("%.0lf\n",round(sqrt(3.0)*(a*a+b*b-a*b)/4.0));
  }
  return 0;
}

