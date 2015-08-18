/* 
 * File:   P1185_TheProductOfDigits.cpp
 * Author: JuanManuel
 *
 * Created on 29 de octubre de 2014, 12:01
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

vector<int> v;

int main() {
    int num;
    while(scanf("%d",&num)!=EOF){
        v.clear();
        for(int i=9;i>1;i--){
            while(num%i==0){
                v.push_back(i);
                num/=i;
            }
        }
        if(v.size()>0){
            for(int i=v.size()-1;i>=0;i--){
                printf("%d",v[i]);
            }
            printf("\n");
        }else{
            printf("-1\n");
        }
    }
    return 0;
}

