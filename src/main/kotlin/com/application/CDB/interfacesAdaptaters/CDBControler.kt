package com.application.CDB.interfacesAdaptaters

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import rx.Observable

@Controller
class CDBControler{

    @GetMapping("/" )
    fun CDB(model: Model, @RequestParam cname :String?): String {
        model["title"]= "Computer name is :" + cname
        return "CDB"
    }
    fun CDBD(): String {
        return "test"
    }

    @ResponseBody
    @PostMapping("/computer" )
    fun observable(@RequestParam(value = "cname", defaultValue = "World")cname:String?): Observable<String> {
        CDBD()
        return Observable.just(cname)
    }
}
