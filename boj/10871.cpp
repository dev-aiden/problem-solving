#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, x; for (cin >> n >> x; n--;) {
        int num; cin >> num;
        if (num < x) cout << num << " ";
    }
    cout << "\n";
    return 0;
}
