/* 
 * File:   P1656_BessieWeightProblem.cpp
 * Author: JuanManuel
 *
 * Created on 4 de febrero de 2015, 2:08
 */


/*
//With Reps ...
#include <stdio.h>
#include <stdlib.h>
#define SUM 300
#define MAXNUMsSIZE 30
#define PRINT 0

long long table1[SUM][MAXNUMsSIZE];

void printr(const int r[], int rsize){
    int lastr=r[0],count=0,i;
    for(i=0; i<rsize;++i){
        if(r[i]==lastr){
            count++;
        }else{
            printf(" %d*%d ",count,lastr);
            lastr=r[i];
            count=1;
        }
    }
    if(r[i-1]==lastr) printf(" %d*%d ",count,lastr);
    printf("\n");
}

long long CountAddToSum(int s, int arr[],int arrsize, const int r[],int rsize){
    static int totalmem=0, maxmem=0;
    int i,*rnew;
    long long result1=0,result2=0;

    if(s<0) return 0;
    if (table1[s][arrsize]>0 && PRINT==0) return table1[s][arrsize];
    if(s==0){
        if(PRINT) printr(r, rsize);
        return 1;
    }
    if(arrsize==0) return 0;
    rnew=(int*)malloc((rsize+1)*sizeof(int));

    for(i=0;i<rsize;++i) rnew[i]=r[i]; 
    rnew[rsize]=arr[arrsize-1];

    result1 =  CountAddToSum(s,arr,arrsize-1,rnew,rsize);
    result2 =  CountAddToSum(s-arr[arrsize-1],arr,arrsize,rnew,rsize+1);
    table1[s][arrsize]=result1+result2;
    free(rnew);

    return result1+result2;

}

int main()
{
    int Nums[]={1,2,3,4,5,7};
    int sum=10;
    int size=sizeof(Nums)/sizeof(int);
    int i,j,a[]={0};
    long long N=0;
    //CTime timer1;

    for(i=0;i<SUM;++i) 
        for(j=0;j<MAXNUMsSIZE;++j) 
            table1[i][j]=-1;

    N = CountAddToSum(sum,Nums,size,a,0); //algorithm
    //timer1.Get_Passd();

    //printf("\nN=%lld time=%.1f ms\n", N,timer1.Get_Passd());
    printf("\nN=%lld \n", N);
    getchar();
    return 1;
}
*/

/*
#include <iostream>
#include <list>
#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;

void subset_sum_recursive(list<int> numbers, int target,list<int> partial){
    int s = 0;
    for (list<int>::const_iterator cit = partial.begin(); cit != partial.end(); cit++){
        s += *cit;
    }
    if(s == target){
        cout << "sum([";
        for (std::list<int>::const_iterator cit = partial.begin(); cit != partial.end(); cit++){
            cout << *cit << ",";
        }
        cout << "])=" << target << endl;
    }
    
    if(s >= target) return;
    
    int n;
    for (list<int>::const_iterator ai = numbers.begin(); ai != numbers.end(); ai++){
        n = *ai;
        list<int> remaining;
        for(list<int>::const_iterator aj = ai; aj != numbers.end(); aj++){
            if(aj == ai)continue;
            remaining.push_back(*aj);
        }
        list<int> partial_rec=partial;
        partial_rec.push_back(n);
        subset_sum_recursive(remaining,target,partial_rec);
    }
}

void subset_sum(list<int> numbers,int target){
    subset_sum_recursive(numbers,target,list<int>());
}
int main(){
    list<int> a;
    a.push_back (3); a.push_back (9); a.push_back (8);
    a.push_back (4);
    a.push_back (5);
    a.push_back (7);
    a.push_back (10);
    int n = 15;
    //std::cin >> n;
    subset_sum(a, n);
    return 0;
}
*/