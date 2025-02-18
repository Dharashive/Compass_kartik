package com.example.compass_kartik.base

interface BasePresenterInterface<ViewType> {
    fun attach(view: ViewType)
}