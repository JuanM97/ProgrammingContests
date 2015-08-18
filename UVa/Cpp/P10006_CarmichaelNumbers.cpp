/* 
 * File:   CarmichaelNumbers.cpp
 * Author: JuanM
 *
 * Created on May 27, 2013, 12:17 AM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
using namespace std;

long int cN[]={561,1105,1729,2465,2821,6601,8911,10585,15841,29341,41041,46657,52633,62745,63973};

bool isIn(long int num){
    int len=sizeof(cN)/sizeof(cN[0]);
    int l=0,u=len,mid;
    for(int i=0;i<len;i++){
        mid=(u+l)/2;
        if(cN[mid]==num){
            return true;
        }else{
            if(cN[mid]<num){
                l=mid;
            }else{
                u=mid;
            }
        }
    }
    return false;
}

int main() {
    long int num;
    while(scanf("%ld",&num)&&num!=0){
        if(isIn(num))
            printf("The number %ld is a Carmichael number.\n",num);
        else
            printf("%ld is normal.\n",num);
    }
    return 0;
}

