/*
 * ************************************************************
 * 文件：EmptyBindActivity.java  模块：app-core  项目：component
 * 当前修改时间：2019年04月12日 09:21:19
 * 上次修改时间：2019年04月10日 15:58:25
 * 作者：Cody.yi   https://github.com/codyer
 *
 * 描述：app-core
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.component.app.activity;

import androidx.databinding.ViewDataBinding;

/**
 * Created by xu.yi. on 2019/3/25.
 * 不需要绑定viewData
 */
public abstract class EmptyBindActivity<B extends ViewDataBinding> extends BaseBindActivity<B> {
    @Override
    protected void bindViewData() {
    }
}
