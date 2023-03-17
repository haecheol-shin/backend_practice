package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class SpringConfigJava {
//
//    // 이 방법은 생성자 주입 방법이다. setter주입, 필드 주입도 가능하지만 안 좋은 방법이다.
//    // 컴포넌트 스캔 방식으로 주입하는 것이 더 편하지만, 구현 클래스를 수정해야 할 일이 있을때는
//    // 자바 코드로 직접 스프링 빈을 등록하는 것이 좋다. (컴포넌트 스캔 방식이라면 더 많은 수정이 필요하다.)
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//}
