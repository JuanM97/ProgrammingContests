/* 
 * File:   P2621_GuessingNumbers.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 3:14
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int n;
    while(scanf("%d",&n)!=EOF){
        printf("%d\n",(int)(log(n)/log(2))+1);
    }
    return 0;
}

