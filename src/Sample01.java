
/**
 * 文字列の比較
 *
 * @author takumi-nakamura
 *
 */
public class Sample01 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc"; // 初期化時に気を利かせてs1と同じアドレスをいれてくれるとのこと

        if (s1 == s2) { // アドレスの比較
            // だからtrueになる.
            System.out.println("s1 == s2");
        }

        if (s1.equals(s2)) { // 値の比較
            System.out.println("s1.equals(s2)");
        }
    }
}
