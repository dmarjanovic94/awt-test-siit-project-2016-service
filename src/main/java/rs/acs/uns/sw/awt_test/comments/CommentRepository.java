package rs.acs.uns.sw.awt_test.comments;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Comment entity.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
