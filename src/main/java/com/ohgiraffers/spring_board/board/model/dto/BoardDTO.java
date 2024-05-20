package com.ohgiraffers.spring_board.board.model.dto;

public class BoardDTO {

    private String boardId;
    private String memberId;
    private String boardTitle;
    private String boardContext;

    public BoardDTO() {}

    public BoardDTO(String boardId, String memberId, String boardTitle, String boardContext) {
        this.boardId = boardId;
        this.memberId = memberId;
        this.boardTitle = boardTitle;
        this.boardContext = boardContext;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContext() {
        return boardContext;
    }

    public void setBoardContext(String boardContext) {
        this.boardContext = boardContext;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardId='" + boardId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardContext='" + boardContext + '\'' +
                '}';
    }
}
