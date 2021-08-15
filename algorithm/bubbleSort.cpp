#include <iostream>
#include <vector>

using namespace std;

void bubbleSortAscending(vector<int> v) {
    int size = v.size() - 1;

    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size - i; ++j) {
            if (v[j] > v[j + 1]) {
                int temp = v[j];
                v[j] = v[j + 1];
                v[j + 1] = temp;
            }
        }
    }

    cout << "오름차순 정렬 후 : ";
    for (int i = 0; i < 5; ++i) cout << v[i] << " ";
    cout << '\n';
}

void bubbleSortDescending(vector<int> v) {
    int size = v.size() - 1;

    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size - i; ++j) {
            if (v[j] < v[j + 1]) {
                int temp = v[j];
                v[j] = v[j + 1];
                v[j + 1] = temp;
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

    bubbleSortAscending(v);
    bubbleSortDescending(v);


    return 0;
}
