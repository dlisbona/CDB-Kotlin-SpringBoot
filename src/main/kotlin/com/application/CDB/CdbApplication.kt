package com.application.CDB

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CdbApplication

fun main(args: Array<String>) {
	runApplication<CdbApplication>(*args)
}
