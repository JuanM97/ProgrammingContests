/* 
 * File:   P1662_Run-LengthEncoding-Decoding.cpp
 * Author: JuanM
 *
 * Created on November 17, 2014, 2:54 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 200
using namespace std;

int main(){
    int n,f,i;
    char l,enc[smx];
    bool isn;
    while(scanf("%d",&n)!=EOF){
        for(i=1;i<=n;i++){
            f=0;
            isn=true;
            l='A';
            scanf("%s",&enc);
            printf("Case %d: ",i);
            for(int j=0;j<strlen(enc);j++){
                if(isn){
                    l=enc[j];
                    f=0;
                    isn=false;
                }else{
                    f=enc[j]-'0';
                    while(j+1<strlen(enc)&&enc[j+1]>='0'&&enc[j+1]<='9'){
                        f=f*10+(enc[j+1]-'0');
                        j++;
                    }
                    isn=true;
                    for(int k=0;k<f;k++){
                        printf("%c",l);
                    }
                }
                if(j>=strlen(enc)-1) printf("\n");
            }
        }
        
    }
    
    return 0;
}

