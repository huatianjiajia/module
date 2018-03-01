package com.guiying.module.my;

import android.view.View;

import com.guiying.module.common.base.BaseFragment;
import com.guiying.module.common.base.IViewDelegate;

/**
 * 项目名称： AndroidModulePattern-master
 * 包名：com.guiying.module.my
 * 类描述： describe
 * 创建人： wxw https://github.com/huatianjiajia
 * 创建时间： 2018/3/1 10:30
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class MyViewDelegate implements IViewDelegate{
    @Override
    public BaseFragment getFragment(String name) {
        return MyFragment.newInstance();
    }

    @Override
    public View getView(String name) {
        return null;
    }
}
