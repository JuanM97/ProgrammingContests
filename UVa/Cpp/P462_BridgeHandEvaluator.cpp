/* 
 * File:   P462_BridgeHandEvaluator.cpp
 * Author: JuanM
 *
 * Created on May 29, 2014, 3:39 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#define numCards 13
using namespace std;

char cd[3]={};
char bids='S';
char suites[]={'S','H','D','C'};
int points=0,points2=0,mm=0;
int kings[5]={};
int queens[5]={};
int jacks[5]={};
int nAces=0;
int nCards[5]={};
bool stopped[5]={false};

void putCard(char r,char s){
    if(r=='A'){
        nAces++;
        if(s=='S')stopped[0]=true;
        else if(s=='H')stopped[1]=true;
        else if(s=='D')stopped[2]=true;
        else if(s=='C')stopped[3]=true;
    }else if(r=='K'){
        if(s=='S')kings[0]++;
        else if(s=='H')kings[1]++;
        else if(s=='D')kings[2]++;
        else if(s=='C')kings[3]++;
    }else if(r=='Q'){
        if(s=='S')queens[0]++;
        else if(s=='H')queens[1]++;
        else if(s=='D')queens[2]++;
        else if(s=='C')queens[3]++;
    }else if(r=='J'){
        if(s=='S')jacks[0]++;
        else if(s=='H')jacks[1]++;
        else if(s=='D')jacks[2]++;
        else if(s=='C')jacks[3]++;
    }else{
        
    }
    if(s=='S')nCards[0]++;
    else if(s=='H')nCards[1]++;
    else if(s=='D')nCards[2]++;
    else if(s=='C')nCards[3]++;
}

void checkStopped(){
    for(int i=0;i<4;i++){
        if(kings[i]>0&&nCards[i]>1)stopped[i]=true;
        else if(queens[i]>0&&nCards[i]>2)stopped[i]=true;
    }
}

bool isStopped(){
    return stopped[0]&&stopped[1]&&stopped[2]&&stopped[3];
}

int main() {
    /*
    FILE *pf;
    pf=fopen("output.txt","w");
    */
    while(scanf("%s",&cd)!=EOF){
        //if(strcmp(cd,"-1")==0)break;
        points=0;points2=0;nAces=0;
        bids='0';
        memset(nCards,0,sizeof(nCards));
        memset(kings,0,sizeof(kings));
        memset(queens,0,sizeof(queens));
        memset(jacks,0,sizeof(jacks));
        memset(stopped,0,sizeof(stopped));
        
        putCard(cd[0],cd[1]);
        for(int i=1;i<numCards;i++){
            scanf("%s",&cd);
            putCard(cd[0],cd[1]);
        }
        checkStopped();
        points+=(nAces*4);
        //printf("points %d %d\n",points,points2);
        
        for(int i=0;i<4;i++){
            points+=(3*kings[i]);
            points+=(2*queens[i]);
            points+=(jacks[i]);
            if(kings[i]>0&&nCards[i]-kings[i]==0)points--;
            if(queens[i]>0&&nCards[i]-queens[i]<=1)points--;
            if(jacks[i]>0&&nCards[i]-jacks[i]<=2)points--;
            if(nCards[i]==2)points2++;
            if(nCards[i]<=1)points2+=2;
            //printf("points %d %d\n",points,points2);
        }
        //printf("points %d %d\n",points,points2);
        //printf("\n\n\n");
        if(points+points2<14){
            printf("PASS\n");
            //fprintf(pf,"PASS\n");
        }else{
            if(points>=16&&isStopped()){
                printf("BID NO-TRUMP\n");
                //fprintf(pf,"BID NO-TRUMP\n");
            }else{
                mm=nCards[0];
                bids='S';
                for(int i=1;i<4;i++){
                    if(nCards[i]>mm){
                        mm=nCards[i];
                        bids=suites[i];
                    }
                }
                printf("BID %c\n",bids);
                //fprintf(pf,"BID %c\n",bids);
            }
        }
    }
    
    return 0;
}

