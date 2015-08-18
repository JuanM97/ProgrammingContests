/* 
 * File:   P2916_FreeNumbers.cpp
 * Author: JuanM
 *
 * Created on November 27, 2014, 10:26 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 50000
using namespace std;

vector<int> p,mnp;
bool pb[smx];

void sieve(){
    p.push_back(2);
    pb[0]=true;
    pb[1]=true;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=true;
    }
    for(int i=3;i<smx;i+=2){
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

void getPrimes(int mn){
    for(int i=0;i<p.size()&&p[i]<=mn;i++){
        if(mn%p[i]==0){
            mnp.push_back(p[i]);
            while(mn%p[i]==0){
                mn/=p[i];
            }
        }
    }
    if(mn>1){
        mnp.push_back(mn);
    }
}

int main(){
    sieve();
    //printp(30);
    int a,b,mn,mx;
    bool sqnf=false;
    while(scanf("%d %d",&a,&b)!=EOF){
        mn=min(a,b);
        sqnf=false;
        mnp.clear();
        getPrimes(mn);
        mx=max(a,b);
        for(int i=0;i<mnp.size();i++){
            if(mx%mnp[i]==0){
                sqnf=true;
                break;
            }
        }
        printf("%s\n",sqnf?"NO":"YES");
    }
    
    return 0;
}


/*
//TLE -.-
int main(){
    
    int a,b;
    bool sqf;
    while(scanf("%d %d",&a,&b)!=EOF){
        sqf=true;
        if(a%2==0&&b%2==0){
            sqf=false;
        }else{
            for(int i=3;sqf&&i<=a&&i<=b;i+=2){
                if(a%i==0&&b%i==0){
                    sqf=false;
                    break;
                }
            }
        }
        printf("%s\n",sqf?"YES":"NO");
    }
    
    return 0;
}
*/

/*
//TLE ):
int main() {
    sieve();
    //printp(10);
    int a,b,mn;
    bool sqnf=false;
    while(scanf("%d %d",&a,&b)!=EOF){
        sqnf=false;
        mn=min(a,b);
        if(mn<=p[p.size()-1]){
            for(int i=0;!sqnf&&p[i]<=a&&p[i]<=b&&i<p.size();i++){
                if(a%p[i]==0&&b%p[i]==0){
                    sqnf=true;
                    break;
                }
            }
        }else{
            for(int i=p[p.size()-1];!sqnf&&i<mn;i+=2){
                if(a%i==0&&b%i==0){
                    sqnf=true;
                    break;
                }
            }
        }
        printf("%s\n",sqnf?"NO":"YES");
    }
    
    return 0;
}
*/
