package jp.techacademy.tetta.maeda.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by user on 2018/01/30.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
