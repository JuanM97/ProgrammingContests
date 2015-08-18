/* 
 * File:   P1091_Humidex.cpp
 * Author: JuanM
 *
 * Created on January 19, 2015, 11:31 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

char a1[5],a2[5];
double b1,b2,rr;

int main() {
    while(scanf("%s",a1)!=EOF&&strcmp(a1,"E")!=0){
        scanf("%lf %s %lf",&b1,a2,&b2);
        if((strcmp(a1,"T")==0&&strcmp(a2,"D")==0)){
            rr=b1+3.394105*exp(19.833625-((5417.753)/(b2+273.16)))-5.555;
            printf("T %.1lf D %.1lf H %.1lf\n",b1,b2,rr);
        }else{
            if(strcmp(a1,"D")==0&&strcmp(a2,"T")==0){
                rr=b2+3.394105*exp(19.833625-((5417.753)/(b1+273.16)))-5.555;
                printf("T %.1lf D %.1lf H %.1lf\n",b2,b1,rr);
            }else{
                if(strcmp(a1,"H")==0&&strcmp(a2,"D")==0){
                    rr=b1-3.394105*exp(19.833625-((5417.753)/(b2+273.16)))+5.555;
                    printf("T %.1lf D %.1lf H %.1lf\n",rr,b2,b1);
                }else{
                    if(strcmp(a1,"D")==0&&strcmp(a2,"H")==0){
                        rr=b2-3.394105*exp(19.833625-((5417.753)/(b1+273.16)))+5.555;
                        printf("T %.1lf D %.1lf H %.1lf\n",rr,b1,b2);
                    }else{
                        if(strcmp(a1,"T")==0&&strcmp(a2,"H")==0){
                            rr=((5417.753)/(19.833625-log((b2-b1+5.555)/(3.394105))))-273.16;
                            printf("T %.1lf D %.1lf H %.1lf\n",b1,rr,b2);
                        }else{
                            rr=((5417.753)/(19.833625-log((b1-b2+5.555)/(3.394105))))-273.16;
                            printf("T %.1lf D %.1lf H %.1lf\n",b2,rr,b1);
                        }
                    }
                }
            }
        }
    }
    
    return 0;
}

