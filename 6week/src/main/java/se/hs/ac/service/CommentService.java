package se.hs.ac.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.hs.ac.dao.CommentDao;
import se.hs.ac.response.CommentResponse;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentDao commentDao;

    public CommentResponse getReservationUserComment(int commentCount) {
        return new CommentResponse(commentDao.selectReservationUserCommentCount(),
                commentCount,
                commentDao.selectReservationUserComment(commentCount));
    }
}
