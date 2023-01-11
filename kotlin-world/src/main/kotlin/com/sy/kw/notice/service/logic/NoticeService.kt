package com.sy.kw.notice.service.logic

import com.sy.kw.notice.domain.entity.Notice
import com.sy.kw.notice.store.repository.NoticeRepository
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class NoticeService @Autowired constructor(
    val noticeRepository: NoticeRepository,
) {

    fun getNotice(): List<Notice> {
        return noticeRepository.findAll();
    }

}
