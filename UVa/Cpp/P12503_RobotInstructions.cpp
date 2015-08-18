/* 
 * File:   P12503_RobotInstructions.cpp
 * Author: JuanM
 *
 * Created on July 11, 2013, 4:49 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;

char ins[23];
int mov[123];
int t,n,m,p;

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        memset(mov,0,sizeof mov);
        p=0;
        for(int i=1;i<=n;i++){
            scanf("%s",&ins);
            if(strcmp(ins,"SAME")==0){
                scanf("%s %d",&ins,&m);
                mov[i]=mov[m];
            }else{
                if(strcmp(ins,"LEFT")==0){
                    mov[i]=-1;
                }else{
                    mov[i]=1;
                }
            }
            p+=mov[i];
        }
        printf("%d\n",p);
    }
    return 0;
}

