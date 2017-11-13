package com.liuh.databindinglearn;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.liuh.databindinglearn.databinding.ActivityMainBinding;

/**
 * 练习使用dataBinding的变量绑定，事件绑定
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    Employee employee = new Employee("zhang1", "san2", false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //给布局中的控件赋值
        mainBinding.firstText.setText(employee.getFirstname());
        mainBinding.secondText.setText(employee.getLastName());
        //给布局中的variable赋值,两种方式效果一致的
        //mainBinding.setEmployee(employee);
        mainBinding.setVariable(BR.employee, employee);
        //监听器的绑定，
        mainBinding.setPresenter(new Presenter());

//        sparseArray.
    }

    public class Presenter {
        //第一种绑定方式（方法引用,参数类型要和系统方法参数一致）
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            employee.setFirstname(s.toString());
            mainBinding.setEmployee(employee);
        }

        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "点到了", Toast.LENGTH_SHORT).show();
        }

        //第二种绑定方式（参数类型可以随便写，这种方式复杂的地方在xml文件中）
        //当点击了布局中某一个控件后，把Employee回传到这里
        //布局文件中用到lambada表达式
        public void onClickListenerBinding(Employee employee) {
            Toast.makeText(MainActivity.this, employee.getLastName(), Toast.LENGTH_SHORT).show();
        }
    }
}
