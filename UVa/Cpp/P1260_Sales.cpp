/* 
 * File:   P1260_Sales.cpp
 * Author: JuanManuel
 *
 * Created on 27 de mayo de 2015, 18:47
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#define smx 1300
using namespace std;

int main(){
	int t,n,nums[smx],ct;
        scanf("%d",&t);
        while(t--){
            scanf("%d",&n);
            for(int i=0;i<n;i++){
                scanf("%d",&nums[i]);
            }
            ct=0;
            for(int i=1;i<n;i++){
                for(int j=0;j<i;j++){
                    if (nums[i]>=nums[j])ct++;
                }
            }
            printf("%d\n",ct);
        }
	return 0;
}


