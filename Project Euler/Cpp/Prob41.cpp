/* 
 * File:   Prob41.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 11:52 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 10000010
using namespace std;
//Using divisibility -> primes must be 4 or 7 digits long.
//another form is getting 7...1 and permute until one is prime and pandigit, then break.
vector<int> p;
bool pb[smx]={false};
int digs[10];

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


bool isPand(int a){
    int aa=a,r=0,ll=0;
    memset(digs,0,sizeof(digs));
    while(aa>=1){
        r=aa%10;
        ll++;
        digs[r]++;
        if(digs[r]>1)return false;
        aa/=10;
    }
    /*for(int i=1;i<10;i++){
        printf("%d ",digs[i]);
    }printf("\n");*/
    if(digs[0]>0)return false;
    for(int i=1;i<=ll;i++){
        if(digs[i]!=1)return false;
    }
    return true;
}

int nmp=0;
int main() {
    sieve();
    for(int i=1000;i<=9999;i++){
        if(!pb[i]&&isPand(i)){
            //printf("%d \n",i);
            if(i>nmp)nmp=i;
        }
    }
    
    for(int i=1000000;i<=9999999;i++){
        if(!pb[i]&&isPand(i)){
            //printf("%d \n",i);
            if(i>nmp)nmp=i;
        }
    }
    printf("n: %d\n",nmp);
    return 0;
}

