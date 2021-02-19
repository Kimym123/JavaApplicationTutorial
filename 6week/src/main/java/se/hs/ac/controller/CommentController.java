package se.hs.ac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.hs.ac.response.CommentResponse;
import se.hs.ac.service.CommentService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/comment")
    public CommentResponse getReservationUserComment(@RequestParam(value = "commentCount", required = false, defaultValue = "5") int commentCount) {
        return commentService.getReservationUserComment(commentCount);
    }
}
