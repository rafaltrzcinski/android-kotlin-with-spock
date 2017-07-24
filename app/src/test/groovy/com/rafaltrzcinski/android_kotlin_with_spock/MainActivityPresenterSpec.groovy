package com.rafaltrzcinski.android_kotlin_with_spock

import spock.lang.Specification

class MainActivityPresenterSpec extends Specification {

    MainActivityPresenter presenter
    MainActivityContract.View view = Mock(MainActivityContract.View)

    def "setup"() {
        presenter = new MainActivityPresenter()
    }

    def "should view be null in presenter before bind"() {
        expect:
        presenter.view == null
    }

    def "should presenter keep view reference on bind"() {
        when:
        presenter.bind(view)

        then:
        presenter.view == view
    }
}