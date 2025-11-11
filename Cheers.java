
public class Cheers {
        public static void main(String[] args) {
                String scream = args[0];
                int times = Integer.parseInt(args[1]);
                 scream = scream.toUpperCase();
                 String specialLetters  = "AEFHILMNORSX";
                for (int i = 0; i < scream.length(); i++) 
                {
                  char currentLetter = scream.charAt(i);
                if ( specialLetters.indexOf(currentLetter) >= 0)
                {
                        System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
                }
                else
                {
                        System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
                }
             }
             System.out.println("What does that spell?");
             for (int i = 0; i <times; i++) 
        {
                    System.out.println(scream + "!!!");

        }     
               

}
}
