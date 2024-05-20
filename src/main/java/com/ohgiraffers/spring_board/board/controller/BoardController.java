package com.ohgiraffers.spring_board.board.controller;

import com.ohgiraffers.spring_board.board.model.dto.BoardDTO;
import com.ohgiraffers.spring_board.board.model.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public String  findBoardList(Model model) {

        List<BoardDTO> boardList = boardService.findAllBoard();

        for (BoardDTO boards : boardList) {
            System.out.println("boards = " + boards);
        }

        model.addAttribute("boardList", boardList);

        return "/board/list";
    }
}
