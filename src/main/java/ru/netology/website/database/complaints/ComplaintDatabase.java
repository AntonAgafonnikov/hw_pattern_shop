package ru.netology.website.database.complaints;

import java.util.ArrayList;
import java.util.List;

public class ComplaintDatabase {
    private List<Complaint> listComplaint = new ArrayList<>();

    public void addComplaint(String content) {
        listComplaint.add(new Complaint(content));
    }
}
