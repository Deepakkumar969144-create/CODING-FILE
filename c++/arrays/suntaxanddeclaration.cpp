#include<iostream>
#include<cmath>
using namespace std;
int main() {
    // Declaration of an integer array of size 5
    int arr[5];

    // Input elements
    cout << "Enter 5 elements: ";
    for (int i = 0; i < 5; i++) {
        cin >> arr[i];
    }

    // Output elements
    cout << "Array elements are: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    // Output elements multiplied by 2
    cout << "Array elements multiplied by 2 are: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] * 2 << " ";
    }
    cout << endl;

    return 0;
}
