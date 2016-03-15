package zhanghuan.cn.jintest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    static {
        System.loadLibrary("JniTest");
    }

    public native String getStringFromNative();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.show);
        textView.setText(getStringFromNative());
    }
}
