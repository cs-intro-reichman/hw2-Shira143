
public class Cheers {
        public static void main(String[] args) {
                String scream = args[0];
                int times = Integer.parseInt(args[1]);
                 scream = scream.toUpperCase();
                for (int i = 0; i < scream.length(); i++) 
                {
                  
                if ( (scream.indexOf('A')) == i || (scream.indexOf('E')) == i|| (scream.indexOf('F') )== i
                 || (scream.indexOf('H')) == i|| (scream.indexOf('I')) == i|| (scream.indexOf('L'))== i
                 || (scream.indexOf('M'))== i || (scream.indexOf('N')== i || (scream.indexOf('O'))== i
                 || (scream.indexOf('R'))== i|| (scream.indexOf('S')) == i || ((scream.indexOf('X'))== i)))
                {
                        System.out.println("Give me an " + scream.charAt(i) + "!");
                }
                else
                {
                        System.out.println("Give me a  " + scream.charAt(i) + "!");
                }
        }
        for (int i = 0; i <times; i++) 
        {
                    System.out.println(scream + " !!!");

        }     
               

}
}
