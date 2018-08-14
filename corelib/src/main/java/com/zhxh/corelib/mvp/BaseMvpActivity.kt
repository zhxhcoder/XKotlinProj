package com.zhxh.corelib.mvp

import android.os.Bundle
import com.zhxh.corelib.base.BaseActivity
import com.zhxh.corelib.showToastBottom


abstract class BaseMvpActivity<V : ITopView, P : ITopPresenter> : BaseActivity(), IView<P> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inited()
    }
    override fun getCtx() = this
    override fun showLoading(msg: String) {
        progressDialog?.showProgressDialogWithText(msg)
    }

    override fun finish(resultCode: Int) {
        finish()
    }

    override fun showLoading(srtResId: Int) {
        progressDialog?.showProgressDialogWithText(resources.getString(srtResId))
    }

    override fun dismissLoading() {
        progressDialog?.dismissProgressDialog()
    }

    override fun showToast(message: String) {
        showToastBottom(message)
    }

    override fun showToast(srtResId: Int) {
        showToast(resources.getString(srtResId))
    }
}