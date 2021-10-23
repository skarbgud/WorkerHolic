package com.workerholic.service;

import java.util.List;
import java.util.Map;

import com.workerholic.vo.BoardVO;
import com.workerholic.vo.ElasticSearchVO;

public interface BoardServiceIF {

	public List<Map<String, Object>> getBoardList(ElasticSearchVO vo) throws Exception;
	
	public Map<String, Object> getBoardDetail(BoardVO vo) throws Exception;
	
	public void insertBoard(BoardVO vo) throws Exception;
	
	public boolean updateBoard(BoardVO vo) throws Exception;
	
	public boolean deleteBoard(BoardVO vo) throws Exception;
}
