
/**
 * FizzBuzz問題
 *
 * 1から100までの連続した整数を画面に表示していく。ただし、
 * ・もし、その整数が3で割り切れる数なら “Fizz” と表示する。
 * ・もし、その整数が5で割り切れる数なら “Buzz” と表示する。
 * ・上記2つの条件は同時に満たせる。
 * つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら “FizzBuzz” と表示する。
 * ・それ以外の数は、その数をそのまま表示する。
 *
 * @author takumi-nakamura
 *
 */
public class Lesson4_7 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
