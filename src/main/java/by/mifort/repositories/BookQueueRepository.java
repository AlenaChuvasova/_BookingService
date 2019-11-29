package by.mifort.repositories;

import by.mifort.entity.BookQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface BookQueueRepository extends JpaRepository<BookQueue, Integer> {

    @Modifying
    @Transactional
    @Query(value = "insert into BookQueue(id, bookId, userId, queue, createdAt)"
            + "values (:id, :bookId, :userId, :queue, :createdAt)",
            nativeQuery = true)
    void addUser(
            @Param(value = "id") Integer id,
            @Param(value = "bookId") Integer bookId,
            @Param(value = "userId") Integer userId,
            @Param(value = "queue") Integer queue,
            @Param(value = "createdAt") String createdAt);
}
