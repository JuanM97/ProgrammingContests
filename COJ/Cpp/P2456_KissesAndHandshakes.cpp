/* 
 * File:   P2456_KissesAndHandshakes.cpp
 * Author: JuanM
 *
 * Created on June 5, 2013, 10:36 PM
 */

#include <cstdlib>
#include <cstdio>
#define maxS 1000003
using namespace std;

long int d[maxS];

long int kIn2(){
    d[0]=0;d[1]=0;
    for(int i=1;i<maxS-1;i++){
        d[i+1]=i+d[i];
    }
}

void printK(int b){
    for(int i=0;i<b;i++){
        printf("%ld ",d[i]);
    }printf("\n");
}

int main() {
    kIn2();
    //printK(10);
    int t,k,h,m,w;
    bool fm;
    scanf("%d",&t);
    while(t--){
        m=-1;w=-1;
        fm=false;
        scanf("%d %d",&k,&h);
        
        bool fd1=false,err=false;
        for(int i=0;i<maxS;i++){
            if(d[i]==h){
                if(fd1){
                    err=true;
                    break;
                }
                m=i;
                fm=true;
                fd1=true;
            }
        }
        
        if(fm){
            for(int i=0;i<maxS;i++){
                if(k==d[i]+i*m){
                    w=i;
                    break;
                }
            }
        }
        printf("R: %d %d\n",w,m);
        if(h==0&&k==0){
            printf("There are 0 women and 0 men at the party.\n");
        }else{
            if((m!=-1&&w!=-1)&&!err){
                if(m==1){
                    printf("There are %d women and %d men at the party.\n",w,m);
                }else{
                    if(w==1){
                        printf("There are %d woman and %d men at the party.\n",w,m);
                    }else{
                        printf("There are %d women and %d men at the party.\n",w,m);
                    }
                }
            }else{
                printf("Uhh... I do not know.\n");
            }
        }
    }
    return 0;
}

