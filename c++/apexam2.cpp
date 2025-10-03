#include<iostream>
using namespace std;
int main() {
    int n;
    cout<<"enter n: ";
    cin>>n;
    // an=3*n+1
    
    // int a=4;
    // for (int i=1; i<=n; i++) {
    //     cout <<a <<" ";
    //     a=a+3;
    
    // }

    for(int i=4; i<=3*n+1; i+=3) {
        cout <<i<<" ";

    }

}