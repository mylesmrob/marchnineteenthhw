package chapter6;

public class PhoneProblemMain {

    public static void main(String[] args) {
        PhoneProblemBill bobby = new PhoneProblemBill();
        bobby.setName("Billy Bob");
        bobby.receipt();

        PhoneProblemBill toby = new PhoneProblemBill(987654321);
        toby.setName("Phony Toby");
        toby.receipt();

        PhoneProblemBill nancy = new PhoneProblemBill(111222333,10,60);
        nancy.setName("Negative Nancy");
        nancy.receipt();
    }
}
