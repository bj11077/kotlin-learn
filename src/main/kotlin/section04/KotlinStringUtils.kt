package com.section04


// 유틸 만들때 이런식으로하면 편함
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}