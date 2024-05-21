package com.ohgiraffers.spring_board.board.model.service;

import com.ohgiraffers.spring_board.board.model.dao.BoardMapper;
import com.ohgiraffers.spring_board.board.model.dto.BoardDTO;
import com.ohgiraffers.spring_board.board.model.dto.MemberDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BoardService {

    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardDTO> findAllBoard() {

        return boardMapper.findAllBoard();
    }

    public List<MemberDTO> findAllMembers() {

        return boardMapper.findAllMembers();
    }

    @Transactional
    public void registNewBoard(BoardDTO newBoard) {

        boardMapper.registNewBoard(newBoard);
    }

    @Transactional
    public void updateNewBoard(BoardDTO updateBoard) {

        boardMapper.updateNewBoard(updateBoard);
    }

    public void deleteNewBoard(BoardDTO deleteBoard) {

        boardMapper.deleteNewBoard(deleteBoard);
    }
}
