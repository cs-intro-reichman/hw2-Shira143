public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
       String second = args[1];
        int hoursFirst = (time.charAt(0)) - '0';
        int hoursSecond = (time.charAt(1)) - '0';
        int minutesFirst = (time.charAt(3)) - '0';
        int minutesSecond = (time.charAt(4)) - '0';
        int minutesToAdd = Integer.parseInt(second);
         int fullHour = hoursFirst * 10 + hoursSecond;
         int fullMinutes = minutesFirst *10 + minutesSecond;
         int totalMinutes = (fullHour * 60) + fullMinutes + minutesToAdd;
         int totalHours = totalMinutes / 60;
         int newHours = totalHours % 24;
         int newMinuts = totalMinutes - (totalHours*60);
        String newHouString = newHours + "";
        String newMinutesString = newMinuts + "";
        if (newHours <10)
        {
            newHouString = "0" + newHouString;
        }
        if (newMinuts<10)
        {
            newMinutesString = "0" + newMinutesString;
        }

        System.out.println(newHouString + ":" + newMinutesString);
    }
}
