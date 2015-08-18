/* 
 * File:   Prob33.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 11:28 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

int num,den;

int gcd(int a, int b){
    if(b==0) return a;
    else return gcd(b,a%b);
}

bool getCur(int a,int b){
    num=0;den=0;
    double c=(double)a/(double)b;
    int aa,bb,ra,rb;
    //Caso 1
    aa=a/10;
    ra=a%10;
    bb=b%10;
    rb=b/10;
    //printf("%d %d %d %d %.3lf\n",aa,bb,ra,rb,(double)aa/(double)bb);
    if(ra==rb&&((double)aa/(double)bb==c)){
        num=aa;
        den=bb;
        return true;
    }
    //Caso 2
    aa=a/10;
    ra=a%10;
    bb=b/10;
    rb=b%10;
    //printf("%d %d %d %d %.3lf\n",aa,bb,ra,rb,(double)aa/(double)bb);
    if(ra==rb&&(double)aa/(double)bb==c){
        num=aa;
        den=bb;
        return true;
    }
    //Caso 3
    aa=a%10;
    ra=a/10;
    bb=b%10;
    rb=b/10;
    //printf("%d %d %d %d %.3lf\n",aa,bb,ra,rb,(double)aa/(double)bb);
    if(ra==rb&&(double)aa/(double)bb==c){
        num=aa;
        den=bb;
        return true;
    }
    //Caso 4
    aa=a%10;
    ra=a/10;
    bb=b/10;
    rb=b%10;
    //printf("%d %d %d %d %.3lf\n",aa,bb,ra,rb,(double)aa/(double)bb);
    if(ra==rb&&(double)aa/(double)bb==c){
        num=aa;
        den=bb;
        return true;
    }
    return false;
}
int nn,dd;
int g=1;
int main() {
    nn=1;dd=1;
    //19,95 won't work, but 95,19 will -.-
    //printf("c:: %d\n\n\n",getCur(19,95));
    for(int i=11;i<100;i++){
        for(int j=i+1;j<100;j++){
            if((i%10==0||j%10==0)) continue;
            //Because of the aforementioned problem, had to wrote it (j,i) instead of (i,j) -> num is the answer, not den...
            else if(getCur(j,i)){
                printf("%d %d: %d %d: %d %d\n",i,j,nn,dd,num,den);
                nn*=num;
                dd*=den;
                g=gcd(nn,dd);
                nn/=g;
                dd/=g;
            }
        }
    }
    printf("n/d: %d %d\n",nn,dd);
    return 0;
}

