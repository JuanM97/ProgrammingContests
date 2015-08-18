/* 
 * File:   P10370_AboveAverage.cpp
 * Author: JuanManuel
 *
 * Created on 26 de marzo de 2014, 12:56
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;


int t,n;
double av,ct;
int grades[1003];

int main() {
    
    scanf("%d",&t);
    
    while(t--){
        scanf("%d",&n);
        av=0;
        ct=0;
        for(int i=0;i<n;i++){
            scanf("%d",&grades[i]);
            av+=grades[i];
        }
        av/=n;
        for(int i=0;i<n;i++){
            if(grades[i]>av)
                ct++;
        }
        printf("%.3lf%%\n",ct*100/n);
    }
    
    return 0;
}

