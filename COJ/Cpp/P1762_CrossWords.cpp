/* 
 * File:   P1762_CrossWords.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 4:49 PM
 */

#include <cstdlib>
#include <cstdio>
#include <algorithm>
#include <cstring>
using namespace std;

int main() {
    char a[33],b[33];
    int i,j;
    bool f;
    while(scanf("%s %s",&a,&b)!=EOF){
        f=true;
        for(i=0;f&&i<strlen(a);i++){
            for(j=0;j<strlen(b);j++){
                if(a[i]==b[j]){
                    f=false;
                    break;
                }
            }
        }
        i--;
        for(int k=0;k<strlen(b);k++){
            if(k!=j){
                for(int l=0;l<strlen(a);l++){
                    if(l==i){
                        printf("%c",b[k]);
                    }else{
                        printf(".");
                    }
                }printf("\n");
            }else{
                printf("%s\n",a);
            }
        }
    }
    return 0;
}

