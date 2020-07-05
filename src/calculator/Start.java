package calculator;

import liststring.QueueString;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Postfix np = new Postfix();
        System.out.println("Inserte la expresión en notacion infija");
        Scanner leer = new Scanner(System.in);
        String text = leer.nextLine();
        QueueString postfix = np.toPostfix(text);
        Operator op = new Operator();
        Double res = op.operate(postfix);

        System.out.println("El resultado es " + res);
    }

}
