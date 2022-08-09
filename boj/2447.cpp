#include <iostream>

using namespace std;

void solve(int r, int c, int size) {
    if(r / size % 3 == 1 && c / size % 3 == 1) cout << " ";
    else if(size / 3 == 0) cout << "*";
    else solve(r, c, size / 3);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) solve(i, j, n);
        cout << "\n";
    }
    cout << "\n";
    return 0;
}