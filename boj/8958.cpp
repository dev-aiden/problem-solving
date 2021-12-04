#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; for (cin >> n; n--;) {
        string s; cin >> s;
        int len = s.length();
        int ans = 0, score = 1;
        for (int i = 0; i < len; ++i) {
            if (s[i] == 'O') ans += score++;
            else score = 1;
        }
        cout << ans << "\n";
    }
    return 0;
}
