#include <iostream>

using namespace std;

int arr[26];

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    for (int i = 0; s[i]; ++i) ++arr[s[i] - 97];
    for (int i = 0; i < 26; ++i) cout << arr[i] << " ";
    cout << "\n";
    return 0;
}
