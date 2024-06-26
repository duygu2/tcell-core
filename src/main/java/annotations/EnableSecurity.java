package annotations;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //çalışma zamınıda devreye girsin ve bağımlılıkları eklesin diye
@ComponentScan(basePackages ={"com.turkcell.core.security"})
public @interface EnableSecurity {
}
