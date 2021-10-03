#include <iostream>

using namespace std;

int p[1003], d[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) cin >> p[i];
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= i; ++j) {
            int temp = d[i - j] + p[j];
            if(d[i] < temp) d[i] = temp;
        }
    }
    cout << d[n] << "\n";
    return 0;
}
