include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int tc;
    scanf("%d",&tc);
    while(tc--){
        int n;4s
        scanf("%d",&n);
        int i,j,k,c=0,p=0;
        vector<long int> a(n);
        for(i=0;i<n;i++){
            scanf("%ld",&a[i]);
        }
        sort(a.begin(),a.end());
        for (i = 0; i < n; i++){
		    j=i+1;c=0;
		    while(c++!=1){
                if(a[i]==a[j])
                    printf("%ld ",a[i]);
		    }
	   }
        printf("\n");
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}