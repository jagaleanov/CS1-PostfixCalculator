package calculator;

import liststring.PileString;
import liststring.QueueString;

public class Postfix {

    public QueueString toPostfix(String infix) {

        infix += ')';
        QueueString postfix = new QueueString();
        PileString temp = new PileString();
        String number = "";

        temp.push("(");
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            switch (ch) {
                case '(':
                    if (!number.equals("")) {
                        postfix.add(number);
                        number = "";
                    }
                    temp.push(ch + "");
                    break;
                case '+':
                case '-':
                case '^':
                case '*':
                case '/':
                    if (!number.equals("")) {
                        postfix.add(number);
                        number = "";
                    }

                    while (priority(ch + "") <= priority(temp.nextPop())) {

                        postfix.add(temp.pop());
                    }
                    temp.push(ch + "");
                    break;
                case ')':
                    if (!number.equals("")) {
                        postfix.add(number);
                        number = "";
                    }
                    while (!temp.nextPop().equals("(")) {
                        postfix.add(temp.pop());
                    }
                    temp.pop();
                    break;
                default:
                    number += ch;
            }
        }

        System.out.print("Postfijo: ");
        postfix.print();
        return postfix;
    }

    public int priority(String ch) {
        int res = 0;
        switch (ch) {
            case ")":
                res = 5;
                break;
            case "^":
                res = 4;
                break;
            case "*":
            case "/":
                res = 3;
                break;
            case "+":
            case "-":
                res = 2;
                break;
            case "(":
                res = 1;
                break;
        }
        return res;
    }
}
