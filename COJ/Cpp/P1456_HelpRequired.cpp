/* 
 * File:   P1456_HelpRequired.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 1:36 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define maxN 1000010
using namespace std;

int n;
long int xn,n1;
long int nums[maxN];

void printt(int a){
    for(int i=0;i<a;i++){
        printf("%ld ",nums[i]);
    }printf("\n");
}

int main() {
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%ld",&nums[i]);
    }
    sort(nums,nums+n);
    //printt(5);
    for(long int i=0;i<n;i++){
        if(nums[i]==nums[i+1]){
            i++;
        }else{
            n1=nums[i];
            break;
        }
    }
    printf("%ld\n",n1);
    return 0;
}

