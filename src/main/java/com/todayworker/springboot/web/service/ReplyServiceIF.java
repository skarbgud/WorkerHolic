package com.todayworker.springboot.web.service;


import com.todayworker.springboot.domain.board.vo.ReplyVO;

public interface ReplyServiceIF {

    boolean registerReply(ReplyVO vo);

    boolean updateReply(ReplyVO vo);

    boolean deleteReply(ReplyVO vo);
}
