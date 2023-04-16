package ru.netology.website.database.complaints;

public class Complaint {
    private String content;

    public Complaint(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
