#include <iostream>
#include <vector>

using namespace std;

void selectionSortAscending(vector<int> v) {
    int size = v.size();

    for (int i = 0; i < size - 1; ++i) {
        for (int j = i + 1; j < size; ++j) {
            if (v[i] > v[j]) {
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
    }

    cout << "오름차순 정렬 후 : ";
    for (int i = 0; i < 5; ++i) cout << v[i] << " ";
    cout << '\n';
}

void selectionSortDescending(vector<int> v) {
    int size = v.size();

    for (int i = 0; i < size - 1; ++i) {
        for (int j = i + 1; j < size; ++j) {
            if (v[i] < v[j]) {
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
    }

    cout << "내림차순 정렬 후 : ";
    for (int i = 0; i < 5; ++i) cout << v[i] << " ";
    cout << '\n';
}

int main(void) {
    ios_base::sync_with_stdio(false);

    vector<int> v = { 5, 4, 1, 3, 2 };

    cout << "정렬 전 : ";
    for (int i = 0; i < 5; ++i) cout << v[i] << " ";
    cout << '\n';

    selectionSortAscending(v);
    selectionSortDescending(v);

    return 0;
}
