package com.ohgiraffers.spring_board.board.model.dto;


public class MemberDTO {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberNickname;
    private String memberEmail;
    private String memberPhone;

    public MemberDTO(String memberId, String memberPwd, String memberName, String memberNickname, String memberEmail, String memberPhone) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberNickname = memberNickname;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberNickname='" + memberNickname + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                '}';
    }
}