// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //        MyArray myArray = new MyArray();

        Sale sale1 = new Sale(new Customer("Dara", "Premium"), "2024-02-21");
        Sale sale2 = new Sale(new Customer("Nita", "Gold"), "2024-02-21");
        Sale sale3 = new Sale(new Customer("Daro", "Silver"), "2024-02-21");
        Sale sale4 = new Sale(new Customer("Vith", "Normal"), "2024-02-21");

        sale1.setServiceExpense(15);
        sale1.setProductExpense(20);

        sale2.setServiceExpense(15);
        sale2.setProductExpense(20);

        sale3.setServiceExpense(15);
        sale3.setProductExpense(20);

        sale4.setServiceExpense(15);
        sale4.setProductExpense(20);

        sale1.DisplayInfo();
        sale2.DisplayInfo();
        sale3.DisplayInfo();
        sale4.DisplayInfo();
    }
}
