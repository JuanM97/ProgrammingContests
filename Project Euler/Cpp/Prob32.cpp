/* 
 * File:   Prob32.cpp
 * Author: JuanM
 *
 * Created on June 10, 2014, 9:46 PM
 */


#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

int digs[10];

bool isPandig(int a, int b, int c){
    int r=0;
    while(a>=1){
        r=a%10;
        a/=10;
        digs[r]++;
    }
    while(b>=1){
        r=b%10;
        b/=10;
        digs[r]++;
    }
    while(c>=1){
        r=c%10;
        c/=10;
        digs[r]++;
    }
    if(digs[0]>0)return false;
    for(int i=1;i<10;i++){
        if(digs[i]!=1)return false;
    }
    return true;
}

vector<int> prods;

int main() {
    int sum=0;
    prods.clear();
    prods.push_back(-1);
    printf("init:\n");
    for(int i=2;i<100;i++){
        //printf("%d ",i);
        //Limiting the Search Space :)
        for(int j=i>9?123:1234;j<10000/i;j++){
            memset(digs,0,sizeof(digs));
            if(find(prods.begin(),prods.end(),i*j)==prods.end()){
                if(isPandig(i,j,i*j)){
                    prods.push_back(i*j);
                    sum+=i*j;
                }
            }
        }
    }
    printf("%d\n",sum);
    
    return 0;
}

