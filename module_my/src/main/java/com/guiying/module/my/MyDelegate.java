package com.guiying.module.my;

import com.guiying.module.common.base.IApplicationDelegate;
import com.guiying.module.common.base.ViewManager;
import com.orhanobut.logger.Logger;


/**
 * 项目名称： AndroidModulePattern-master
 * 包名：com.guiying.module.my
 * 类描述： describe
 * 创建人： wxw https://github.com/huatianjiajia
 * 创建时间： 2018/3/1 10:24
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class MyDelegate implements IApplicationDelegate{
    @Override
    public void onCreate() {
        Logger.init("gsd");
        ViewManager.getInstance().addFragment(0,MyFragment.newInstance());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
