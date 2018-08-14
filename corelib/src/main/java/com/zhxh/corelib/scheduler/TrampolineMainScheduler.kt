package com.zhxh.corelib.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class TrampolineMainScheduler<T> private constructor() : BaseScheduler<T>(Schedulers.trampoline(), AndroidSchedulers.mainThread())
