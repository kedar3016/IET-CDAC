
#include <iostream>
#include <fstream>
#include<string.h>
using namespace std; 
int main() {

    //creating a new file


//    // opening a text file for writing
//     ofstream my_file("exam1.txt");
//     if (!my_file) {
//         cout << "Error opening the file." << endl;
//     // terminate the main() function
//     }
//     else{
//         cout<<"\nFile Created Successfully!!";
//     }
//     my_file.close();

//
    ifstream fin("exam1.txt");
    if (!fin) {
        cout << "Error opening the file." << endl;
    // terminate the main() function
    }
    else{
        cout<<"\nFile open Successfully!!";
    }


    cout<<"\nFile Data is :  \n";
    string line;
    while(!fin.eof()){
        getline(fin,line);
        cout<<line;
        }
    




    // close the file
    fin.close();
    return 0;
}