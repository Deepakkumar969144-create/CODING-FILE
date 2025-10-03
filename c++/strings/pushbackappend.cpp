#include<iostream>
#include<cmath>
using namespace std;
int main() {
    string s="raghav garg ";
    cout<<s<<endl;
    s.push_back('a');
    cout<<s<<endl;
}

//   and 
int main() {
    string s="raghav ";
    cout <<s<<endl;
    s.push_back('a');
    cout<<s<<endl;
    s.push_back('g');
    cout <<s<<endl;
}


//    and  yek word delet ho jayega 

int main() {
    string s=" raghav ";
    cout<<s<<endl;
     s.pop_back() ;
    cout <<s<<endl;
    
}

//     and yek sentace add saktee hai
 

int main () {
    string s= "raghav ";
    cout <<s<<endl;
    s.append("garg");
    cout <<s<<endl;

}

