package se.hs.ac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.ReservationUserComments;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

import static se.hs.ac.util.SQL.COUNT_USER_COMMENTS;
import static se.hs.ac.util.SQL.SELECT_USER_COMMENTS;

@Repository
public class ReservationUserCommentsDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<ReservationUserComments> rowMapper = BeanPropertyRowMapper.newInstance(ReservationUserComments.class);

    public ReservationUserCommentsDao(DataSource dataSource){
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<ReservationUserComments> selectReservationUserComments(long displayInfoCount){
        return jdbc.query(SELECT_USER_COMMENTS + displayInfoCount, Collections.<String, Object>emptyMap(), rowMapper);
    }

    public long CountComment(){
        return jdbc.queryForObject(COUNT_USER_COMMENTS, Collections.<String, Object>emptyMap(), long.class);
    }


}
