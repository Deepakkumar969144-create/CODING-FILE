#include<iostream>
#include<cmath>
using namespace std;
// int main() {
//     int x=3;
//     cout<<&x<<endl;   // address  
// }

   //  and   m#1  -

// int main() {
//     int x=3;
//     int* p=&x;
//     cout<<&x<<endl;
//     cout<<p<<endl;
// }

//  and  m#3 -

int main() {
    int x=4;
    int* p= &x;
    cout <<&x << endl;
    cout<<p<<endl;
    cout<<*p<<endl;   //  star operator ya derefernce 
    cout << &p <<endl;

}