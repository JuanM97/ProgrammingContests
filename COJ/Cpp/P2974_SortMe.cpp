/* 
 * File:   P2974_SortMe.cpp
 * Author: JuanManuel
 *
 * Created on 16 de julio de 2014, 16:40
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
#define smL 35
using namespace std;

string names[smL];

char nn[33];

bool compW(char a, char b){
    if(a=='a'&&b=='b')return a>b;
    return a<b;
}

int t,n;

int main() {
    
    while(1){
        scanf("%d",&t);
        if(t==0)break;
        scanf("%s",nn);
        for(int i=0;i<t;i++){
            scanf("%s",&names[i]);
        }
        for(int i=0;i<t;i++){
            printf("%s\n",names[i].c_str());
        }
        //sort(names,names+t);

        for(int i=0;i<t;i++){
            printf("%s\n",names[i].c_str());
        }
    }
    return 0;
}

