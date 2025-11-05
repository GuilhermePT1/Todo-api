package com.todo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}