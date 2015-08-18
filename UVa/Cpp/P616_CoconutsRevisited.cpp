/* 
 * File:   P616_CoconutsRevisited.cpp
 * Author: JuanM
 *
 * Created on June 3, 2014, 2:01 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

//Simulation problem. I think the upper bound is in the log_p scale, but got WA. Changed it to
//sqrt and AC.

int coc,n,p,sq,i;
bool found;
int main() {
    while(scanf("%d",&coc)&&coc>0){
        sq=(int)sqrt(coc)+1;
        found=false;
        for(p=sq;p>1&&!found;p--){
            n=coc;
            //p shares and checking the 1 for the monkey :P
            for(i=0;i<p&&n%p==1;i++){
                n-=(n/p+1);
            }
            //If i=p and final number of coconuts == 0 mod p then it is a solution
            if(i==p&&n%p==0){
                found=true;
                break;
            }
        }
        
        if(found){
            printf("%d coconuts, %d people and 1 monkey\n",coc,p);
        }else{
            printf("%d coconuts, no solution\n",coc);
        }
        
    }
    return 0;
}

