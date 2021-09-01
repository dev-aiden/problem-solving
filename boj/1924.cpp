#include <iostream>
#include <vector>

using namespace std;

vector<int> date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
vector<string> day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

int main(void) {
    ios_base::sync_with_stdio(false);
    int x, y; cin >> x >> y;
    int sum = 0;
    for (int i = 1; i < x; ++i) sum += date[i - 1];
    sum += y;
    cout << day[sum % 7] << '\n';
    return 0;
}
