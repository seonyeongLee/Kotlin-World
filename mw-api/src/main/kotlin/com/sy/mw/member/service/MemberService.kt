package com.sy.mw.member.service

import com.sy.mw.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService (
    private val memberRepository: MemberRepository
){
    fun getMembers() = memberRepository.findAll()


}