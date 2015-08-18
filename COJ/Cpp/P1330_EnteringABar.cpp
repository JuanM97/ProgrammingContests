/* 
 * File:   P1330_EnteringABar.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 11:40 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char c[103];
char bvs[][20]={"ABSINTH","BEER","BRANDY","CHAMPAGNE","GIN","RUM","SAKE","TEQUILA","VODKA","WHISKEY","WINE"};

bool isNum(){
    bool is=true;
    for(int i=0;i<strlen(c);i++){
        if(c[i]<48||c[i]>57){
            is=false;
            break;
        }
    }
    return is;
}

int getNum(){
    int n=0;
    for(int i=0;i<strlen(c);i++){
        n=n*10+(int)(c[i]-'0');
    }
    return n;
}

bool belongs(){
    bool b=false;
    for(int i=0;i<11;i++){
        if(strcmp(bvs[i],c)==0){
            b=true;
            break;
        }
    }
    return b;
}

int main() {
    int t,n,count;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        count=0;
        while(n--){
            scanf("%s",&c);
            if(isNum()){
                if(getNum()<18){
                    count++;
                }
            }else{
                if(belongs()){
                    count++;
                }
            }
        }
        printf("%d\n",count);
    }
    return 0;
}

