/* 
 * File:   P1044_Doomsday.cpp
 * Author: JuanManuel
 *
 * Created on 15 de mayo de 2015, 17:34
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
using namespace std;

//Falta checar que caigan en el mismo día ):

int main() {
    int d1,m1,d2,m2;
    while(scanf("%d %d %d %d",&d1,&m1,&d2,&m2) && d1 && m1 && d2 && m2){
        if((d1>=1 && d1<=31) && (d2>=1 && d2<=31) && (m1>=1 && m1<=12) && (m2>=1 && m2<=12)){
            if((d1==m1 && d2==m2) || (d1==m2 && d2==m1)){
                printf("S\n");
            }else{
                printf("N\n");
            }
        }else{
            printf("N\n");
        }
    }
    return 0;
}

