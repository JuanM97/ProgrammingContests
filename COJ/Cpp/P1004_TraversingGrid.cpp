/* 
 * File:   P1004_TraversingGrid.cpp
 * Author: JuanM
 *
 * Created on April 6, 2015, 11:58 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;
//Idea de Ivan ..
int main(){
    int t,n,m;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&n,&m);
        printf("%s\n",n>m?(m&1?"D":"U"):(n&1?"R":"L"));
    }
    return 0;
}

