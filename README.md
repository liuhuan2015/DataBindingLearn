# DataBindingLearn
一个学习DataBinding使用的代码项目
项目使用MVVM框架时一般会使用DataBinding。
使用步骤：
    
1，在module的gradle文件中的配置
      
    android {
    compileSdkVersion 25
    buildToolsVersion "26.0.0"
    dataBinding {
        enabled = true
    }
    ......
    }
    

2，布局文件中
    <?xml version="1.0" encoding="utf-8"?>
    <layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <data>

        <variable
            name="employee"
            type="com.liuh.databindinglearn.Employee" />

        <variable
            name="presenter"
            type="com.liuh.databindinglearn.MainActivity.Presenter" />

    </data>
    ......
    </layout>
    
3，build一下项目，as会生成binding类，然后我们在Activity里面就可以使用databinding来进行一些操作了。一些详细的操作见工程代码。

    
