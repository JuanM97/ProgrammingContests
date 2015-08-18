/* 
 * File:   P441_Lotto.cpp
 * Author: JuanManuel
 *
 * Created on 28 de mayo de 2015, 20:03
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 20
#define nn 6
using namespace std;

int main() {
    int n,ar[smx];
    bool nfirst=false;
    while(scanf("%d",&n)&&n){
        for(int i=0;i<n;i++){
            scanf("%d",&ar[i]);
        }
        if(nfirst)printf("\n");
        nfirst=true;
        sort(ar,ar+n);
        for(int ix1=0;ix1<n;ix1++){
            for(int ix2=ix1+1;ix2<n;ix2++){
                for(int ix3=ix2+1;ix3<n;ix3++){
                    for(int ix4=ix3+1;ix4<n;ix4++){
                        for(int ix5=ix4+1;ix5<n;ix5++){
                            for(int ix6=ix5+1;ix6<n;ix6++){
                                printf("%d %d %d %d %d %d\n",ar[ix1],ar[ix2],ar[ix3],ar[ix4],ar[ix5],ar[ix6]);
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}

