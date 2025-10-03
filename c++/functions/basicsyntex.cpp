#include<iostream>
using namespace std;
    // void usa() { //function
    //     cout<<"you are is usa" <<endl;
    // }
   
    // void india() { // function
    //     cout<<"you are in india "<<endl;
    // }
    
    // int main() {
    //     usa();  //function 
    //     cout<<"you are in main"<<endl;
    //     india();  //function
    // }


    // void greet() { 
    //     cout<<"good morning"<<endl;
    //     cout<<"how are you?"<<endl;
    // }
    // int main() {
    //     greet();
    //     cout<<"hey"<<endl;
    //     greet();
    // }

    void usa(){
        cout<<"you are in usa"<<endl;
        return;

    }
    void india(){
        cout<<"you are inindia"<<endl;
        usa();
    }
    int main(){
        cout<<"you are in main"<<endl;
        india();

    }