/* 
 * File:   P1933_Og.cpp
 * Author: JuanM
 *
 * Created on April 29, 2013, 2:16 AM
 */

#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
	int a,b;
	while(true){
		scanf("%d %d",&a,&b);
		if(a==0&&b==0)break;
		printf("%d\n",a+b);
	}
	return 0;
}
