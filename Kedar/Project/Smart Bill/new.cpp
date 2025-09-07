#include <iostream>
#include <fstream>
#include <cstring>
using namespace std;

const int MAX_ITEMS = 50;
const int MAX_BILL_ITEMS = 20;

class Item {
public:
    int itemID;
    char itemName[50];
    double price;
    int stockQuantity;

    Item() {
        itemID = 0;
        strcpy(itemName, "");
        price = 0.0;
        stockQuantity = 0;
    }

    void input() {
        cout << "Enter item ID: ";
        cin >> itemID;
        cin.ignore();
        cout << "Enter item Name: ";
        cin.getline(itemName, 50);
        cout << "Enter price: ";
        cin >> price;
        if (price < 0) throw "Price cannot be negative!";
        cout << "Enter stock quantity: ";
        cin >> stockQuantity;
        if (stockQuantity < 0) throw "Stock quantity cannot be negative!";
    }

    void display() {
        cout << "ID: " << itemID << ", Name: " << itemName << ", Price: " << price << ", Stock: " << stockQuantity << "\n";
    }
};

class Bill {
private:
    int billID;
    char customerName[50];
    Item purchasedItems[MAX_BILL_ITEMS];
    int purchasedCount;

public:
    Bill() {
        billID = 0;
        strcpy(customerName, "");
        purchasedCount = 0;
    }

    void setBillDetails() {
        cout << "Enter Bill ID: ";
        cin >> billID;
        cin.ignore();
        cout << "Enter Customer Name: ";
        cin.getline(customerName, 50);
    }

    Bill& operator+(Item item) {
        if (purchasedCount >= MAX_BILL_ITEMS) {
            throw "Bill item limit reached!";
        }
        if (item.stockQuantity <= 0) {
            throw "Item out of stock!";
        }
        purchasedItems[purchasedCount] = item;
        purchasedCount++;
        return *this;
    }

    friend ostream& operator<<(ostream& os, Bill& bill) {
        if (bill.purchasedCount == 0) {
            throw "Cannot generate an empty bill!";
        }
        os << "Bill ID: " << bill.billID << "\nCustomer: " << bill.customerName << "\nItems Purchased:\n";
        double total = 0.0;
        for (int i = 0; i < bill.purchasedCount; i++) {
            os << "Item ID: " << bill.purchasedItems[i].itemID
               << ", Name: " << bill.purchasedItems[i].itemName
               << ", Price: " << bill.purchasedItems[i].price << "\n";
            total += bill.purchasedItems[i].price;
        }
        os << "Total Amount: " << total << "\n";
        return os;
    }

    void saveBillToFile() {
        ofstream fout("bills.txt", ios::app);
        if (!fout) {
            cout << "Error opening file for writing.\n";
            return;
        }
        fout << billID << "\n" << customerName << "\n" << purchasedCount << "\n";
        for (int i = 0; i < purchasedCount; i++) {
            fout << purchasedItems[i].itemID << "," 
                 << purchasedItems[i].itemName << "," 
                 << purchasedItems[i].price << "\n";
        }
        fout << "###\n";
        fout.close();
    }

    void loadBillsFromFile() {
        ifstream fin("bills.txt");
        if (!fin) {
            cout << "No previous bills found.\n";
            return;
        }
        cout << "Previous Bills:\n";
        string line;
        while (getline(fin, line)) {
            if (line == "###") {
                cout << "----------------------------\n";
                continue;
            }
            cout << line << "\n";
        }
        fin.close();
    }

    bool isEmpty() {
        return purchasedCount == 0;
    }
};

int main() {
    Item storeItems[MAX_ITEMS];
    int itemCount = 0;
    Bill bill;
    bool billCreated = false;

    try {
        bill.loadBillsFromFile();

        int choice;
        do {
            cout << "\nMENU:\n";
            cout << "1. Add item to store catalog\n";
            cout << "2. Create new bill\n";
            cout << "3. Purchase item\n";
            cout << "4. Display current bill\n";
            cout << "5. Save bill and exit\n";
            cout << "6. Exit without saving\n";
            cout << "Enter your choice: ";
            cin >> choice;
            cin.ignore();

            switch (choice) {
                case 1: {
                    if (itemCount >= MAX_ITEMS) {
                        cout << "Store catalog full. Cannot add more items.\n";
                        break;
                    }
                    cout << "Adding item to store catalog:\n";
                    storeItems[itemCount].input();
                    itemCount++;
                    cout << "Item added successfully.\n";
                    break;
                }
                case 2: {
                    if (billCreated && !bill.isEmpty()) {
                        cout << "A bill is already created. Save or exit it before creating a new one.\n";
                        break;
                    }
                    bill = Bill();
                    bill.setBillDetails();
                    billCreated = true;
                    cout << "Bill created. You can now purchase items.\n";
                    break;
                }
                case 3: {
                    if (!billCreated) {
                        cout << "Create a bill first (option 2).\n";
                        break;
                    }
                    if (itemCount == 0) {
                        cout << "No items available in store catalog.\n";
                        break;
                    }
                    cout << "Enter item ID to purchase: ";
                    int purchaseID;
                    cin >> purchaseID;
                    bool found = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (storeItems[i].itemID == purchaseID) {
                            found = true;
                            if (storeItems[i].stockQuantity <= 0) {
                                cout << "Selected item is out of stock!\n";
                                break;
                            }
                            bill = bill + storeItems[i]; // Add to bill
                            storeItems[i].stockQuantity--; // Reduce stock
                            cout << "Item added to bill.\n";
                            break;
                        }
                    }
                    if (!found) {
                        cout << "Item ID not found in store catalog.\n";
                    }
                    break;
                }
                case 4: {
                    if (!billCreated || bill.isEmpty()) {
                        cout << "No purchases made yet.\n";
                        break;
                    }
                    cout << "\nCurrent Bill:\n";
                    cout << bill;
                    break;
                }
                case 5: {
                    if (!billCreated || bill.isEmpty()) {
                        cout << "No bill to save.\n";
                        break;
                    }
                    bill.saveBillToFile();
                    cout << "Bill saved successfully. Exiting...\n";
                    choice = 6; // exit loop
                    break;
                }
                case 6: {
                    cout << "Exiting without saving.\n";
                    break;
                }
                default:
                    cout << "Invalid choice. Try again.\n";
            }
        } while (choice != 6);
    }
    catch (const char* msg) {
        cout << "Error: " << msg << "\n";
    }
    catch (...) {
        cout << "Unknown error occurred.\n";
    }

    return 0;
}
