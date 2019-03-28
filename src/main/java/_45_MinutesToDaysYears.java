public class _45_MinutesToDaysYears {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long days = (minutes / 60) / 24;
            long years = (int) (days / 365);
            days = days % 365;
            System.out.println(minutes + " min = "+ years + " y and " + days + " d");
        }
    }
}
