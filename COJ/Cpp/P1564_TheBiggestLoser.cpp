/* 
 * File:   P1564_TheBiggestLoser.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 4:02 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <math.h>
using namespace std;
int t;
double pm,pf,iw,fw;
char nm[12],temp[12];
char nf[12];
char g;
int main() {
    while(scanf("%d",&t)&&t!=0){
        pm=0.;pf=0.;
        while(t--){
            scanf("%s %c %lf %lf",&temp,&g,&iw,&fw);
            //printf("\nP: %s %c %lf %lf\n",temp,g,iw,fw);
            if(g=='M'){
                if((iw-fw)*100/iw>pm){
                    pm=(iw-fw)*100/iw;
                    strcpy(nm,temp);
                }
            }else{
                if((iw-fw)*100/iw>pf){
                    pf=(iw-fw)*100/iw;
                    strcpy(nf,temp);
                }
            }
        }
        printf("%s %.2lf%% %s %.2lf%%\n",nm,pm,nf,pf);
    }
    return 0;
}

