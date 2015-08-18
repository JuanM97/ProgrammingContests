/* 
 * File:   P2441_DotsAndSquares.cpp
 * Author: JuanM
 *
 * Created on July 5, 2013, 11:46 PM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main() {
    int t,n,m;
    scanf("%d",&t);
    while(t--){
        scanf("%d %d",&n,&m);
        printf("%s\n",(n+m)&1?"First":"Second");
    }
    return 0;
}

