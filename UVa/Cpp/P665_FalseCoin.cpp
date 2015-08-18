/* 
 * File:   P665_FalseCoin.cpp
 * Author: JuanM
 *
 * Created on July 17, 2013, 4:21 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

int t,m,n,n2,fls;
int mns[150],l[100],r[100];
char s[5];
bool f,inc;
int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&m,&n);
        for(int i=0;i<=m;i++)mns[i]=2;
        while(n--){
            scanf("%d",&n2);
            memset(l,0,sizeof l);
            memset(r,0,sizeof r);
            for(int i=0;i<n2;i++) scanf("%d",&l[i]);
            for(int i=0;i<n2;i++) scanf("%d",&r[i]);
            scanf("%s",&s);
            if(s[0]=='='){
                for(int i=0;i<n2;i++){
                    mns[l[i]]=0;
                    mns[r[i]]=0;
                }
            }else{
                if(s[0]=='<'){
                    for(int i=0;i<n2;i++){
                        if(mns[l[i]]!=0){
                            if(mns[l[i]]==1){
                                mns[l[i]]=0;
                            }
                        }
                        if(mns[r[i]]!=0){
                            if(mns[r[i]]==-1){
                                mns[r[i]]=0;
                            }
                        }
                    }
                }else{
                    for(int i=0;i<n2;i++){
                        if(mns[r[i]]!=0){
                            if(mns[r[i]]==1){
                                mns[r[i]]=0;
                            }
                        }
                        if(mns[l[i]]!=0){
                            if(mns[l[i]]==-1){
                                mns[l[i]]=0;
                            }
                        }
                    }
                }
            }
        }
        /*printf("\nAA:\n");
        for(int i=1;i<=m;i++)printf("%d ",mns[i]);
        printf("\n");*/
        f=false;
        inc=false;
        for(int i=1;i<=m;i++){
            if(f&&mns[i]!=0){
                inc=true;
                break;
            }
            if(mns[i]!=0){
                fls=i;
                f=true;
            }
        }
        printf("%d\n",inc?0:fls);
        if(t>0)printf("\n");
    }
    return 0;
}

