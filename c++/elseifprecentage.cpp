#include<iostream>
using namespace std;
int main() {
    int n;
    cout <<" inter percentage : ";
    cin >>n;
    if (n>81 and n<100) {
        cout << "very good" ;

    }
    else if (n>61 ) {
        cout <<"good ";

    }
    else if (n>41) {
        cout <<" average ";

    }
    else { cout <<"fail";}

}