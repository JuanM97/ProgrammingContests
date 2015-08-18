/* 
 * File:   P3128_ANDOfTwo.cpp
 * Author: JuanManuel
 *
 * Created on 6 de mayo de 2015, 16:00
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 100010
using namespace std;
int nums[smx];
//):
int main() {
    int t,n,max,nd;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%d",&nums[i]);
            //printf("%d ",nums[i]);
        }
        max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //printf("%d ",max);
                nd=nums[i]&nums[j];
                max = max ^ ((max ^ nd) & -(max < nd));
            }
        }
        printf("%d\n",max);
    }
    return 0;
}

