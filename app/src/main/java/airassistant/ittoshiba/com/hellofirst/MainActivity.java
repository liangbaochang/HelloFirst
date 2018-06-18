package airassistant.ittoshiba.com.hellofirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("");
        System.out.println("test1的分支");
        System.out.println("test2分支的代码");
        System.out.println("把两个分支进行合并");
        
        System.out.println("测试分支");
        System.out.println("本地新添加的数据");

        System.out.println("第二个测试代码");
        
        System.out.println("第三个测试代码");

        System.out.println("第四次测试代码");
        
        System.out.println("服务端修改了代码");
    }
}
