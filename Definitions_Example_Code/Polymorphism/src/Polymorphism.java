public class Polymorphism
{
        public static void main(String[] args) {
            int x = 3;
            int y = 4;
            int z = 5;
            System.out.println(sum(x,y));
            System.out.println(sum(x,y,z));
        }

        public static int sum(int firstNumber, int secondNumber)
        {
            int sum = firstNumber + secondNumber;
            return sum;
        }
        public static int sum(int firstNumber, int secondNumber, int thirdNumber)
        {
            int sum = firstNumber + secondNumber + thirdNumber;
            return sum;
        }
}
