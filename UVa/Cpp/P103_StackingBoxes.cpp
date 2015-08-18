/* 
 * File:   P103_StackingBoxes.cpp
 * Author: JuanM
 *
 * Created on May 28, 2014, 5:30 PM
 */

#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <cstring>
#include <vector>
using namespace std;
//Didn't Work ):
struct box{
    int id;
    int dim[11];
}bx[32];

vector<int>v;
vector<int>lis;
int n,d;

bool comp(int a,int b){
    for(int i=0;i<d;i++){
        if(bx[a].dim[i]<=bx[b].dim[i])return false;
    }
    return true;
}

/* Finds longest strictly increasing subsequence. O(n log k) algorithm. */
void find_lis(vector<int> &a, vector<int> &b){
	vector<int> p(a.size());
	int u, v;
	if (a.empty()) return;
	b.push_back(0);
	for (size_t i = 1; i < a.size(); i++){
                // If next element a[i] is greater than last element of current longest subsequence a[b.back()], just push it at back of "b" and continue
		if (comp(a[b.back()],a[i])){
			p[i] = b.back();
			b.push_back(i);
			continue;
		}
                // Binary search to find the smallest element referenced by b which is just bigger than a[i]
                // Note : Binary search is performed on b (and not a). Size of b is always <=k and hence contributes O(log k) to complexity.    
		for (u = 0, v = b.size()-1; u < v;){
			int c = (u + v) / 2;
			if (comp(a[b[c]],a[i])) u=c+1; else v=c;
		}
                
                // Update b if new value is smaller then previously referenced value 
		if (comp(a[i],a[b[u]])){
			if (u > 0) p[i] = b[u-1];
			b[u] = i;
		}	
	}
	for (u = b.size(), v = b.back(); u--; v = p[v]) b[u] = v;
}

int main() {
    
    while(scanf("%d %d",&n,&d)!=EOF){
        for(int i=0;i<n;i++){
            bx[i].id=i+1;
            for(int j=0;j<d;j++){
                scanf("%d",&bx[i].dim[j]);
            }
            sort(bx[i].dim,bx[i].dim+d);
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(comp(i,j))swap(bx[i],bx[j]);
            }
        }
        v.clear();
        lis.clear();
        for(int i=0;i<n;i++){
            v.push_back(i);
        }
        
        find_lis(v,lis);
        printf("%d\n",lis.size());
        for(int i = 0;i<lis.size();i++)
		printf("%d ", lis[i]);
        printf("\n");
        
        /*
        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                printf("%d ",bx[i].dim[j]);
            }printf("\n");
        }*/
    }
    return 0;
}

