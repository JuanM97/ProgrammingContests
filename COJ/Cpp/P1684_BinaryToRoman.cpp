/* 
 * File:   P1684_BinaryToRoman.cpp
 * Author: JuanM
 *
 * Created on June 10, 2013, 11:36 PM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>
#include <cstring>
#include <string>
using namespace std;


string roman[] = {"M", "CM", "D", "CD", "C", "XC", "L","XL", "X", "IX", "V", "IV", "I"};

int ar[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

string binaryToRoman(int binary){
    string r="";
    
    for(int i=0; i<sizeof(roman)/sizeof(roman[0]);i++){
        while(binary >= ar[i]){
            binary-=ar[i];
            r+=roman[i];
        }
    }
    return r;
}

int toDecimal(char *c){
    int a=0;
    int two=1;
    for(int i=strlen(c)-1;i>=0;i--){
        a=a+((c[i]-'0')*two);
        two*=2;
    }
    return a;
}

int main() {
    int t,b;
    char a[15];
    scanf("%d",&t);
    while(t--){
        scanf("%s",&a);
        b=toDecimal(a);
        printf("%s\n",binaryToRoman(b).c_str());
    }
    return 0;
}

