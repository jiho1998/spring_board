package com.ohgiraffers.spring_board.board.controller;

import com.ohgiraffers.spring_board.board.model.dto.BoardDTO;
import com.ohgiraffers.spring_board.board.model.dto.MemberDTO;
import com.ohgiraffers.spring_board.board.model.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @GetMapping("/memberList")
    public String  findMemberList(Model model) {

        List<MemberDTO> memberList = boardService.findAllMembers();

        for (MemberDTO members : memberList) {
            System.out.println("members = " + members);
        }

        model.addAttribute("memberList", memberList);

        return "/board/memberList";
    }

    @GetMapping("/registboard")
    public void registPage() {}

    @GetMapping(value = "member", produces = "application/json; charset=UTF8")
    @ResponseBody
    public List<MemberDTO> findMemberList() {
        return boardService.findAllMembers();
    }

    @PostMapping("/registboard")
    public String registBoard(BoardDTO newBoard, RedirectAttributes rttr) {

        boardService.registNewBoard(newBoard);

        rttr.addFlashAttribute("successMessage","게시글 작성 성공!");

        return "redirect:/board/list";
    }

    @GetMapping("/boardmodify")
    public void updateBoard() {}

    @PostMapping("/updateboard")
    public String updateBoard(BoardDTO updateBoard, RedirectAttributes rttr) {

        boardService.updateNewBoard(updateBoard);

        rttr.addFlashAttribute("successMessage","게시글 수정 성공!");

        return "redirect:/board/list";
    }

    @GetMapping("/deleteboard")
    public void deleteWrite() {}

    @PostMapping("/deleteboard")
    public String deleteBoard(BoardDTO deleteBoard, RedirectAttributes rttr) {

        boardService.deleteNewBoard(deleteBoard);

        rttr.addFlashAttribute("successMessage","게시글 삭제 성공!");

        return "redirect:/board/list";
    }
}
