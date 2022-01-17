package study;

/**
 * Main.java
 *
 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   User.java: 問①
 *   Main.java: 問①から問②
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 // ① 以下のルールに従いUserクラスのインスタンスを生成してください。
    User user = new User( "hoge", 123 , "abc123");
    user.printAccountInfo();
   
    
        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
  
    System.out.println();
	}
	
}
