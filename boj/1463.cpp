#include <iostream>

using namespace std;

int d[1000003];

int op(int num) {
    if (num == 1) return 0;
    if (d[num] > 0) return d[num];
    d[num] = op(num - 1) + 1;
    if (num % 2 == 0) {
        int temp = op(num / 2) + 1;
        if (d[num] > temp) d[num] = temp;
    }
    if (num % 3 == 0) {
        int temp = op(num / 3) + 1;
        if (d[num] > temp) d[num] = temp;
    }
    return d[num];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    cout << op(n) << "\n";
    return 0;
}
