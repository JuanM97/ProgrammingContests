/*
 * File:   P2369_AddAndMultiply.cpp
 * Author: JuanManuel
 *
 * Created on 8 de octubre de 2014, 11:59
*/

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
using namespace std;

long long int getMin(long long int a,long long int b,long long int c,long long int d,long long int e,long long int f){
    return min(min(min(min(min(a,b),c),d),e),f);
}

long long int getMax(long long int a,long long int b,long long int c,long long int d,long long int e,long long int f){
    return max(max(max(max(max(a,b),c),d),e),f);
}

int main(){
    int t;
    long long int a,b,c;
    scanf("%d",&t);
    while(t--){
        scanf("%lld %lld %lld",&a,&b,&c);
        printf("%lld %lld\n",getMin((a+b)*c,(a+c)*b,(b+c)*a,a*b+c,a*c+b,b*c+a),getMax((a+b)*c,(a+c)*b,(b+c)*a,a*b+c,a*c+b,b*c+a));
    }
    return 0;
}

/*
#include <cstdio>
#include <algorithm>
using namespace std;

long long int Max(long long int a, long long int b, long long int c, long long int d, long long int e, long long int f){
	return max(max(max(max(max(a,b),c),d),e),f);
}
long long int Min(long long int a, long long int b, long long int c, long long int d, long long int e, long long int f){
	return min(min(min(min(min(a,b),c),d),e),f);
}

int main(){
	int t;
	long long int a,b,c;
	scanf("%d",&t);

	while(t--){
		scanf("%lld%lld%lld",&a,&b,&c);
		printf("%lld %lld",Min((a+b)*c,(a+c)*b,(b+c)*a,a*b+c,a*c+b,b*c+a),Max((a+b)*c,(a+c)*b,(b+c)*a,a*b+c,a*c+b,b*c+a));
	}

	return 0;
}

*/