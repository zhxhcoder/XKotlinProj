package com.zhxh.xkotlin.mvp.contract

import com.zhxh.corelib.mvp.IModel
import com.zhxh.corelib.mvp.IPresenter
import com.zhxh.corelib.mvp.IView

interface ILoginContract {
    interface View : IView<Presenter> {}
    interface Presenter : IPresenter<View, Model> {}
    interface Model : IModel {}
}
