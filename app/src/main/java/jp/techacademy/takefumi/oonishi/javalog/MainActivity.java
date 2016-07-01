package jp.techacademy.takefumi.oonishi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("javatest", "ログへの出力テスト");

        Human human = new Human("トム", 18, "野球");
        human.think();
        human.say();

        Human human1 =new Human("ジェフ",15,"サッカー");
        human1.think();
        human1.say();
    }
}
