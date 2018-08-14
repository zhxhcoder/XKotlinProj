package com.zhxh.xkotlin.mvp.presenter

import com.zhxh.xkotlin.mvp.contract.IMainContact
import com.zhxh.xkotlin.mvp.model.MainModel
import com.zhxh.corelib.mSubscribe
import com.zhxh.corelib.mvp.BasePresenterKt


class MainPresenter:BasePresenterKt<IMainContact.View>(), IMainContact.Presenter {
    override var mModel: IMainContact.Model? = MainModel()
    override fun getDataByNet() {
        mModel?.getMainData()?.mSubscribe(mView,mModel,"正在获取数据中...") {
            mView?.getDataSuccess()
        }
    }
}

