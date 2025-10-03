#include<iostream>
#include<cmath>
using namespace std;
// int main() {
//     int x=2;
//     int y=5;
//     cout<<x<<" "<<y<<endl;
//     int temp= x;
//     x=y;
//     y=temp;
//     cout<<x<<" "<<y<<endl;

// }
   
   //and M#2 
   
//    int main() {
//     int x=12;
//     int y=45;
//     cout <<x<<" "<<y<<endl;
//     x=x+y;
//     y=x-y;
//     x=x-y;
//     cout <<x<< " " <<y<<endl;
//    }


   //  and M#3 pass by reference -


   void swap(int & x, int & y) {
    int temp=x;
    x=y;
    y=temp;
   }
   int main() {
    int x= 12 ;
    int y=45;
    cout<<x<<" "<<y<<endl;
    swap(x,y);
    cout<<x<<" "<<y<<endl;
   }
