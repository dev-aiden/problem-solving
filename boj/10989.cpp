#include <iostream>

using namespace std;

int arr[10003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; for (cin >> n; n--;) {
        int num; cin >> num;
        ++arr[num];
    }
    for (int i = 1; i <= 10000; ++i) {
        for (int j = 0; j < arr[i]; ++j) {
            cout << i << "\n";
        }
    }
    return 0;
}
