/* 
 * File:   P2419_JoshuaString.cpp
 * Author: JuanM
 *
 * Created on July 4, 2013, 11:04 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;

char ar[57][27];
char c[1073];

char getM(int n){
    char min='{';
    int ix=0;
    for(int i=0;i<n;i++){
        if(strlen(ar[i])>0 && min>ar[i][0]){
            ix=i;
            min=ar[i][0];
        }
    }
    strncpy(ar[ix],ar[ix]+1,sizeof(ar[ix])-1);
    return min;
}

void sortN(char array[][27], int size){
	int startScan, minIndex;
	char minVal[27];
	for (startScan = 0; startScan < (size - 1); startScan++){
		minIndex = startScan;
		strcpy(minVal, array[startScan]);

		for (int index = startScan + 1; index < size; index++){
			if( (strcmp(array[index], minVal)) < 0){
				strcpy(minVal, array[index]);
				minIndex = index;
			}
		}
		strcpy(array[minIndex], array[startScan]);
		strcpy(array[startScan], minVal);
	}
}



void printA(int n){
    printf("INI\n");
    for(int i=0;i<n;i++){
        printf("%d %s\n",i+1,ar[i]);
    }
    printf("END:\n");
}

int main() {
    int t,n,ix,lt;
    scanf("%d",&t);
    while(t--){
        memset(c,0,sizeof c);
        scanf("%d",&n);
        lt=0;
        for(int i=0;i<n;i++){
            scanf("%s",&ar[i]);
            lt+=strlen(ar[i]);
        }
        ix=0;
        //printA(n);
        while(lt--){
            sortN(ar,n);
            c[ix++]=getM(n);
            //printA(n);
        }
        printf("%s\n",c);
    }
    return 0;
}

