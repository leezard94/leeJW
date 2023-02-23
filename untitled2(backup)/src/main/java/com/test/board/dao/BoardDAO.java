package com.test.board.dao;


import com.test.board.vo.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public class BoardDAO {

       // @Autowired
                // spring 4.3 version 이상부터 생성자가 하나인 경우 사용하지 않아도 됨.
        SqlSession sqlSession;

        public int insertBoard(BoardVO vo) {
            int result = sqlSession.insert("Board.insertBoard", vo);
            return result;
        }

        public int updateBoard(BoardVO vo) {
            int result = sqlSession.update("Board.updateBoard", vo);
            return result;
        }

        public int deleteBoard(int seq) {
            int result = sqlSession.delete("Board.deleteBoard", seq);
            return result;
        }

        public BoardVO getBoard(int seq) {
            BoardVO result = sqlSession.selectOne("Board.getBoard", seq);
            return result;
        }

        public List<BoardVO> getBoardList() {
            List<BoardVO> result = sqlSession.selectList("Board.getBoardList");
            return result;
        }

    }

