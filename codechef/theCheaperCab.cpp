#include <bits/stdc++.h>
using namespace std;
int m=1e9+7;
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
typedef long long int ll;
int main() {
	fast;
	int t;
	cin>>t;
	while(t--){
	    int n,k;
	    cin>>n>>k;
	    if(n==k) cout<<"ANY\n";
	    else if(n>k) cout<<"SECOND\n";
	    else cout<<"FIRST\n";
	}
	return 0;
}
