/* 
 * File:   P1665_WERTYU.cpp
 * Author: JuanM
 *
 * Created on June 3, 2013, 1:19 AM
 */

#include <cstdlib>
#include <cstdio>
using namespace std;

int main(){
    char key;

    while(scanf("%c",&key)!=EOF){

        switch (key){
        case 'W':
            key = 'Q';
            break;
        case 'E':
            key = 'W';
            break;
        case 'R':
            key = 'E';
            break;
        case 'T':
            key = 'R';
            break;
        case 'Y':
            key = 'T';
            break;
        case 'U':
            key = 'Y';
            break;
        case 'I':
            key = 'U';
            break;
        case 'O':
            key = 'I';
            break;
        case 'P':
            key = 'O';
            break;
        case '[':
            key = 'P';
            break;
        case ']':
            key = '[';
            break;
        case '\\':
            key = ']';
            break;
        case 'S':
            key = 'A';
            break;
        case 'D':
            key = 'S';
            break;
        case 'F':
            key = 'D';
            break;
        case 'G':
            key = 'F';
            break;
        case 'H':
            key = 'G';
            break;
        case 'J':
            key = 'H';
            break;
        case 'K':
            key = 'J';
            break;
        case 'L':
            key = 'K';
            break;
        case ';':
            key = 'L';
            break;
        case '\'':
            key = ';';
            break;
        case 'X':
            key = 'Z';
            break;
        case 'C':
            key = 'X';
            break;
        case 'V':
            key = 'C';
            break;
        case 'B':
            key = 'V';
            break;
        case 'N':
            key = 'B';
            break;
        case 'M':
            key = 'N';
            break;
        case ',':
            key = 'M';
            break;
        case '.':
            key = ',';
            break;
        case '/':
            key = '.';
            break;
        case '1':
            key = '`';
            break;
        case '2':
            key = '1';
            break;
        case '3':
            key = '2';
            break;
        case '4':
            key = '3';
            break;
        case '5':
            key = '4';
            break;
        case '6':
            key = '5';
            break;
        case '7':
            key = '6';
            break;
        case '8':
            key = '7';
            break;
        case '9':
            key = '8';
            break;
        case '0':
            key = '9';
            break;
        case '-':
            key = '0';
            break;
        case '=':
            key = '-';
            break;
        case '\n':
            key='\n';
            break;
        }
        printf("%c",key);
    }
    return 0;
}

