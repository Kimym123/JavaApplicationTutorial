package se.hs.ac.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import se.hs.ac.dto.ReservationUserComment;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class CommentResponse {
    private final int totalCount;
    private final int commentCount;
    private final List<ReservationUserComment> reservationUserComments;
}
