package chapter6;

public class PhoneProblemBill {
    private int id;
    private int totalMin;
    private int usedMin;
    private int baseCost = 50;
    private double costPerMin = .25;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public PhoneProblemBill(){
        id = 123456789;
        totalMin = 120;
        usedMin = 60;
    }

    public PhoneProblemBill(int id){
        this.id = id;
        totalMin = 90;
        usedMin = 30;
    }

    public PhoneProblemBill(int id, int minutesTotal, int minutesUsed){
        this.id = id;
        this.totalMin = minutesTotal;
        this.usedMin = minutesUsed;
    }

    public double calculateAvg(){ //Finds monetary avg of minutes used vs minutes in total
        return (costPerMin * totalMin) + (costPerMin * usedMin) / 2;
    }

    public double calculateTax(){ //Calculates tax by 5% to the price of total minutes
        return ((costPerMin * totalMin) * 0.05);
    }

    public double calculatePrice(){
        return (totalMin * costPerMin) + calculateTax() + baseCost;
    }

    public void receipt(){
        System.out.println("Average for " + getName() + ": " + calculateAvg());
        System.out.println("Tax for " + getName() + ": " + calculateTax());
        System.out.println("Price for " + getName() + ": " + calculatePrice());
    }
}
