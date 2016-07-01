package jp.techacademy.takefumi.oonishi.javalog;

import android.util.Log;

/**
 * Created by 剛史 on 2016/07/01.
 */
public class Human extends Animal implements Thinkable {
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える");

    }

    public void say() {
        Log.d("javatest", "私の名前は" + name + "です。年は" + age + "歳です。");
    }
}
