package com.sy.mw.member.repository

import javax.persistence.*


@Entity
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
    @Column(name = "MEMBER_ID", length = 6, nullable = false)
    var memberId: Long? = null,

    @Column(name = "NAME", length = 20, nullable = false)
    var name: String,

    @Column(name = "NICKNAME", length = 30, nullable = false)
    var nickname: String,

    @Column(name = "PASSWORD", length = 100, nullable = false)
    var password: String,

    @Column(name = "PHONE", length = 20, nullable = false)
    var phone: String,

    @Column(name = "EMAIL", length = 100, nullable = false)
    var email: String,

    @Column(name = "GENDER", length = 1)
    var gender: String

)