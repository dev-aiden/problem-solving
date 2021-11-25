#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int num; cin >> num;
    if (!(num % 4) && (num % 100 || !(num % 400))) cout << 1 << "\n";
    else cout << 0 << "\n";
    return 0;
}
