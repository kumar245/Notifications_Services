package com.kumar.user.notificationsservices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int notifyId=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buNotify(View view) {
//        NotificationCompat.Builder nBuild=new NotificationCompat.Builder(this);
//        nBuild.setContentTitle("Danger")
//                .setContentText("It will come soon")
//                .setSmallIcon(R.drawable.download);
//        NotificationManager notificationManager=(NotificationManager)
//                getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(notifyId,nBuild.build());
//        notifyId++;
        SimpleWayNotification simpleWayNotification=new SimpleWayNotification();
        simpleWayNotification.notify(this,"It is raining",1);
    }

}
