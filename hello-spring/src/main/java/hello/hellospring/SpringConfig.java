package hello.hellospring;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    // 이 방법은 생성자 주입 방법이다. setter주입, 필드 주입도 가능하지만 안 좋은 방법이다.
    // 컴포넌트 스캔 방식으로 주입하는 것이 더 편하지만, 구현 클래스를 수정해야 할 일이 있을때는
    // 자바 코드로 직접 스프링 빈을 등록하는 것이 좋다. (컴포넌트 스캔 방식이라면 더 많은 수정이 필요하다.)


    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
