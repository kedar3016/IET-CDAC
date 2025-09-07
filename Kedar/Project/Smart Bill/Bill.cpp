#include <iostream>
#include <vector>
using namespace std;

class Item
{

    int itemId;
    string itemName;
    double price;
    int stockQnty;

public:
    Item();
    Item(int, string, double, int);
    void setItemId(int);
    void setItemName(string);
    void setPrice(double);
    void setStockQnty(int);
    int getItemId();
    string getItemName();
    double getPrice();
    int getStockQnty();
    void acceptItem();
    void display();
};
Item::Item()
{
    itemId = 0;
    itemName = "null";
    price = 0;
    stockQnty = 0;
}
Item::Item(int itemid, string itemnm, double p, int stQty)
{
    if (p < 0) throw invalid_argument("Price cannot be negative!");
    if (stQty < 0) throw invalid_argument("Stock quantity cannot be negative!");
    itemId = itemid;
    itemName = itemnm;
    price = p;
    stockQnty = stQty;
}
void Item::setItemId(int Id)
{
    itemId = Id;
}
void Item::setItemName(string Name)
{
    itemName = Name;
}
void Item::setPrice(double p)
{
    if (p < 0) throw invalid_argument("Price cannot be negative!");
    price = p;
}
void Item::setStockQnty(int stQnty)
{
    if (stQnty < 0) throw invalid_argument("Stock quantity cannot be negative!");
    stockQnty = stQnty;
}
int Item::getItemId()
{
    return itemId;
}
string Item::getItemName()
{
    return itemName;
}
double Item::getPrice()
{
    return price;
}
int Item::getStockQnty()
{
    return stockQnty;
}
void Item::acceptItem()
{

    cout << "\nEnter the Items Details";
    cout << "\nEnter the Item Id : ";
    cin >> itemId;
    cout << "\nEnter the Item Name : ";
    cin >> itemName;
    cout << "\nEnter the Item Price : ";
    cin >> price;
    cout << "\nEnter the Stock Quantity : ";
    cin >> stockQnty;
}
void Item::display()
{
    cout << "\n\nItem Information";

    cout << "\n\nItem Id : " << itemId;
    cout << "\nItem Name : " << itemName;
    cout << "\nItem Price : " << price;
    cout << "\nStock Quantity : " << stockQnty;
}

class Bill
{
    int billID;
    string customerName;
    vector<Item> listOfPurchasedItems;

public:
    Bill()
    {
        billID = 0;
        customerName = "Null";

    }
    Bill(int bId, string cName, Item list)
    {
        billID = bId;
        customerName = cName;
        listOfPurchasedItems.push_back(list);
    }
    void setBillId(int bid)
    {
        billID = bid;
    }
    void setCustomerName(string cName)
    {
        customerName = cName;
    }
    void setPurchasedList(Item lst)
    {
        listOfPurchasedItems.push_back(lst);
    }
    int getBillId()
    {
        return billID;
    }
    string getCustomerName()
    {
        return customerName;
    }
    vector<Item> getPurchasedList()
    {
        return listOfPurchasedItems;
    }
    void displayBill(){
        if(listOfPurchasedItems.empty()){
            throw runtime_error("Bill is empty! Cannot display.");
        }
        cout<<"\nBill ID: "<<billID;
        cout<<"\nCustomer Name : "<<customerName;
        cout<<"\n----------------------------------------------------";
        double total = 0;
        for(Item &it : listOfPurchasedItems){
            it.display();
            total = total + it.getPrice();
        }

        cout<<"\n\nTotal : "<<total;
        cout<<"\n-----------Thank You Visting!!!-----------------------";


    }
};
int main()
{
    Item it;
    Bill b1;
    int ch;

    do{
        cout<<"\n1:Add Item";
        cout<<"\n2:display Item";
        cout<<"\n3:Add Item to Bill";
        cout<<"\n0:Exit";
        cout<<"\n\nEnter Your Choice: ";
        cin>>ch;
        switch (ch)
        {
        case 1:it.acceptItem();
            break;
            
        case 2:it.display();
        break;
        case 3:b1.displayBill();
        break;
        case 0:break;
        
        default:
            break;
        }

    }while(ch != 0);

    return 0;
}