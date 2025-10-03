#include<iostream>
#include<cmath>
using namespace std;
int main (){
    int arr[4][2] = { {76,45}, {37,47}, {76,98}, {67,89} } ;
    int mx= INT_MIN;
    for (int i=0; i<4; i++){
        for(int j=0; j<2; j++){
            mx = max(mx, arr[i][j]);
        }
    }
    cout <<mx;

}