package com.ohgiraffers.spring_board.board.model.dao;

import com.ohgiraffers.spring_board.board.model.dto.BoardDTO;
import com.ohgiraffers.spring_board.board.model.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BoardMapper {
    List<BoardDTO> findAllBoard();

    List<MemberDTO> findAllMembers();

    void registNewBoard(BoardDTO newBoard);

    void updateNewBoard(BoardDTO updateBoard);

    void deleteNewBoard(BoardDTO deleteBoard);
}
