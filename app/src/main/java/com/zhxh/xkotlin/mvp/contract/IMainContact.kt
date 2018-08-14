package com.zhxh.xkotlin.mvp.contract

import com.zhxh.xkotlin.http.MainDataBean
import com.zhxh.corelib.mvp.IListView
import com.zhxh.corelib.mvp.IModel
import com.zhxh.corelib.mvp.IPresenter
import io.reactivex.Observable


interface IMainContact {
    interface View : IListView<Presenter> {
        fun getDataSuccess()
    }

    interface Presenter : IPresenter<View, Model> {
        fun getDataByNet()
    }

    interface Model : IModel {
        fun getMainData(): Observable<MainDataBean>
    }
}