/* 
 * File:   P2066_Trisum.cpp
 * Author: JuanM
 *
 * Created on June 14, 2013, 11:42 AM
 */

#include <cstdlib>
#include <cstdio>
//#define maxs 524289
using namespace std;

//int m3[maxs];
//int m6[maxs];
int mod=10007;
int inv3=3336;
/*
void preCalc(){
    m3[0]=1;m6[0]=1;
    for(int i=1;i<maxs;i++){
        m3[i]=(m3[i-1]*(10004))%mod;
        m6[i]=(m6[i-1]*6)%mod;
    }
}
*/
int modExp(int a, int b, int m){
    int z=1;
    while(b>0){
        if(b&1){
            z=(z*a)%m;
        }
        a=(a*a)%m;
        b=b>>1;
    }
    return z;
}    
/*
void printM(int b){
    for(int i=0;i<b;i++){
        printf("%d ",m3[i]);
    }printf("\n");
    for(int i=0;i<maxs;i++){
        printf("%d ",m6[i]);
    }printf("\n");
}
*/
int main() {
    int n,a,b,c,ra,rb,rc,ma6,ma3,mna,mnb;
    //preCalc();
    //printM(5);
    while(scanf("%d %d %d %d",&n,&a,&b,&c)!=EOF){
        if(n==-1)break;
        ma6=modExp(6,n,mod);
        ma3=modExp(-3,n,mod);

        mna=(ma6*inv3+((ma3*inv3)<<1)%mod)%mod;
        mnb=(ma6*inv3-(ma3*inv3)%mod)%mod;
        ra=(mna*a+mnb*b+mnb*c)%mod;
        rb=(mnb*a+mna*b+mnb*c)%mod;
        rc=(mnb*a+mnb*b+mna*c)%mod;
        
        printf("%d %d %d\n",ra,rb,rc);
    }
    
    return 0;
}

