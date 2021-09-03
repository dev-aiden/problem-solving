#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int min = 1000003, max = -1000003;
    for (int i = 0; i < n; ++i) {
        int num; cin >> num;
        if (num < min) min = num;
        if (num > max) max = num;
    }
    cout << min << ' ' << max << '\n';
    return 0;
}
