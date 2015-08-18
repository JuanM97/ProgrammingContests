/* 
 * File:   P1679_FIFAWorldPlayer.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 11:26 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <climits>
using namespace std;

char name[105];
long int t;
double pa,pj,g,a,ta,tr;
double tmp,Mp;
char M[105];
int main() {
    scanf("%d",&t);
    Mp=INT_MIN-0.0;
    while(t--){
        scanf("%s %lf %lf %lf %lf %lf %lf",&name,&pa,&pj,&g,&a,&ta,&tr);
        tmp=log10(pa)+pj+2.0*g+a-ta-2.0*tr;
        if(tmp>Mp){
            Mp=tmp;
            strcpy(M,name);
        }
    }
    printf("%s\n",M);
    return 0;
}

