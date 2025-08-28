package com.example.LibraryManagementSys;


public class Member {
    private String memberId;
    private String name;

    public Member() {
        // no-arg constructor needed for setter injection
    }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name=" + name + "]";
    }
}
