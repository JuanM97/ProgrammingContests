/* 
 * File:   P1055_Stringsobits.cpp
 * Author: JuanM
 *
 * Created on April 26, 2015, 3:46 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int ga1,gb1,ga2,gb2,ea1,eb1,ea2,eb2,r1,r2,ct;
    while(scanf("%d %d %d %d %d %d %d %d",&ga1,&gb1,&ga2,&gb2,&ea1,&eb1,&ea2,&eb2)!=EOF){
        ct=0;
        r1=ga1+ga2;
        r2=ea1+ea2;
        ct+=(r1-r2);
        r1=gb1+gb2;
        r2=eb1+eb2;
        ct+=(r1-r2);
        printf("%s\n",ct>0?"Gunnar":ct<0?"Emma":"Tie");
    }
    return 0;
}

