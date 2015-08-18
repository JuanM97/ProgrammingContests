/* 
 * File:   P!0098_GeneratingFastSortedPermutation.cpp
 * Author: JuanM
 *
 * Created on July 15, 2013, 1:44 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <ctype.h>
#include <algorithm>
using namespace std;

int t;
char word[13];

int main() {
    scanf("%d",&t);
    while(t--){
        scanf("%s",&word);
        sort(word,word+strlen(word));
        do{
            printf("%s\n",word);
        }while(next_permutation(word,word+strlen(word)));
        printf("\n");
    }
    return 0;
}

