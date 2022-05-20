#include <iostream>

using namespace std;

int arr[13];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    string s; cin >> s;
    int len = s.length(), sum = 0;
    for(int i = 0; i < len; ++i) {
        sum += s[i] - '0';
        ++arr[s[i] - '0'];
    }
    if(arr[0] == 0 || (sum % 3 != 0)) {
        cout << -1;
    } else {
        for(int i = 9; i >= 0; --i) {
            for(int j = 0; j < arr[i]; ++j) {
                cout << i;
            }
        }
    }
    cout << "\n";
    return 0;
}