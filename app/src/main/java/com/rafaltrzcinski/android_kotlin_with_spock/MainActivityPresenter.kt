package com.rafaltrzcinski.android_kotlin_with_spock

class MainActivityPresenter : MainActivityContract.Presenter {

    var view: MainActivityContract.View? = null

    override fun bind(view: MainActivityContract.View) {
        this.view = view
    }
}