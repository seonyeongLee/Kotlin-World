package com.sy.kw.notice.domain.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Notice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var noticeSeq: Long? = null,
    var title: String,
    var content: String
) {

}
