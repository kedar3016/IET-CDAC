#include <iostream>
using namespace std;


int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}


int binomialCoefficient(int n, int k) {
    return factorial(n) / (factorial(k) * factorial(n - k));
}

int main() {
    int rows;

    cout << "Enter the number of rows for Pascal's Triangle: ";
    cin >> rows;

    for (int i = 0; i < rows; i++) {
        // Print spaces for pyramid alignment
        for (int j = 0; j < rows - i - 1; j++) {
            cout << "  ";
        }

        // Print Pascal's Triangle values
        for (int j = 0; j <= i; j++) {
            cout << binomialCoefficient(i, j) << "   ";
        }
        cout << endl;
    }

    return 0;
}
