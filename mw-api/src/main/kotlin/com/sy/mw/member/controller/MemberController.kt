package com.sy.mw.member.controller

import com.sy.mw.member.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/member")
@RestController
class MemberController (
    private val memberService: MemberService
){
    @GetMapping
    fun getMembers() = memberService.getMembers()

    

}