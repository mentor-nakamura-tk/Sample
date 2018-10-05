
/**
 * 課題：プロ野球チームの勝ち負け数を管理する
 *
 * <pre>
 * 勝ち負け数を管理するためのクラスを作成して、インスタンスを6チーム分生成した後に各チームの勝ち負け数を表示するプログラムを作成してください。
 * 課題に取り組む上で、下記の仕様を満たすようにしましょう。
 *
 * BaseBallTeam という名前のクラスを作ってください。(メインメソッドは不要)
 * 以下のフィールドを BaseBallTeam に持たせてください。なお、カプセル化を使うようにしましょう。
 * name (String型)
 * win (int型)
 * lose (int型)
 * draw (int型)
 * それぞれのゲッターとセッターを用意します。
 * 勝率は「勝ち数/(勝ち数+負け数)」の計算で求まります。この計算結果を小数値(double)で戻す getRate メソッドを BaseBallTeam に作ってください。
 * もうひとつ、 report というメソッドを BaseBallTeam に作ります。○○ の2017年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッドです。(下記の実行例では、読みやすくなるよう適当にスペースを入れています。)
 * メインメソッドの入っているクラスを用意します。(クラス名は自由)
 * メインメソッドの中で BaseBallTeam のインスタンスを6個生成し、それぞれのチームの名前、勝ち数、負け数、引き分け数を格納します。
 * report メソッドを呼び出して、勝敗情報を表示してください。
 * </pre>
 *
 * @author takumi-nakamura
 *
 */
public class Lesson6_5 {

    public static void main(String[] args) {
        BaseBallTeam t1 = new BaseBallTeam();
        t1.setName("広島東洋カープ");
        t1.setWin(88);
        t1.setLose(51);
        t1.setDraw(4);
        t1.report();

        BaseBallTeam t2 = new BaseBallTeam();
        t2.setName("阪神タイガース");
        t2.setWin(78);
        t2.setLose(61);
        t2.setDraw(4);
        t2.report();

        // 以下同文
    }
}
