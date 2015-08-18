/* 
 * File:   Prob12.cpp
 * Author: JuanM
 *
 * Created on June 5, 2014, 12:55 AM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 10000
using namespace std;

//Let n=Prod(p_i^alpha_i)
//Number of Divisors = Prod(alpha_i+1)

vector<int> p;
vector<int> a;
bool pb[smx];

void sieve(){
    p.push_back(2);
    pb[0]=true;
    pb[1]=true;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=true;
    }
    for(int i=3;i<smx;i++){
        if(!pb[i]){
            p.push_back(i);
            for(int j=2;i*j<smx;j++){
                pb[i*j]=true;
            }
        }
    }
}

void printp(int a){
    for(int i=0;i<a;i++){
        printf("%d ",p[i]);
    }printf("\n");
}

int numberOfDivisors(int number) {
    int nod = 0;
    int sq = (int)sqrt(number);
 
    for(int i = 1; i<= sq; i++){
        if(number % i == 0){
            nod += 2;
        }
    }
    //Correction if the number is a perfect square
    if (sq * sq == number) {
        nod--;
    }
 
    return nod;
}

int main() {
    sieve();
    printf("hola\n");
    int contD=0,mContD=-1,cd;
    int num,aux;
    int i=1,m=1;
    for(i=1;mContD<500&&i<1000000000;i+=m){
        m++;
        if(i<smx&&!pb[i])continue;
        contD=1;
        aux=i;
        for(int j=0;p[j]*p[j]<=i;j++){
            if(aux%p[j]==0){
                cd=0;
                while(aux%p[j]==0){
                    aux/=p[j];
                    cd++;
                }
                contD*=(cd+1);
                if(aux==1)break;
            }
        }
        if(aux!=1)contD*=2;
        printf("%d %d\n",i,contD);
        if(contD>mContD){
            mContD=contD;
            num=i;
        }
    }
    /*
    int ix=1;num=0;
    for(int i=5;numberOfDivisors(num)<=500;i++){
        num+=ix;
        ix++;
    }
    */
    printf("%d\n",num);
    return 0;
}


