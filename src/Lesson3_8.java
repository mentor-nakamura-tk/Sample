
/**
 * 課題：税込価格の計算.
 *
 * <pre>
 * ○○円の商品の税込価格は○○円(消費税は○○円)です。
 * と表示するプログラムを書きましょう。
 * ただし、下記の仕様を満たしてください。
 *
 * mainメソッドとtaxメソッドを切り分けてください。
 * taxメソッドでは消費税計算(8%)のみ行います。
 * mainメソッドはtaxメソッドから戻り値の消費税(8%)を受けてください。
 * 消費税に小数が含まれる場合は切り捨てるなどして、整数で表示させてください。
 * 税込の金額 = 金額 + 消費税額 と正しくなるようにしましょう。
 *
 * 実行結果の例
 *  1500円の商品の税込価格は1620円(消費税は120円)です。
 *
 * </pre>
 *
 * @author takumi-nakamura
 *
 */
public class Lesson3_8 {

    public static void main(String[] args) {
        int kingaku = 1500;
        int tax = Lesson3_8.tax(1500);
        int gokei = kingaku + tax;
        System.out.println(kingaku + "円の商品の税込価格は" + gokei + "円(消費税は" + tax + "円)です。");
    }

    // 8 / 100 にすると 0 になってしまう.
    public static int tax(int kingaku) {
        return (int) (kingaku * ((double)8 / 100));
    }
}
