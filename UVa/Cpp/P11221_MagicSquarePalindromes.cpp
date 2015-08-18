/* 
 * File:   P11221_MagicSquarePalindromes.cpp
 * Author: JuanM
 *
 * Created on May 31, 2014, 12:00 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

vector<char>v;
vector<char>vr;
vector<char>c;
vector<char>cr;

int t,sq,csn=1;
char sent[10010];


int main() {
    scanf("%d",&t);
    gets(sent);
    while(t--){
        gets(sent);
        printf("Case #%d:\n",csn++);
        v.clear();vr.clear();c.clear();cr.clear();
        for(int i=0;i<strlen(sent);i++){
            if(sent[i]>='a'&&sent[i]<='z')v.push_back(sent[i]);
        }
        sq=(int)round(sqrt(v.size()));
        if(sq*sq!=v.size()){
            printf("No magic :(\n");
        }else{
            for(int i=v.size()-1;i>=0;i--){
                vr.push_back(v[i]);
            }
            for(int i=0;i<sq;i++){
                for(int j=0;j<sq;j++){
                    c.push_back(v[(i+sq*j)%v.size()]);
                }
            }
            for(int i=0;i<sq;i++){
                for(int j=0;j<sq;j++){
                    cr.push_back(v[(v.size()-1-i-sq*j)%v.size()]);
                }
            }
            /*
            for(int i=0;i<v.size();i++){
                printf("%c ",v[i]);
            }printf("  1\n");
            for(int i=0;i<vr.size();i++){
                printf("%c ",vr[i]);
            }printf("  2\n");
            for(int i=0;i<c.size();i++){
                printf("%c ",c[i]);
            }printf("  3\n");
            for(int i=0;i<cr.size();i++){
                printf("%c ",cr[i]);
            }printf("  4\n");
            */
            if(v==vr&&c==cr&&v==c){
                printf("%d\n",sq);
            }else{
                printf("No magic :(\n");
            }
        }
        
    }
    
    return 0;
}

