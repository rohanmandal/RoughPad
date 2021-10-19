import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StraightLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputs = Integer.parseInt(reader.readLine());
        String[] inputPoints = reader.readLine().split(" ");

        if (inputPoints.length == (inputs * 2)) {
            ArrayList<Integer> points = new ArrayList();
            for (String str : inputPoints) {
                points.add(Integer.parseInt(str));
            }

            Map<Integer, Integer> pointDict = new HashMap();
            for (Integer i : points) {
                int count = 1;
                if (pointDict.get(i) == null)
                    pointDict.put(i, count);
                else
                    pointDict.put(i, ++count);
            }

            /*points.forEach(ele -> {
                int count = 1;
                if (pointDict.get(ele) == null)
                    pointDict.put(ele, count);
                else {
                    pointDict.put(ele, ++count);
                }
            });*/

            int flag = 0;

            for (Integer i : points) {
                if (pointDict.get(i) == 2)
                    flag = 1;
                else
                    flag = 0;
            }

            if (flag == 1)
                System.out.println("1x-1y=0");
            else
                System.out.println("Not a straight line.");
        }
    }
}
