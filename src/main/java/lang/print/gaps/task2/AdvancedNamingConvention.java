package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phone_number;

    void callToFriend() {
        if (ADULT_AGE == age) {
            System.out.println("Success!");
        }else System.out.println("Wrong!");
    }

    void callByNumber(int number) {
        if (number == phone_number)
            System.out.println("Success!");
        else System.out.println("Wrong!");
    }
}
