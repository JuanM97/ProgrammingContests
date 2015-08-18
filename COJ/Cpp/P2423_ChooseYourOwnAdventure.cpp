/* 
 * File:   P2423_ChooseYourOwnAdventure.cpp
 * Author: JuanM
 *
 * Created on July 6, 2013, 12:22 AM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cmath>
#define smx 1013
using namespace std;

struct section{
    int pi;
    int pf;
    int np;
    vector<int> goTo;
};

section book[smx];

void printBook(int b){
    for(int i=0;i<b;i++){
        printf("a,b: %d %d :: ",book[i].pi,book[i].pf);
        for(int j=0;j<book[i].goTo.size();j++){
            printf("%d ",book[i].goTo[j]);
        }
        printf("\n");
    }
}

int getSection(int page,int n){
    for(int i=0;i<n;i++){
        if(page>=book[i].pi&&page<=book[i].pf){
            return i;
        }
    }
    return -1;
}

int countPages(int sectionNo,int psf){
    int mn=100000,ps;
    if(book[sectionNo].goTo.size()==0){
        return book[sectionNo].np;
    }else{
        ps=book[sectionNo].np;
        for(int i=0;i<book[sectionNo].goTo.size();i++){
            mn=min(psf+countPages(book[sectionNo].goTo[i],psf+ps+1),mn);
        }
        return mn;
    }
}

int countMPages(int sectionNo,int psf){
    int mn=-1,ps;
    if(book[sectionNo].goTo.size()==0){
        return book[sectionNo].np;
    }else{
        ps=book[sectionNo].np;
        for(int i=0;i<book[sectionNo].goTo.size();i++){
            mn=max(psf+countMPages(book[sectionNo].goTo[i],psf+ps+1),mn);
        }
        return mn;
    }
}

void clr(){
    for(int i=0;i<smx;i++){
        book[i].goTo.clear();
    }
}

int main() {
    int t,n,a,b,p,qn,q,csn=1,sec;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        clr();
        for(int i=0;i<n;i++){
            scanf("%d %d %d",&a,&b,&p);
            book[i].pi=a;
            book[i].pf=b;
            book[i].np=b-a+1;
            if(p!=-1){
                book[p].goTo.push_back(i);
            }
        }
        //printBook(n);
        scanf("%d",&qn);
        printf("Case %d:\n",csn++);
        while(qn--){
            scanf("%d",&q);
            sec=getSection(q,n);
            
            if(book[sec].goTo.size()==0){
                printf("%d %d\n",countPages(sec,0)+book[sec].pi-q,countMPages(sec,0)+book[sec].pi-q);
            }else{
                printf("%d %d\n",book[sec].pf-q+1+countPages(sec,0),book[sec].pf-q+countMPages(sec,0)+1);
            }
            
        }
    }
    return 0;
}

