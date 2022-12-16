import java.util.ArrayList;

public class LearnXinYminutes {
     static public  void main(String[] args) {
        // single line comments
        /*
            multi
            lin
            sdhfsdhfkhskdjf
            shfkhsdkfksfh
         */

       // ArrayList al;

         System.out.println(10);
         System.out.println('h');
         System.out.println(10+'h'); //114

         // a-97 b-98 c-99 d-100 e-101 f-102 g-103 h-104

         System.out.println("hi "+12); //hi 12

         System.out.println("hi "+12+3); //hi 123

         String fooString = "My String Is Here!";

         // \n is an escaped character that starts a new line
         String barString = "Printing on a new line?\nNo Problem!";
         // \t is an escaped character that adds a tab character
         String bazString = "Do you want to add a tab?\tNo Problem!";
         System.out.println(fooString);
         System.out.println(barString);
         System.out.println(bazString);

         StringBuilder builderConcatenated = new StringBuilder();
         builderConcatenated.append("You ");
         builderConcatenated.append("can use ");
         builderConcatenated.append("the StringBuilder class.");

         System.out.println(builderConcatenated);

     }
}
