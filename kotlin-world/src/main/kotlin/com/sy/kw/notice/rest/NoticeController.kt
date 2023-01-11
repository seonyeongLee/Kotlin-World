package com.sy.kw.notice.rest

import com.sy.kw.notice.service.logic.NoticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notice")
class NoticeController @Autowired constructor(val noticeService: NoticeService) {
    @GetMapping("/list")
    fun getList(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(noticeService.getNotice());
    }
}
