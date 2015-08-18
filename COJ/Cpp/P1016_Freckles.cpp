/* 
 * File:   P1016_Freckles.cpp
 * Author: JuanManuel
 *
 * Created on 15 de mayo de 2015, 16:37
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 110
using namespace std;
double pts[smx][2],sum;
int n;
double dijkstra(){
    double ax,min;
    double dist[100];
    bool intree[100];
    memset(intree,0,sizeof(intree));
    for(int i=0;i<100;i++) dist[i]=1000000.0;
    int v=0;
    dist[0]=0;
    sum=0;
    while(!intree[v]){    
        intree[v]=1;
        sum+=dist[v];
        for(int i=0;i<n;i++){
            if(!intree[i]){
                ax=sqrt(pow(pts[v][0]-pts[i][0],2)+pow(pts[v][1]-pts[i][1],2));
                if(ax<dist[i]) dist[i]=ax;
            }
        }
        v=0;
        min=1000000.0;
        for(int i=0;i<n;i++){
            if(!intree[i]){
                if(dist[i]<min){
                    v=i;
                    min=dist[i];
                }
            }
        }
        
    }
    return sum;
}

int main() {
    while(scanf("%d",&n)!=EOF){
        for(int i=0;i<n;i++){
            scanf("%lf %lf",&pts[i][0],&pts[i][1]);
        }
        printf("%.2lf\n",dijkstra());
    }
    return 0;
}

