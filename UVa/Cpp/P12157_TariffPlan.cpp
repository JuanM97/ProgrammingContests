/* 
 * File:   P12157_TariffPlan.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 4:26 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
using namespace std;

int t,n,caseN=1;
int juice,mile;
double dur;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        mile=0;juice=0;
        while(n--){
            scanf("%lf",&dur);
            juice+=(int)((ceil((dur+1)/60))*15);
            mile+=(int)((ceil((dur+1)/30))*10);
        }
        if(juice<mile){
            printf("Case %d: Juice %d\n",caseN++,juice);
        }else{
            if(juice>mile){
                printf("Case %d: Mile %d\n",caseN++,mile);
            }else{
                printf("Case %d: Mile Juice %d\n",caseN++,juice);
            }
        }
    }
    return 0;
}

