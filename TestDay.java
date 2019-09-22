package GBmainEgit.javaCore.git;

public class TestDay {
    public static void main(String[] args) {
        DayOfWeek weekDays = DayOfWeek.Saturday;
        System.out.print("Случился  " + weekDays.getTrans());
        System.out.println(" и осталось работать " + weekDays.getTimeLeft() + " часов. ");
//        switch (weekDays) {
//            case Monday:
//                System.out.println(" timeLeft :" + 40 / 1 + "  hours");
//                break;
//            case Thursday:
//                System.out.println("time left :" + 40 / 2 + "  hours");
//                break;
//            case Wednesday:
//                System.out.println("time left :" + 40 / 3 + "  hours");
//                break;
//            case Tuesday:
//                System.out.println("time left :" + 40 / 4 + "  hours");
//                break;
//            case Friday:
//                System.out.println("time left :" + 40 / 5 + "  hours");
//                break;
//            case Saturday:
//                System.out.println("time left :" + 40 / 6 + "  hours");
//                break;
//        }
//
//        //System.out.println(getWorkingHours(DayOfWeek.Monday));

    }
}
