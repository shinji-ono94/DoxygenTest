/**
* Javadocを生成するクラスです。
* @author shinji ono
*
*/
public class test {

    /**
    * クラスフィールドです。
    */
    static String s;
  
    /**
    * mainメソッドです。
    * printMessageメソッドを呼び出します
    */
    public static void main(String[] args) {
  
      s = "Javadoc生成確認";
  
      printMessage(s);
  
    }
  
    /**
    * printMessageメソッドです。
    * @param str 出力したい文字列を指定
    * @return 出力した文字列
    */
    static String printMessage(String str) {
  
      //コンソール出力
      System.out.println(str);
      return str;
  
    }
}