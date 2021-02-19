package se.hs.ac.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.ReservationUserComment;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static se.hs.ac.sql.DisplayInfoSql.COUNT_USER_COMMENTS;
import static se.hs.ac.sql.DisplayInfoSql.SELECT_USER_COMMENTS_LIMIT_FIVE;

@RequiredArgsConstructor
@Repository
public class CommentDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<ReservationUserComment> reservationUserCommentRowMapper = BeanPropertyRowMapper.newInstance(ReservationUserComment.class);

    public List<ReservationUserComment> selectReservationUserComment(int limit) {
        Map<String, ?> params = Collections.singletonMap("limit", limit);
        return jdbc.query(SELECT_USER_COMMENTS_LIMIT_FIVE, params, reservationUserCommentRowMapper);
    }

    public int selectReservationUserCommentCount() {
        return jdbc.queryForObject(COUNT_USER_COMMENTS, Collections.emptyMap(), int.class);
    }
}
