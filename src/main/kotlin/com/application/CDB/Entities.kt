package com.application.CDB

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Article(
        val name: String,
        @ManyToOne val company: Company,
        val discontinued: LocalDateTime,
        val introduced: LocalDateTime,
        @Id @GeneratedValue val id: Long?)

@Entity
data class Company(
        val Name: String,
        @Id @GeneratedValue val id: Long?)