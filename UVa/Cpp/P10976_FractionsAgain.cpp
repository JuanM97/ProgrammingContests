/* 
 * File:   P10976_FractionsAgain.cpp
 * Author: JuanManuel
 *
 * Created on 26 de mayo de 2015, 21:15
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    long int k,y,x,ct;
    vector <long int>v;
    while(scanf("%ld",&k)!=EOF){
        x=1000000;
        ct=0;
        v.clear();
        for(y=k+1;y<=x;y++){
            if((k*y)%(y-k)==0){
                x=(k*y)/(y-k);
                ct++;
                v.push_back(x);
                v.push_back(y);
            }
        }
        printf("%ld\n",ct);
        for(int i=0;i<v.size();i+=2){
            printf("1/%ld = 1/%ld + 1/%ld\n",k,v[i],v[i+1]);
        }
    }
    return 0;
}

