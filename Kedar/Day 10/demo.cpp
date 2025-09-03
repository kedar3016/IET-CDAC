#include <iostream>
#include <string>
using namespace std;


void modifyString(string& str) {
    str += " world!";
}

int main() {
    string text = "Hello";
    modifyString(text);
    cout << text << endl; // Output: Hello world!
}
