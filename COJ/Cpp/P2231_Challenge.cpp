/* 
 * File:   P2231_Challenge.cpp
 * Author: JuanM
 *
 * Created on November 17, 2014, 2:44 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 15
using namespace std;

int main(){
    int n,ca,cb;
    char a[smx],b[smx];
    while(scanf("%d",&n)!=EOF){
        ca=cb=0;
        while(n--){
            scanf("%s %s",a,b);
            if(strcmp(a,b)!=0){
                if((strcmp(a,"rock")==0&&strcmp(b,"scissors")==0)||
                        (strcmp(a,"paper")==0&&strcmp(b,"rock")==0)||
                        (strcmp(a,"scissors")==0&&strcmp(b,"paper")==0)){
                    ca++;
                }else{
                    cb++;
                }
            }
        }
        printf("%s\n",ca>cb?"A win":cb>ca?"B win":"tied");
    }
    
    return 0;
}

