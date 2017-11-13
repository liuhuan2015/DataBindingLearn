package com.liuh.databindinglearn;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.liuh.databindinglearn.databinding.ActivityListBinding;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    ActivityListBinding mBinding;
    EmployeeAdapter mEmployeeAdapter;
    List<Employee> demoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        mBinding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdapter = new EmployeeAdapter(this);
        mBinding.recyclerview.setAdapter(mEmployeeAdapter);
        mEmployeeAdapter.setmListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void onEmployeeClick(Employee employee) {
                Toast.makeText(ListActivity.this, employee.getFirstname(), Toast.LENGTH_SHORT).show();
            }
        });
        demoList = new ArrayList<Employee>();
        demoList.add(new Employee("zhang", "san", false));
        demoList.add(new Employee("zhang2", "san2", false));
        demoList.add(new Employee("zhang3", "san3", true));
        demoList.add(new Employee("zhang4", "san4", false));
        mEmployeeAdapter.addAll(demoList);

        mBinding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEmployeeAdapter.add(new Employee("haha", "123", false));
            }
        });

        mBinding.btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEmployeeAdapter.remove();
            }
        });

    }
}
