package com.zhxh.corelib.mvp

open class BasePresenterKt<V : ITopView> {
    var mView: V? = null
}