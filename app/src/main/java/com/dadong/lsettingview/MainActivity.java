package com.dadong.lsettingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dadong.lsettingview.R;
import com.facebook.drawee.backends.pipeline.Fresco;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        LSettingView lSettingView=findViewById(R.id.lSetting);
        lSettingView.setmRightIv("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551265567953&di=344a8a20162e4d2a1a688b6d4abb36dc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F20182%2F21%2F2018221142159_MZ33z.jpeg");

        lSettingView.setmOnLSettingItemClick(new LSettingView.OnLSettingItemClick() {
            @Override
            public void click(int id, boolean isChecked) {
                Toast.makeText(getApplicationContext(),"自定义条目点击事件",Toast.LENGTH_LONG).show();
            }
        });
    }
}
