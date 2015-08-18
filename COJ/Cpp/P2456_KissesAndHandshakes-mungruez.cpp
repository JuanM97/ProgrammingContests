/* 
 * File:   P2456_KissesAndHandshakes-mungruez.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 12:12 AM
 */

#include <cstdio>
#include <cmath>

int main(){
    int v,x,o,xt,ot,m,h;
    scanf("%d",&v);
    for(int i=0;i<v;i++){
        scanf("%d %d",&x,&o);
        m=0,h=0;
        ot=(int)sqrt(1+8*o);
        m=(1+ot)/2;
        xt=(int)sqrt((2*m-1)*(2*m-1)+8*x);
        h=(1-2*m+xt)/2;

        if(h!=1 && o!=0)
            printf("There are %d women and %d men at the party.\n",h,m);
        if(h==1 && o!=0)
            printf("There are %d woman and %d men at the party.\n",h,m);
        if (o==0)
            printf("Uhh... I do not know.\n");
        }
return 0;
}

