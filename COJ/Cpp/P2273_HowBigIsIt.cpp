/* 
 * File:   P2273_HowBigIsIt.cpp
 * Author: JuanManuel
 *
 * Created on 2 de abril de 2014, 13:51
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cfloat>
#include <algorithm>
#include <cstring>
using namespace std;


int main() {
    
    int t,n;
    double rads[10];
    char ord[10];
    double sumR,b,minSum;
    
    scanf("%d",&t);
    while(t--){
        sumR=0;b=0;minSum=0;
        memset(ord,0,10);
        memset(rads,0,10);
        scanf("%d",&n);
        for(int i=0;i<n;i++){
            scanf("%lf",&rads[i]);
        }
        
        for(int i=0;i<n;i++){
            ord[i]=(char)('0'+i);
            //printf("%c ",ord[i]);
        }
        sort(ord,ord+n);
        minSum=DBL_MAX;
        
        do{
            sumR+=rads[(int)(ord[0]-'0')];
            for(int i=0;i<n-1;i++){
                b=sqrt(4.*rads[(int)(ord[i]-'0')]*rads[(int)(ord[i+1]-'0')]);
                sumR+=b;
            }
            sumR+=rads[(int)(ord[n-1]-'0')];
            //printf("rr: %.3lf\n",sumR);
            if(sumR<minSum){
                minSum=sumR;
            }
            /*
            for(int i=0;i<n;i++){
                printf("%lf ",rads[(int)(ord[i]-'0')]);
            }printf("\n");
            */
        }while(next_permutation(ord,ord+n));
        printf("%.3lf\n",minSum);
    }

    return 0;
}

