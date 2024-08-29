package com.college.recipes_collection.responses;

public record RoleResponseDTO(
    int id,
    String name
) {
    public RoleResponseDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
