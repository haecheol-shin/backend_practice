package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL: select m from Member m where m.name = ?
    // findByName 이외의 메소드들은 이미 구현이 되어있다.
    // findByName도 메소드 이름만 적어놓으면 구현은 spring data jpa가 알아서 한다.
    // 결국, 타입, 메소드 이름, 매개변수 같은 것만 잘 정하면 (인터페이스만 있으면) 알아서 다 된다.
    @Override
    Optional<Member> findByName(String name);
}
