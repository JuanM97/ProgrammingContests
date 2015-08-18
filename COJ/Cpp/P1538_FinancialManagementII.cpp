/* 
 * File:   P1538_FinancialManagementII.cpp
 * Author: JuanManuel
 *
 * Created on 27 de noviembre de 2014, 15:00
 */

#include <cstdio>
#define max 12;

int main(){
	int n;
	double total;
	
	scanf("%d",&n);
	
	for(int i = 0; i<n; i++){
		total = 0.0;
		for(int j = 0; j<12; j++){
			double aux;
			scanf("%lf",&aux);
			total+=aux;
		}
		total/=12;
		printf("%d ",i+1);
		
		int residuo = int(total/1000);
		
		if(residuo>=1){
			printf("$%d,%.2lf\n",residuo,total-(residuo*1000));
		}else{
                    printf("$%.2lf\n",total);
		}
	}

}

