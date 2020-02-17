package com.application.CDB

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
class CDBApplication

fun main(args: Array<String>) {
	runApplication<CDBApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}

