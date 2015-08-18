/* 
 * File:   P1382_SumOfCubes.cpp
 * Author: JuanManuel
 *
 * Created on 22 de abril de 2015, 17:26
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <cstring>
#include <algorithm>
#include <vector>
#define mod 1000007
using namespace std;

vector<unsigned long long int> cubes;
vector<unsigned long long int> cubesS;
int t;
long int a,b,ga,rs;
long int gb;

int main() {
    cubes.clear();
    cubesS.clear();
    cubes.push_back(0);
    cubesS.push_back(0);
    for(unsigned long long int i=1;i<1000010;i++){
        cubes.push_back((i%mod*i%mod*i%mod)%mod);
        cubesS.push_back((cubesS[(int)i-1]%mod+cubes[(int)i]%mod)%mod);
    }
    scanf("%d",&t);
    while(t-->0){
        scanf("%ld %ld",&a,&b);
        //Error de precisión. Checar solución de JAVA
        ga=ceil(pow(a,1.0f/3));
        gb=pow(b,1.0f/3);
        printf("\n%ld %ld ",ga,gb);
        rs=(cubesS[(int)(gb)]%mod-cubesS[(int)ga-1]%mod)%mod;
        printf("%llu\n",(rs+mod)%mod);
    }
    return 0;
}

