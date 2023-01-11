package com.sy.kw.notice.store.repository

import com.sy.kw.notice.domain.entity.Notice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NoticeRepository : JpaRepository<Notice, Long> {
}
