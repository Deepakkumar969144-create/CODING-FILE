#include <iostream>
using namespace std;

int main() {
    int rows = 3, cols = 3;
    int arr[3][3] = {
        {9, 3, 6},
        {1, 5, 9},
        {7, 2, 8}
    };

    int product = 1;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            product *= arr[i][j];
        }
    }
    cout << "Product of all elements: " << product << endl;
    return 0;
}