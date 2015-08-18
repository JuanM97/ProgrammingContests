/* 
 * File:   P3080_Numeracy.cpp
 * Author: JuanM
 *
 * Created on November 28, 2014, 2:51 AM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int t;
    double a,b,r;
    scanf("%d",&t);
    char op,eq;
    bool c=false;
    while(t--){
        scanf("%lf %c %lf %c %lf",&a,&op,&b,&eq,&r);
        switch(op){
            case '+':
                c=(a+b==r);
                break;
            case '-':
                c=(a-b==r);
                break;
            case '*':
                c=(a*b==r);
                break;
            case '/':
                c=(a/b==r);
                break;
        }
        printf("%s\n",c?"Yes":"No");
    }
    
    return 0;
}

