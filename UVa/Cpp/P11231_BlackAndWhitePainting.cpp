/* 
 * File:   P11231_BlackAndWhitePainting.cpp
 * Author: JuanM
 *
 * Created on June 4, 2014, 6:47 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;


//Look for combinations of column and rows. #boards=#white bottom-right corners in that difference.
int n,m,c,r;

int main() {
    
    while(scanf("%d %d %d",&n,&m,&c)){
        r=(n+1-8)*(m+1-8);
        if(!n&&!m&&!c)break;
        //If the difference is odd (odd*odd) and c=1, one more board is possible
        if(r%2&&c) printf("%d\n",(r>>1)+1);
        else  printf("%d\n",r>>1);
    }
    
    return 0;
}

