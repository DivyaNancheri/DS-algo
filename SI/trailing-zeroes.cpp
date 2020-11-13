#include <iostream>
using namespace std;

int main() {
    
    long long int n,c=0;
    scanf("%lld",&n);
    unsigned long long int i=5;
    while(n/i){
        c+=n/i;
        i=i*5;
    }
    printf("%lld\n",c);
    
    return 0;
}