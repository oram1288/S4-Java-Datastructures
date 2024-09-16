package Arrays;

// integers, double, float, string, char.
// primitives and non-primitive
//      ex. of prim is Boolean (true of false)
//      ex. of non-prim is String, user define class()

// 3 ways to create an array:
//  1. Declare -- create a reference to array
//  2. Instantiate -- creating an array the of an array
//  3. Initialize -- assign values to the cells

// Example of all 3 combined
//        double [] results = new double [5];
//        results[0] = 3;
//        results[1] = 2;

public class Test {
    double[] temperature; // Declare

    public Test(){        // Instantiate
        temperature = new double[4];
    }

    public static double getAverageTemp(double january, double february){
        double sum = 0.0;
        sum = (january + february)/2;
        return sum;
    }

    public static double getYearlyAverage(double[] temp){
        double sum = 0.0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }

        return sum / temp.length;
    }

    public static void main(String[] args) {
        System.out.println(getAverageTemp(70.5,80.60));

        double[] val = {35.7, 60.3, 90.2, 67.4, 36.6, 38.0};
        System.out.println(getYearlyAverage(val));
    }
}
