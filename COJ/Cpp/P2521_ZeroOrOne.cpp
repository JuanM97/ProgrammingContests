/* 
 * File:   P2521_ZeroOrOne.cpp
 * Author: JuanM
 *
 * Created on January 10, 2014, 8:50 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>

using namespace std;

int A,B,C;
int main() {
    while(scanf("%d %d %d",&A,&B,&C)!=EOF){
        if((A==1&&B==0&&C==0)||(A==0&&B==1&&C==1))
            printf("A\n");
        else{
            if((A==0&&B==1&&C==0)||(A==1&&B==0&&C==1))
                printf("B\n");
            else{
                if((A==0&&B==0&&C==1)||(A==1&&B==1&&C==0))
                        printf("C\n");
                else
                    printf("*\n");
            }
        }
    }
    return 0;
}

