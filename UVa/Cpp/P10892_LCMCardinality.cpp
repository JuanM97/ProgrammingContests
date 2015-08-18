/* 
 * File:   P10892_LCMCardinality.cpp
 * Author: JuanM
 *
 * Created on January 16, 2013, 11:12 PM
 */

#include <cstdlib>
#include <iostream>
#include <math.h>
using namespace std;

int* arr(int num, int x){
    x=0;
    int ar[num];
    int k=1;
    for(int i=1; i<num;i++){
        if(num%i==0)
            ar[k++]=i;
    }
    x=k;
}

int lcmCard(int a[], int s){
    for(int i=0;i<s;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
    int cont=s;
    int min, max;
    for(int i=0;i<s;i++){
        for(int j=0; j<s;j++){
            if(a[j]<a[i]){
                min=a[j];
                max=a[i];
            }else{
                min=a[i];
                max=a[j];
            }
            if(max%min!=0)
                cont++;
        }
    }
    return cont;
}

int main(){
    int n,div;
    int *a;
    while(scanf("%d",&n)&&n){
        a=arr(n,div);
        printf("%d\n",lcmCard(a,div));
    }
    return 0;
}

