/* 
 * File:   P1472_LuckySequenceAgain.cpp
 * Author: JuanM
 *
 * Created on November 28, 2014, 12:11 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int ps[]={2,3,5,7};
char num[15];

int main() {
    int t,lg,p,idx,rem,q,lg2;
    long long int n;
    scanf("%d",&t);
    while(t--){
        scanf("%lld",&n);
        memset(num,0,sizeof(num));
        lg=(int)(log(3*(n+1))/log(4.)-1);
        q=(n-1)%4;
        p=n-(int)((pow(4.,lg+1)-1)/3);
        lg2=lg;rem=p;
        for(idx=0;idx<lg2;idx++){
            q=rem/(int)(pow(4.,lg));
            rem=p%(int)(pow(4.,lg));
            num[idx]=(ps[q]+'0');
            q=rem;
            lg--;
        }
        num[idx]=(ps[q]+'0');
        printf("%s\n",num);
    }
    
    return 0;
}

