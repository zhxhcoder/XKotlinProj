package com.zhxh.xkotlin.mvp.view

import com.zhxh.xkotlin.R
import com.zhxh.xkotlin.mvp.contract.ILoginContract
import com.zhxh.xkotlin.mvp.presenter.LoginPresenter
import com.zhxh.corelib.utils.CommonUtil
import com.sihaiwanlian.baselib.mvp.BaseMvpTitleActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : BaseMvpTitleActivity<ILoginContract.View, ILoginContract.Presenter>(), ILoginContract.View {
    override fun childView() = R.layout.activity_login
    override var mPresenter: ILoginContract.Presenter = LoginPresenter()
    override fun initData() {
        setActivityTitle(R.string.app_name)
        initListner()
    }

    private fun initListner() {
        button.setOnClickListener {
            CommonUtil.startActivtiy(this, MainActivity::class.java)
        }
    }
}

