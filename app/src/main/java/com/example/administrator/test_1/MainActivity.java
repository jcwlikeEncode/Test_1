package com.example.administrator.test_1;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TableLayout;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //轻量级存储
        SharedPreferences pref = getSharedPreferences("Test.txt",MODE_PRIVATE);
        Set<String> sets = new HashSet<>();
        sets.add("dd");
        pref.edit().putStringSet("key",sets).commit();
        pref.getInt("fsdf",2);//参数二为默认值；


        getSupportFragmentManager().beginTransaction();
        FragmentTransaction ftc = getSupportFragmentManager().beginTransaction();


        TableLayout layout = (TableLayout)findViewById(R.id.tablelayout);

        

    }

    class MyAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return false;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }
    }
}
