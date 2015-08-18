/* 
 * File:   P1292_Chain.cpp
 * Author: JuanManuel
 *
 * Created on 6 de mayo de 2015, 11:32
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#define smx 510
using namespace std;

char seq[smx],subseq[smx];
int tbl[smx][smx];

int countMatchesFor(int seqDigitsLeft, int subseqDigitsLeft) {
    if (subseqDigitsLeft == 0) return 1;

    if (seqDigitsLeft == 0) return 0;

    char currSeqDigit = seq[strlen(seq)-seqDigitsLeft];
    char currSubseqDigit = subseq[strlen(subseq)-subseqDigitsLeft];

    int result = 0;

    if (currSeqDigit == currSubseqDigit)
        result += tbl[seqDigitsLeft - 1][subseqDigitsLeft - 1];

    result += tbl[seqDigitsLeft - 1][subseqDigitsLeft];

    return result;
}

int countMatches() {
    for (int row = 0; row <= strlen(seq); row++)
        for (int col = 0; col <= strlen(subseq); col++)
            tbl[row][col] = countMatchesFor(row, col);

    return tbl[strlen(seq)][strlen(subseq)];
}

int main() {
    int t,a;
    scanf("%d",&t);
    
    while(t--){
        scanf("%s %s",&seq,&subseq);
        for(int i=0;i<=strlen(seq)+1;i++){
            for(int j=0;j<=strlen(subseq)+1;j++){
                tbl[i][j]=0;
                //printf("%d ",tbl[i][j]);
            }
        }
        a=countMatches();
        /*
        for(int i=0;i<=strlen(seq);i++){
            for(int j=0;j<=strlen(subseq);j++){
                printf("%d ",tbl[i][j]);
            }printf("\n");
        }
        */
        printf("%d\n",a);
    }
    
    return 0;
}
