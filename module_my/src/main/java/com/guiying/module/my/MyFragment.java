package com.guiying.module.my;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.guiying.module.common.base.BaseFragment;

/**
 * 项目名称： AndroidModulePattern-master
 * 包名：com.guiying.module.my
 * 类描述： describe
 * 创建人： wxw https://github.com/huatianjiajia
 * 创建时间： 2018/3/1 10:21
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class MyFragment extends BaseFragment{
    public static MyFragment newInstance() {
        return new MyFragment();
    }



    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

}
