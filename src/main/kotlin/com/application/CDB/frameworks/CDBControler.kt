package com.application.CDB.frameworks

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller

class CDBControler{

    @GetMapping("/")
    fun CDB(model: Model): String {
        model["title"]="CDB"
        return "CDB"
    }
}
