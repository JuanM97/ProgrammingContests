/* 
 * File:   P2380_BinaryCheckSum.cpp
 * Author: JuanM
 *
 * Created on June 30, 2013, 9:43 PM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main() {
    int t;
    long int n,c;
    scanf("%d",&t);
    c=0;
    while(t--){
        scanf("%ld",&n);
        while(n>0){
            if(n&1){
                c++;
            }
            n>>=1;
        }
    }
    printf("%ld\n",c);
    return 0;
}

