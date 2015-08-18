/* 
 * File:   P146_IDCodes.cpp
 * Author: JuanM
 *
 * Created on March 15, 2013, 11:06 PM
 */

#include <cstdlib>
#include <iostream> 
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <string>
#include <cctype>
#include <stack>
#include <queue>
#include <list>
#include <vector>
#include <map>
#include <sstream>
#include <utility>
#include <set>
#include <math.h>
#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
using namespace std;

int main(){
    while(1){
        char st[55];
        gets(st);
        
        if(st[0]=='#'){
            break;
        }
        if(!next_permutation(st,st+strlen(st))){
                puts("No Successor");
        }else{
                puts(st);
        }
    }
    return 0;
}  
