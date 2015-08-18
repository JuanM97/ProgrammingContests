/* 
 * File:   P11608_NoProblem.cpp
 * Author: JuanM
 *
 * Created on July 18, 2013, 2:22 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
using namespace std;

int pi,av[16],req[16],caseN=1;
int main() {
    while(scanf("%d",&pi)&&pi>=0){
        av[0]=pi;
        for(int i=1;i<13;i++)scanf("%d",&av[i]);
        for(int i=0;i<12;i++)scanf("%d",&req[i]);
        printf("Case %d:\n",caseN++);
        for(int i=0;i<12;i++){
            if(pi>=req[i]){
                pi-=req[i];
                printf("No problem! :D\n");
            }else{
                printf("No problem. :(\n");
            }
            pi+=av[i+1];
        }
    }
    return 0;
}

