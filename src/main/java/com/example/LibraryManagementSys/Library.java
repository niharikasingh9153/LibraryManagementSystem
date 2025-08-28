package com.example.LibraryManagementSys;

import java.util.List;

public class Library {
    private String name;
    private List<Book> books;
    private Member member;

    public Library() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }
}
