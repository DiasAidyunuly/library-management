package kz.iitu.libraryjpa.librarymanagement.Repository;

import kz.iitu.libraryjpa.librarymanagement.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository <Member, Long> {
    List<Member> findByNameEquals(String name);
}
