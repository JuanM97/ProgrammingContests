/* 
 * File:   P1285_FinalStandings.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 10:35 PM
 */

#include <cstdlib>
#include <cstdio>
#include <limits.h>
#include <cmath>
using namespace std;

int t,a,b;
int nums[100009][2];

/*************************************************/
void merge(int arr[][2], int p, int q, int r){
    int n1=q-p+1, n2=r-q;
    int L[n1+1][2];
    int R[n2+1][2];
    for(int i=0; i<n1;i++){
        L[i][0]=arr[p+i][0];
        L[i][1]=arr[p+i][1];
    }
    for(int j=0; j<n2;j++){
        R[j][0]=arr[q+j+1][0];
        R[j][1]=arr[q+j+1][1];
    }
    L[n1][0]=INT_MAX;    //...
    L[n1][1]=INT_MAX;    //...
    R[n2][0]=INT_MAX;
    R[n2][1]=INT_MAX;
    int i=0,j=0;
    for(int k=p; k<=r;k++){
        if(L[i][1]<(R[j][1])){
            arr[k][0]=L[i][0];
            arr[k][1]=L[i][1];
            i=i+1;
        }else{
            arr[k][0]=R[j][0];
            arr[k][1]=R[j][1];
            j=j+1;
        }
    }

}

void mergeSort(int arr[][2], int p, int r){
    if(p<r){
        int q=(int)floor((p+r)/2);
        mergeSort(arr, p, q);
        mergeSort(arr, q+1, r);
        merge(arr, p, q, r);
    }
}

void mergeSort(int arr[][2]){
    mergeSort(arr, 0, t-1);
}

void print(int b){
    for(int i=b-1;i>=0;i--){
        printf("%d %d\n",nums[i][0],nums[i][1]);
    }
}


int main() {
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        scanf("%d %d",&nums[i][0],&nums[i][1]);
    }
    mergeSort(nums);
    print(t);
    return 0;
}

