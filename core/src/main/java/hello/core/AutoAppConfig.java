package hello.core;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;
@Configuration
@ComponentScan(
        basePackages = "hello.core",
        // basePackages를 설정하지 않으면
        // @ComponantScan이 붙은 설정 정보 클래스의 패키지가 시작위치
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig {

}