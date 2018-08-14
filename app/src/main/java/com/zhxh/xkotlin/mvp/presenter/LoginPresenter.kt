package com.zhxh.xkotlin.mvp.presenter

import com.zhxh.xkotlin.mvp.contract.ILoginContract
import com.zhxh.xkotlin.mvp.model.LoginModel
import com.zhxh.corelib.mvp.BasePresenterKt



class LoginPresenter : BasePresenterKt<ILoginContract.View>(), ILoginContract.Presenter {
    override var mModel: ILoginContract.Model? =LoginModel()

}

