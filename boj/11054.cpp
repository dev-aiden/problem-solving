#include <iostream>

using namespace std;

int n;
int a[1003], d1[1003], d2[1003];

int solve1(int num) {
    if (d1[num] > 0) return d1[num];
    d1[num] = 1;
    for (int i = num - 1; i >= 1; --i) {
        if (a[num] > a[i] && d1[num] < solve1(i) + 1) d1[num] = d1[i] + 1;
    }
    return d1[num];
}

int solve2(int num) {
    if (d2[num] > 0) return d2[num];
    d2[num] = 1;
    for (int i = num + 1; i <= n; ++i) {
        if (a[num] > a[i] && d2[num] < solve2(i) + 1) d2[num] = d2[i] + 1;
    }
    return d2[num];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin >> n;
    d1[1] = 1; d2[n] = 1;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i];
        solve1(i);
    }
    int ans = 0;
    for (int i = n; i >= 1; --i) {
        solve2(i);
        int temp = d1[i] + d2[i] - 1;
        if (ans < temp) ans = temp;
    }
    cout << ans << "\n";
    return 0;
}
