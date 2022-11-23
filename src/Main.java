public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g");
        System.out.println(phone.weight);

        MobilePhone oldPhone = new MobilePhone("4000g");
        System.out.println(oldPhone.weight);

        MobilePhone smartPhone = new MobilePhone ("20g");
        System.out.println(smartPhone.weight);
    }
}
class MobilePhone {
    String weight;
    public MobilePhone(String weight) {
        this.weight = weight;
    }

}
