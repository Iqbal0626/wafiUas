package VendingMechine;
 
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author M WAFIYUL AHDI
 */
public class Main {
    private Drink juice, coffee, water, soda;
    private Drink[] drinks = new Drink[4];
 
    private double totalPrice = 0;
 
    public Main() {
        this.juice = new Drink("Juice", 10000);
        this.coffee = new Drink("Coffee", 7000);
        this.water = new Drink("Water", 5000);
        this.soda = new Drink("Soda", 13000);
 
        this.drinks[0] = this.juice;
        this.drinks[1] = this.coffee;
        this.drinks[2] = this.water;
        this.drinks[3] = this.soda;
    }
 
    public Drink getMenu(int id) {
        return this.drinks[id - 1];
    }
 
    public double getTotalPrice() {
        return this.totalPrice;
    }
 
    public void selectJuice() {
        if (this.water.getAmount() == 1) {
            this.totalPrice = this.totalPrice + juice.getAmount() * (juice.getPrice() * (100 - 1) / 100);
        } else {
            this.totalPrice = this.totalPrice + juice.getPrice() * juice.getAmount();
        }
    }
 
    public void selectCoffee() {
        if (this.juice.getAmount() == 3) {
            this.totalPrice = this.totalPrice + coffee.getAmount() * (coffee.getPrice() * (100 - 3) / 100);
        } else if (this.water.getAmount() == 1) {
            this.totalPrice = this.totalPrice + coffee.getAmount() * (coffee.getPrice() * (100 - 0.3) / 100);
        } else {
            this.totalPrice = this.totalPrice + coffee.getPrice() * coffee.getAmount();
        }
    }
 
    public void selectWater() {
        if (coffee.getAmount() == 3 && soda.getAmount() == 3) {
            this.totalPrice = this.totalPrice + water.getAmount() * (water.getPrice() * (100 - 9) / 100);
        } else {
            this.totalPrice = this.totalPrice + water.getPrice() * water.getAmount();
        }
    }
 
    public void selectSoda() {
        if (this.water.getAmount() == 1) {
            this.totalPrice = this.totalPrice + this.soda.getAmount() * (soda.getPrice() * (100 - 0.3) / 100);
        } else {
            this.totalPrice = this.totalPrice + soda.getPrice() * this.soda.getAmount();
        }
    }
 
    public void printMenu() {
        System.out.println("Menu Minuman : ");
        System.out.println("_________________________________");
        System.out.println("No Nama             Harga");
 
        for (int i = 0; i < this.drinks.length; i++) {
            System.out.println((i + 1) + ". " + this.drinks[i].getName() + "          Rp " + this.drinks[i].getPrice());
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        Main app = new Main();
        app.printMenu();
 
        for (String i = "Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("_________________________________");
            // pengguna memasukkan nomor pesanan
            System.out.print("Masukkan Nomor Pesanan : ");
            int inNomor = scan.nextInt();
            Drink selectedDrink = app.getMenu(inNomor);
 
            System.out.println("Berapa jumlah yang akan anda beli : ");
            int jumlahBeli = scan.nextInt();
            selectedDrink.setAmount(jumlahBeli);
 
            System.out.println("___________________________________________________________________");
            System.out.println("Minuman yang anda pilih adalah " + selectedDrink.getName());
 
            if (selectedDrink.getName().equals("Juice")) {
                // jika nomor satu, maka minuman yang dipilih adalah Jus
                app.selectJuice();
            } else if (selectedDrink.getName().equals("Coffee")) {
                // jika nomor dua, maka minuman yang dipilih adalah Teh
                app.selectCoffee();
            } else if (selectedDrink.getName().equals("Water")) {
                // jika nomor tiga, maka minuman yang dipilih adalah Aqua
                app.selectWater();
            } else if (selectedDrink.getName().equals("Soda")) {
                // jika nomor tiga, maka minuman yang dipilih adalah Aqua
                app.selectSoda();
            }
 
            // User diperintahkan untuk memilih lagi atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();
        }
 
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " + app.getTotalPrice() + ".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}