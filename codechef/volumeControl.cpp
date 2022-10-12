#include <iostream>
using namespace std;

int main() {
    int i ;
    cin >> i;
    while(i>0){
        int a ,b;
        cin >> a >>b;
        int min = a - b;
        if(min < 0){
            min = min*(-1);
        }
        cout << min << endl;
        i--;
    }
	return 0;
}
