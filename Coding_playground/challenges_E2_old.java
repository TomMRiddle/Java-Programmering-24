package Coding_playground;

public class challenges_E2_old {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String outputString = "";
            String stringOfNumbers = "";
            for (int j = 1; j < i*2; j++) {
                if (j != i+5) {
                    if(j > ((i+5)/2)-1) {
                        stringOfNumbers += (j-(i+i))*-1;
                    } else {
                        stringOfNumbers += j;
                    }
                    if (j < i*2) {
                        stringOfNumbers += " ";
                    }   
                }
            }
            outputString = String.format("%1$" + (8+(i*2)) + "s", stringOfNumbers);
            System.out.println(outputString);
        }
    }
}
