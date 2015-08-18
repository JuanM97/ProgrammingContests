/* 
 * File:   P163_ErrorCorrection.cpp
 * Author: JuanM
 *
 * Created on June 4, 2013, 12:51 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

int a[103][103];
int sfs[104];
int scs[104];
int t;

int* getI(){
    int x=0,y=0;
    for(int i=0;i<t;i++){
        if(sfs[i]==1){
            x=i;
        }
        if(scs[i]==1){
            y=i;
        }
        if(x==1&&y==1){
            break;
        }
    }
    int a[]={x+1,y+1};
    return a;
}

int check(){
    if(sfs[t]==0&&scs[t]==0){
        return 1;
    }else{
        if((sfs[t]==1&&scs[t]==1)){
            return 3;
        }else{
            return 2;
        }
    }
}

int main() {
        int s,stf,stc;
        while(true){
            scanf("%d",&t);
            if(t==0)break;
            for(int i=0;i<t;i++){
                s=0;
                for(int j=0;j<t;j++){
                    scanf("%d",&a[i][j]);
                    s+=a[i][j];
                }
                sfs[i]=s%2;
            }
            for(int i=0;i<t;i++){
                s=0;
                for(int j=0;j<t;j++){
                    s+=a[j][i];
                }
                scs[i]=s%2;
            }
            stf=stc=0;
            for(int i=0;i<t;i++){
                stf+=sfs[i];
                stc+=scs[i];
            }
            sfs[t]=stf;
            scs[t]=stc;
            //System.out.println(java.util.Arrays.toString(sfs));
            //System.out.println(java.util.Arrays.toString(scs)+"\n");
            switch(check()){
                case 1:
                    printf("OK\n");
                    break;
                case 2:
                    printf("Corrupt\n");
                    break;
                case 3:
                    printf("Change bit (%d,%d)\n",getI()[0],getI()[1]);
                    break;
            }
        }
    return 0;
}

