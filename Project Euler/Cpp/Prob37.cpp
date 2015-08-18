/* 
 * File:   Prob37.cpp
 * Author: JuanM
 *
 * Created on June 11, 2014, 8:01 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define smx 10000100
using namespace std;

vector<int> p;
bool pb[smx]={false};

void sieve(){
    p.push_back(2);
    pb[0]=true;
    pb[1]=true;
    for(int i=2;2*i<smx;i++){
        pb[2*i]=true;
    }
    for(int i=3;i<smx;i++){
        if(!pb[i]){
            p.push_back(i);
            for(int j=2;i*j<smx;j++){
                pb[i*j]=true;
            }
        }
    }
}

bool isTruncR(int a){
    int aa=a;
    while(!pb[aa]&&aa>=1){
        aa/=10;
    }
    return aa<1;
}

char nn[10];
bool isTruncL(int a){
    int aa=0;
    memset(nn,0,sizeof(nn));
    sprintf(nn,"%d",a);
    aa=atoi(nn);
    while(!pb[aa]&&aa>=1){
        strncpy(nn,nn+1,strlen(nn));
        aa=atoi(nn);
    }
    return aa<1;
}

vector<int> nums;
int ss;
int main() {
    sieve();
    nums.clear();
    for(int i=4;i<p.size();i++){
        if(!pb[p[i]]&&isTruncR(p[i])&&isTruncL(p[i])){
            nums.push_back(p[i]);
        }
    }
    ss=0;
    for(int i=0;i<nums.size();i++){
        printf("%d ",nums[i]);
        ss+=nums[i];
    }printf("\n");
    
    printf("ss = %d\n",ss);
    
    return 0;
}

