package com.ohgiraffers.spring_board.board.model.dao;

import com.ohgiraffers.spring_board.board.model.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BoardMapper {
    List<BoardDTO> findAllBoard();
}
