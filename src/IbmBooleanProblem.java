import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IbmBooleanProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputPoints = reader.readLine();
        IbmBooleanProblem.binaryOperation(inputPoints);
    }

    public static void binaryOperation(String operation) {
        String[] inputPoints = operation.split(" ");

        if (inputPoints.length == 3) {
            if ((inputPoints[0].length() & inputPoints[2].length()) == 8) {
                int a = Integer.parseInt(inputPoints[0], 2);
                int b = Integer.parseInt(inputPoints[2], 2);

                String value = "";

                if (inputPoints[1].equalsIgnoreCase("SHR"))
                    value = (Integer.toBinaryString(a >> b));
                else if (inputPoints[1].equalsIgnoreCase("SHL"))
                    value = (Integer.toBinaryString(a << b));
                else if (inputPoints[1].equalsIgnoreCase("XOR"))
                    value = (Integer.toBinaryString(a ^ b));
                else if (inputPoints[1].equalsIgnoreCase("AND"))
                    value = (Integer.toBinaryString(a & b));
                else if (inputPoints[1].equalsIgnoreCase("OR"))
                    value = (Integer.toBinaryString(a | b));
                else
                    System.out.println("Invalid input");

                if (value.length() != 8) {
                    int zeroSize = 8 - value.length();
                    String zeros = "";
                    for (int i = 0; i < zeroSize; i++)
                        zeros = zeros.concat("0");

                    value = zeros.concat(value);
                }

                System.out.println(value);
            }
        }
    }
}
