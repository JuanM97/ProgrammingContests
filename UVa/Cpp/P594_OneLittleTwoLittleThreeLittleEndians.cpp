/* 
 * File:   P594_OneLittleTwoLittleThreeLittleEndians.cpp
 * Author: JuanM
 *
 * Created on July 25, 2013, 7:28 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <iostream>
#include <bitset>
#define swap(a,b) a=a^b,b=a^b,a=a^b;
using namespace std;
int n, bs;
char *bts, *bz;

int main() {
    while (scanf("%d",&bs) != EOF) {
        n=bs;
        bts = (char*)&bs;
        swap(bts[0], bts[3]);
        swap(bts[1], bts[2]);
        printf("%d converts to %d\n",n,bs);
    }
    return 0;
}

