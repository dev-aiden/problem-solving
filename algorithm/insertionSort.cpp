#include <iostream>
#include <vector>

using namespace std;

void insertionSortAscending(vector<int> v) {
    int size = v.size();
    int index, key;

    for (int i = 1; i < size; ++i) {
        index = i;
        key = v[i];
        for (int j = i - 1; j >= 0; --j) {
            if (key < v[j]) {
                v[j + 1] = v[j];
                index = j;
            }
        }
        v[index] = key;
    }

    cout << "오름차순 정렬 후 : ";
    for (int i = 0; i < 5; ++i) cout << v[i] << " ";
    cout << '\n';
}

void insertionSortDescending(vector<int> v) {
    int size = v.size();
    int index, key;

    for (int i = 1; i < size; ++i) {
        index = i;
        key = v[i];
        for (int j = i - 1; j >= 0; --j) {
            if (key > v[j]) {
                v[j + 1] = v[j];
                index = j;
            }
        }
        v[index] = key;
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

    insertionSortAscending(v);
    insertionSortDescending(v);

    return 0;
}
