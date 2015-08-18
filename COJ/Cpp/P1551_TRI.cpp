/* 
 * File:   P1551_TRI.cpp
 * Author: JuanM
 *
 * Created on May 12, 2013, 9:41 PM
 */

#include <cstdlib>
#include <cstdio>
#include <math.h>
using namespace std;

int main() {
    int i=1;
    double a,b,c;
    while(scanf("%lf %lf %lf",&a,&b,&c)!=EOF){
        if(a+b==c){
            printf("Case %d: %.0lf+%.0lf=%.0lf\n",i++,a,b,c);
        }else{
            if(a==b+c){
                printf("Case %d: %.0lf=%.0lf+%.0lf\n",i++,a,b,c);
            }else{
                if(a-b==c){
                    printf("Case %d: %.0lf-%.0lf=%.0lf\n",i++,a,b,c);
                }else{
                    if(a==b-c){
                        printf("Case %d: %.0lf=%.0lf-%.0lf\n",i++,a,b,c);
                    }else{
                        if(a*b==c){
                            printf("Case %d: %.0lf*%.0lf=%.0lf\n",i++,a,b,c);
                        }else{
                            if(a==b*c){
                                printf("Case %d: %.0lf=%.0lf*%.0lf\n",i++,a,b,c);
                            }else{
                                if(a/b==c){
                                    printf("Case %d: %.0lf/%.0lf=%.0lf\n",i++,a,b,c);
                                }else{
                                    printf("Case %d: %.0lf=%.0lf/%.0lf\n",i++,a,b,c);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}

