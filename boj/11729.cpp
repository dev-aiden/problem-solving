#include <iostream>
#include <cmath>

using namespace std;

void solve(int n, int start, int end) {
    if (n == 0) return;
    solve(n - 1, start, 6 - start - end);
    cout << start << " " << end << "\n";
    solve(n - 1, 6 - start - end, end);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    cout << (int)pow(2, n) - 1 << "\n";
    solve(n, 1, 3);
    return 0;
}