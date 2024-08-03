package com.example.Sending_mails;
import java.util.List;

public class EmailRequest {
    private List<String> to;
    private String subject;
    private String text;

    // Getters and Setters
    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
