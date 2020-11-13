#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int tc,x,n;
    scanf("%d",&tc);
    for(x=1;x<=tc;x++){
        long long int s=0;
        scanf("%d",&n);
        vector<long long int> a(n);
        for(int i=0;i<n;i++){
            scanf("%lld",&a[i]);
            s+=a[i];
        }printf("%lld\n",s);
    }
     
    return 0;
}
