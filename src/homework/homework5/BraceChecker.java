package homework.homework5;

public class BraceChecker {

    private String name;


    BraceChecker(String name) {
        this.name = name;

    }


    void check() {
        Stack stack = new Stack();
        for (int i = 0; i < name.length(); i++) {
            char n = name.charAt(i);
            int pop;
            switch (n) {
                case '(':
                case '{':
                case '[':
                    stack.push(n);
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error " + n + " closed but not opened.at" + i);
                    } else if (pop != '{') {
                        System.out.println("Error " + n + " closed but not opened.at" + (char) pop + "at" + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error " + n + " closed but not opened.at " + i);
                    } else if (pop != '[') {
                        System.out.println("Error " + n + " closed but not opened.at " + (char) pop + "at" + i);
                    }
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error " + n + " closed but not opened.at " + i);
                    } else if (pop != '(') {
                        System.out.println("Error " + n + " closed but not opened.at " + (char) pop + "at" + i);
                    }
                    break;
            }
        }
        while (stack.getIndex()!=-1){
            System.out.println("Error opend" + (char)stack.pop()+ " but not closed");
        }

    }
}

