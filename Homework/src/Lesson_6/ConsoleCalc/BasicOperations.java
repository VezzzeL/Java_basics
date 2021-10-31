package Lesson6.ConsoleCalculator;

public interface BasicOperations {

    static double completeOperation(String input){

        String operationPref="" , operationSuf="";
        double result=0.0;

        input.replaceAll(",",".");
        input.replaceAll(" ","");

        char basicOperators[]={'+','-','*','/'};

        if(input.length()>1) {
            for (int i = 0; i < basicOperators.length; i++) {
                for (int j = 0; j < input.length(); j++) {
                    if (basicOperators[i] == input.charAt(j)) {
                        operationPref += input.substring(0, j);
                        operationSuf += input.substring(j+1, input.length());
                        double pref=Double.parseDouble(operationPref),suf=Double.parseDouble(operationSuf);
                        result = makeCalculation(pref,suf,basicOperators[i]);
                        break;
                    }
                }
            }
        }
        return result;
    }

    static double makeCalculation(double pref, double suf, char operator){
        switch (operator){
            case '+':
                return pref+suf;
            case '-':
                return pref-suf;
            case '*':
                return pref*suf;
            case '/':
                return pref/suf;
            default:
                return 0;
        }
    }
}
