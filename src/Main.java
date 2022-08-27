public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n Первое задание:");
        task1();
        System.out.println("\n\n\n Второе задание:");
        task2();
        System.out.println("\n\n\n Третье задание:");
        task3();
        System.out.println("\n\n\n Четвёртое задание:");
        task4();
    }

    public static void task1() {
        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] arr = {1, 1, 1};
    }

    public static void task2() {
        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] arr = {1, 1, 1};
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]);
            if (i != arrInt.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]);
            if (i != arrDouble.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static void task3() {
        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        int[] arr = {1, 1, 1};
        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(arrInt[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.print(arrDouble[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("\n");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }

    public static void task4() {
        int[] arrInt = new int[]{1, 2, 3};
        for (int i = 0; i <= arrInt.length - 1; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i]++;
                System.out.print(arrInt[i]);
            } else {
                System.out.print(arrInt[i]);
            }
            if (i != arrInt.length - 1) {
                System.out.print(",");
            }
        }
    }
}