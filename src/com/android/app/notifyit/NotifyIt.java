package com.android.app.notifyit;

import com.android.app.notifyit.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * This class is the entry point of the app
 * 
 
 *
 */
public class NotifyIt extends TabActivity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        initTabs();
    }
    
    private void initTabs() {
    	TabHost tabHost = getTabHost();
    	
    	//Schedule tab
    	TabSpec scheduleSpec = tabHost.newTabSpec("Schedule");
    	scheduleSpec.setIndicator("", getResources().getDrawable(R.drawable.icon_schedule_tab));
    	//scheduleSpec.setIndicator(prepareTabView("Schedule", R.drawable.icon_schedule_tab));
        Intent scheduleIntent = new Intent(this, ScheduleActivity.class);
        scheduleSpec.setContent(scheduleIntent);
        
        //Notifications tab
        TabSpec notificationsSpec = tabHost.newTabSpec("Notifications");
        notificationsSpec.setIndicator("", getResources().getDrawable(R.drawable.icon_notifications_tab));
        //notificationsSpec.setIndicator(prepareTabView("Notifications", R.drawable.icon_notifications_tab));
        Intent notificationsIntent = new Intent(this, NotificationsActivity.class);
        notificationsSpec.setContent(notificationsIntent);
        
        //Adding all TabSpec to TabHost
        tabHost.addTab(scheduleSpec);
        tabHost.addTab(notificationsSpec);
    }
}