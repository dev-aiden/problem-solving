#include <iostream>
#include <algorithm>

using namespace std;

struct Person {
    int age;
    string name;
};

Person arr[100003];

bool cmp(const Person& u, const Person& v) {
    return u.age < v.age;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 0; i < n; ++i) cin >> arr[i].age >> arr[i].name;
    stable_sort(arr, arr + n, cmp);
    for (int i = 0; i < n; ++i) cout << arr[i].age << " " << arr[i].name << "\n";
    return 0;
}
