package com.rafaltrzcinski.android_kotlin_with_spock

interface MainActivityContract {

    interface View

    interface Presenter {

        fun bind(view: View)
    }
}