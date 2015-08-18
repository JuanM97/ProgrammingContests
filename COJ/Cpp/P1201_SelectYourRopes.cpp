/* 
 * File:   P1201_SelectYourRopes.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 10:55 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;

int r[1003];

int main() {
    int t,n;
    long int max,s,c;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%d",&r[i]);
        }
        sort(r,r+n);
        max=r[n-1];
        s=max;
        for(int i=n-2;i>=0;i--){
            s=(n-i)*r[i];
            if(s>=max){
                max=s;
            }
        }
        printf("%d\n",max);
    }
    return 0;
}

