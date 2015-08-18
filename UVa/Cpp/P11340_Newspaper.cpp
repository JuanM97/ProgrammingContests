/* 
 * File:   P11340_Newspaper.cpp
 * Author: JuanM
 *
 * Created on July 16, 2013, 11:36 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>
using namespace std;

int t,n,l,pr;
int p[400];
char cc,line[10100];
double prt;

int main() {
    scanf("%d\n",&t);
    while(t--){
        scanf("%d\n",&n);
        memset(p,0,sizeof p);
        while(n--){
            scanf("%c %d\n",&cc,&pr);
            p[(int)cc]=pr;
        }
        scanf("%d\n",&l);
        prt=0;
        while(l--){
            gets(line);
            for(int i=0;i<strlen(line);i++){
                prt+=p[(int)line[i]];
            }
        }
        printf("%.2lf$\n",prt/100);
    }
    return 0;
}

