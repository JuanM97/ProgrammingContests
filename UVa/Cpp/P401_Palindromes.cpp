/* 
 * File:   P401_Palindromes.cpp
 * Author: JuanM
 *
 * Created on May 30, 2014, 11:14 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
using namespace std;

char stp[27];
char revL[]={'A','-','-','-','3','-','-','H','I','L','-','J','M','-','O','-','-','-','2','T','U','V','W','X','Y','5'};
char revN[]={'1','S','E','-','Z','-','-','8','-'};

bool isPalindrome(){
    for(int i=0;i<strlen(stp)/2;i++){
        if(stp[i]!=stp[strlen(stp)-i-1])return false;
    }
    return true;
}

bool isMirrored(){
    for(int i=0;i<strlen(stp)/2;i++){
        if(stp[i]>64){
            //printf("sL: %c %c %c\n",stp[i],stp[strlen(stp)-1-i],revL[stp[strlen(stp)-1-i]-'A']);
            if(revL[stp[i]-'A']!=stp[strlen(stp)-1-i])return false;
        }else{
            //printf("sN: %c %c %c\n",stp[i],stp[strlen(stp)-1-i],revN[stp[strlen(stp)-1-i]-'1']);
            if(revN[stp[i]-'1']!=stp[strlen(stp)-1-i])return false;
        }
    }
    return true;
}


//A=65, 1=49,9=57
int main() {
    //printf("%d %d %d",'9','A','1');
    while(scanf("%s",&stp)!=EOF){
        if(strlen(stp)==1){
            if(stp[0]>64){
                if(revL[stp[0]-'A']==stp[0]){
                    printf("%s -- is a mirrored palindrome.\n",stp);
                }else{
                    printf("%s -- is a regular palindrome.\n",stp);
                }
            }else{
                if(revN[stp[0]-'1']==stp[0]){
                    printf("%s -- is a mirrored palindrome.\n",stp);
                }else{
                    printf("%s -- is a regular palindrome.\n",stp);
                }
            }
        }else
        if(isPalindrome()&&isMirrored()){
            printf("%s -- is a mirrored palindrome.\n",stp);
        }else{
            if(isPalindrome()){
                printf("%s -- is a regular palindrome.\n",stp);
            }else{
                if(isMirrored()){
                    printf("%s -- is a mirrored string.\n",stp);
                }else{
                    printf("%s -- is not a palindrome.\n",stp);
                }
            }
        }
        printf("\n");
    }
    
    return 0;
}

