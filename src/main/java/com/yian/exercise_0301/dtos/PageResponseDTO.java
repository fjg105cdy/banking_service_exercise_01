package com.yian.exercise_0301.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageResponseDTO {
    private List<UserResponseDTO> body;
    private Long totalElements;
    private int totalPages;
    private int pageNo;
    private int pageSize;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
}
