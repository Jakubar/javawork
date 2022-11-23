public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 5000);
        System.out.println(phone.weight + " " + phone.price);
        phone.displayValues();
        String parameters = phone.getParameters();
        System.out.println(parameters);
    }
}
class MobilePhone {
    String weight;
    int price;
    public MobilePhone(String weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public void displayValues() {
        System.out.println(this.weight + " " + this.price);
    }

    public String getParameters() {
        return this.weight + " " + this.price;
    }

}
