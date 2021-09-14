#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    if (n == 1) {
        cout << "*\n";
        return 0;
    }
    for (int i = 0; i < n - 1; ++i) {
        for (int j = i; j < n - 1; ++j) cout << " ";
        cout << "*";
        if (i != 0) {
            for (int j = 0; j < i * 2 - 1; ++j) cout << " ";
            cout << "*";
        }
        cout << "\n";
    }
    for (int j = 0; j < n * 2 - 1; ++j) cout << "*";
    cout << "\n";
    return 0;
}
