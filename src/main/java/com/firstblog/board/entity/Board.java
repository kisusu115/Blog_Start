package com.firstblog.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String filename;
    private String filepath;

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) {
        this.content = content;
    }
    public void setFileName(String filename) { this.filename = filename; }
    public void setFilePath(String filepath) { this.filepath = filepath; }
}
