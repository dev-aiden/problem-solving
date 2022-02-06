#include <iostream>

using namespace std;

int arr[103];

int main(void) {
    for(int i = 2; i <= 100; ++i) {
        if(!arr[i]) arr[i] = 1;
        for(int j = i * 2; j <= 100; j += i) {
            arr[j] = 2;
        }
    }

    for(int i = 2; i <= 100; ++i) {
        if(arr[i] == 1) cout << i << "\n";
    }
    return 0;
}