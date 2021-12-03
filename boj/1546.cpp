#include <iostream>

using namespace std;

int arr[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, m = -1; cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
        if (m < arr[i]) m = arr[i];
    }
    double sum = 0;
    for (int i = 0; i < n; ++i) sum += (double)arr[i] / m * 100;
    cout << fixed;
    cout.precision(2);
    cout << sum / n << "\n";
    return 0;
}
