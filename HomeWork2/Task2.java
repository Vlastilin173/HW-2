package HomeWork2;


public class Task2 {

    public static void main(String[] args) {
        int[] intArray = new int[9];
        try {
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы");
        }

    }

}