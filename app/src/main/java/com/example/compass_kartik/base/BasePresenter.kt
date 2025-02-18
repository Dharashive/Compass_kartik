package com.example.compass_kartik.base

import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

abstract class BasePresenter<ViewType> : ViewModel(),
    BasePresenterInterface<ViewType> {
    var view: WeakReference<ViewType>? = null

    override fun attach(view: ViewType) {
        this.view = WeakReference(view)
    }

    protected fun getScreen(): ViewType? = view?.get()
}