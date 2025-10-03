#include<iostream>
using namespace std;
int main() {
    int n;
    cout << "enter number ";
    cin>>n;

    if ( n%5==0 || n%3==0) {
        cout<<"divisoble by 5 or 3";
        }
        else if (n%15!=0){
            cout << " but not by 15";
        }
        else {
            cout << "not divisible by 5 or 3 ";
        }
    }