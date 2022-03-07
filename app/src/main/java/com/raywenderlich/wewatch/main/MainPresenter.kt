package com.raywenderlich.wewatch.main

import com.raywenderlich.wewatch.model.LocalDataSource

class MainPresenter(
    private var viewInterface: MainContract.ViewInterface,
    private var dataSource: LocalDataSource
) : MainContract.PresenterInterface {
    private val TAG = "MainPresenter"
}