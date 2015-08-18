/* 
 * File:   P1242_DigitsCount.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 2:33 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

void printt(long int* num){
    for(int i=0;i<10;i++){
        printf("%d ",num[i]);
    }printf("\n");
}

void countD(long long n, long int* num) {
    long long fac=1,low,now,high;
    while(n/fac){
        low=n-(n/fac)*fac;
        now=(n/fac)%10;
        high=n/(fac*10);
        for(int i=0;i<10;i++) {
            if(now<i) num[i]+=high*fac;
            else if(now==i) num[i]+=high*fac+low+1;
            else if(now>i) num[i]+=(high+1)*fac;
        }
        fac*=10;
  }
  while((fac/=10))
        num[0]-=fac;
}

int main() {
    int a,b;
    long int nums1[11],nums2[11];
    while(scanf("%d %d",&a,&b)){
        if(a==0&&b==0)break;
        memset(nums1,0,sizeof(nums1));
        memset(nums2,0,sizeof(nums2));
        countD(a-1,nums1);
        countD(b,nums2);
        for(int i=0;i<10;i++){
            printf("%ld%c",nums2[i]-nums1[i],i==9?'\n':' ');
        }
    }
    return 0;
}

