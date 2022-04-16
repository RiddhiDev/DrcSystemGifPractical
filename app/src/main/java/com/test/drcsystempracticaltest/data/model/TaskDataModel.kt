package com.test.drcsystempracticaltest.data.model

data class TaskDataModel(
    var taskName: String = "",
    var taskDate: String,
    var taskMonth: String,
    var taskTime: String,
    var isAlert: Boolean = true,
    var isCompleted: Boolean = false
) {
}