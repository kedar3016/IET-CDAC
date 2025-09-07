#include <iostream>
#include <fstream>
#include <cstring>
using namespace std;

#define MAX_ITEMS 50
#define MAX_BILL_ITEMS 20

class Item {
private:
    int itemID;
    char itemName[50];
    double price;
    int stockQnty;

public:
    Item() {
        itemID = 0;
        strcpy(itemName, "");
        price = 0.0;
        stockQnty = 0;
    }

    void addItem() {
        cout << "Enter Item ID: ";
        cin >> itemID;
        cin.ignore();
        cout << "Enter Item Name: ";
        cin.getline(itemName, 50);
        cout << "Enter Price: ";
        cin >> price;
        cout << "Enter Stock Quantity: ";
        cin >> stockQnty;
    }

    void displayItem() {
        cout << "ID: " << itemID << ", Name: " << itemName
             << ", Price: " << price << ", Stock: " << stockQnty << endl;
    }

    int getID() { return itemID; }
    const char* getName() { return itemName; }
    double getPrice() { return price; }
    int getStock() { return stockQnty; }

    void reduceStock(int qty) {
        if (qty <= stockQnty)
            stockQnty -= qty;
        else
            throw invalid_argument("Not enough stock!");
    }
};

class Bill {
private:
    static int nextBillID;
    int billID;
    char customerName[50];
    Item purchasedItems[MAX_BILL_ITEMS];
    int purchasedCount;

public:
    Bill() {
        billID = ++nextBillID;
        strcpy(customerName, "");
        purchasedCount = 0;
    }

    void setCustomerName() {
        cout << "Enter Customer Name: ";
        cin.ignore();
        cin.getline(customerName, 50);
    }

    void addPurchasedItem(Item &item, int qty) {
        if (purchasedCount >= MAX_BILL_ITEMS)
            throw runtime_error("Bill item limit reached!");

        if (item.getStock() < qty)
            throw runtime_error("Not enough stock!");

        item.reduceStock(qty);

        // Add qty times in purchased list
        for (int i = 0; i < qty; i++) {
            purchasedItems[purchasedCount] = item;
            purchasedCount++;
        }
    }

    void displayBill() {
        cout << "\n========== BILL ==========\n";
        cout << "Bill ID: " << billID << "\nCustomer: " << customerName << "\n";
        double total = 0.0;
        for (int i = 0; i < purchasedCount; i++) {
            cout << purchasedItems[i].getID()
                 << " - " << purchasedItems[i].getName()
                 << " - Rs." << purchasedItems[i].getPrice() << endl;
            total += purchasedItems[i].getPrice();
        }
        cout << "--------------------------\n";
        cout << "Total Amount: Rs." << total << endl;
        cout << "==========================\n";
    }
};
int Bill::nextBillID = 0;

int main() {
    Item store[MAX_ITEMS];
    int itemCount = 0;
    Bill bill;
    int choice;

    do {
        cout << "\n==== Tech Store Menu ====\n";
        cout << "1. Manager: Add Item\n";
        cout << "2. Display Store Items\n";
        cout << "3. Customer Purchase\n";
        cout << "4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
        case 1: { // Manager adds item
            if (itemCount >= MAX_ITEMS) {
                cout << "Store full!\n";
                break;
            }
            store[itemCount].addItem();
            itemCount++;
            break;
        }
        case 2: { // Display items
            cout << "\nItems in Store:\n";
            for (int i = 0; i < itemCount; i++) {
                store[i].displayItem();
            }
            break;
        }
        case 3: { // Customer purchase
            if (itemCount == 0) {
                cout << "No items available in store.\n";
                break;
            }

            Bill newBill;
            newBill.setCustomerName();

            int id, qty;
            char more = 'y';
            while (more == 'y' || more == 'Y') {
                cout << "\nAvailable Items:\n";
                for (int i = 0; i < itemCount; i++) {
                    store[i].displayItem();
                }

                cout << "Enter Item ID to purchase: ";
                cin >> id;
                cout << "Enter Quantity: ";
                cin >> qty;

                bool found = false;
                for (int i = 0; i < itemCount; i++) {
                    if (store[i].getID() == id) {
                        try {
                            newBill.addPurchasedItem(store[i], qty);
                            cout << "Item added to bill!\n";
                        } catch (exception &e) {
                            cout << e.what() << endl;
                        }
                        found = true;
                        break;
                    }
                }
                if (!found)
                    cout << "Item not found!\n";

                cout << "Add more items? (y/n): ";
                cin >> more;
            }

            newBill.displayBill();
            break;
        }
        case 4:
            cout << "Exiting...\n";
            break;

        default:
            cout << "Invalid choice!\n";
        }
    } while (choice != 4);

    return 0;
}
