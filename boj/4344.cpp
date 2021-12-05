#include <iostream>

using namespace std;

int arr[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int c; for (cin >> c; c--;) {
        int n; cin >> n;
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            cin >> arr[i];
            sum += arr[i];
        }
        double avg = (double)sum / n;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] > avg) ++count;
        }
        cout << fixed;
        cout.precision(3);
        cout << (double)count / n * 100 << "%\n";
    }
    return 0;
}
