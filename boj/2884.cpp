#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int h, m; cin >> h >> m;
    int temp = h * 60 + m - 45;
    if (temp < 0) temp = 1440 + temp;
    cout << temp / 60 << " " << temp % 60;
    return 0;
}
