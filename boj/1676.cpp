#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    int twoCount = 0, fiveCount = 0;
    for (int i = n; i >= 1; --i) {
        int temp = i;
        while (temp % 2 == 0) {
            temp /= 2;
            ++twoCount;
        }
        while (temp % 5 == 0) {
            temp /= 5;
            ++fiveCount;
        }
    }
    cout << ((twoCount < fiveCount) ? twoCount : fiveCount) << "\n";
    return 0;
}
