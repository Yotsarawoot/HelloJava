import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Staff> staffs = new ArrayList<>();
        Developer dev1 = new Developer("Jame Corner",35000, 20, 500);
        staffs.add(dev1);
        Developer dev2 = new Developer("Jame Crist",35000, 20, 500);
        staffs.add(dev2);
        CEO ce01 = new CEO("Elon Musk",500000, 100, 2000);
        staffs.add(ce01);
        Marketing market1 = new Marketing("Steve Jobs",50000, 5, 5000);
        staffs.add(market1);

        ArrayList<IPayment> tempStaffs = new ArrayList<>();
        Driver driver1 = new Driver("Bobby Bo", 50, 500);
        tempStaffs.add(driver1);
        Cleaner cleanerOne = new Cleaner("Jimmy Guy", 2000, 20);
        tempStaffs.add(cleanerOne);

        ArrayList<IPayment> monthly = new ArrayList<>();
        Rental rental1 = new Rental(20000);
        monthly.add(rental1);
        Electricity electricOneMonth = new Electricity(300, 7);
        monthly.add(electricOneMonth);
        InternetAccess subscriptionOneMonth = new InternetAccess(5000);
        monthly.add(subscriptionOneMonth);

        int totalPayment = 0;
        int totalStaffPayment = 0;
        int totalTempStaffPayment = 0;
        int totalTax = 0;
        int monthlyCost = 0;

        for (Staff staff : staffs) {
            System.out.println(staff.getName() + "'s payment = " + staff.getPayment());
            totalStaffPayment += staff.getPayment();
        }
        System.out.println();
        System.out.println("Total staff payment = " + totalStaffPayment);
        System.out.println();

        for (IPayment tempStaff : tempStaffs) {
            System.out.println(tempStaff.getName() + "'s payment = " + tempStaff.getPayment());
            totalTempStaffPayment += tempStaff.getPayment();
        }

        System.out.println();
        System.out.println("Total temporary staff payment = " + totalTempStaffPayment);
        System.out.println();

        for (IPayment month : monthly) {
            System.out.println(month.getName() + " = " + month.getPayment());
            monthlyCost += month.getPayment();
        }

        System.out.println();
        System.out.println("Monthly cost = " + monthlyCost);
        System.out.println();

        for (Staff staff : staffs) {
            System.out.println(staff.getName() + "'s tax = " + staff.getTax());
            totalTax += staff.getTax();
        }

        System.out.println();
        System.out.println("Total tax = " + totalTax);

    }
}