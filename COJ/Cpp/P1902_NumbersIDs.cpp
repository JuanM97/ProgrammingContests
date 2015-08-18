/* 
 * File:   P1902_NumbersIDs.cpp
 * Author: JuanM
 *
 * Created on June 9, 2013, 10:28 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
using namespace std;

char cid[30];
char g[3];

char cty[6];
char ctry[6];
char rnd[6];
char date[20];
char d[6];
char m[6];
char y[6];

int main() {
    int t;
    scanf("%d",&t);
    while(t--){
        strcpy(cid,"0-0000-00-00-0000-000-0000");
        scanf("%s %s %s %s %s",&g,&date,&cty,&ctry,&rnd);
        bool isF=false;
        int l1=0,l2=0;
        for(int i=0;i<strlen(date);i++){
            if(!isF){
                if(date[i]=='/'){
                l1=i;isF=true;}
            }else{
                if(date[i]=='/')l2=i;
            }
        }
        memcpy(d,&date[0],l1);d[l1]='\0';
        memcpy(m,&date[l1+1],l2-l1-1);m[l2-l1-1]='\0';
        memcpy(y,&date[l2+1],strlen(date)-l2-1);y[strlen(date)-l2-1]='\0';
        
        cid[0]=g[0];
        for(int i=strlen(y)-1;i>=0;i--){
            cid[6-strlen(y)+i]=y[i];
        }
        for(int i=strlen(m)-1;i>=0;i--){
            cid[9-strlen(m)+i]=m[i];
        }
        for(int i=strlen(d)-1;i>=0;i--){
            cid[12-strlen(d)+i]=d[i];
        }
        for(int i=strlen(cty)-1;i>=0;i--){
            cid[17-strlen(cty)+i]=cty[i];
        }
        for(int i=strlen(ctry)-1;i>=0;i--){
            cid[21-strlen(ctry)+i]=ctry[i];
        }
        for(int i=strlen(rnd)-1;i>=0;i--){
            cid[26-strlen(rnd)+i]=rnd[i];
        }
        printf("%s\n",&cid);
    }
    return 0;
}

