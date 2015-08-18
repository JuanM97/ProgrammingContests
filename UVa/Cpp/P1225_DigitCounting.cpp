/* 
 * File:   P1225_DigitCounting.cpp
 * Author: JuanM
 *
 * Created on March 30, 2014, 2:50 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int n,a,dig,nn;
    long int nums[11];
    scanf("%d",&n);
    while(n--){
        scanf("%d",&a);
        memset(nums,0,sizeof(nums));
        for(int i=0;i<=a;i++){
            nn=i;
            while(nn>0){
                dig=nn%10;
                nums[dig]++;
                nn/=10;
            }
        }
        printf("%ld",nums[0]);
        for(int i=1;i<10;i++){
            printf(" %ld",nums[i]);
        }printf("\n");
    }
    return 0;
}

