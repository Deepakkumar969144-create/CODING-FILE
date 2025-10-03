#include<iostream>

#include<cmath>
using namespace std;
// int main () {
//     int x=23 ;
//     int* ptr = &x;
//     cout << x<<endl;
//     *ptr = 34 ; 
//     cout <<x<<endl;

// }

//  pass by reference ka   M#2 -


    void swap(int* a, int * b) {
        int temp = *a ;
        *a =*b;
        *b = temp;

    }
 int main () {
    int x= 34;
    int y= 43;
    cout <<x << " " <<y << endl;
    swap (&x , &y ) ;
    cout <<x<<" " <<y<<endl;
 }