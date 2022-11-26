package by.nastya;

import by.nastya.Dollar;
import by.nastya.Money;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("by.nastya")
@PropertySource("classpath:money.properties")
public class SpringConfig {
    @Bean
    public Money dollars(@Value("${money.dollars}") double dollars){
        return new Money(dollars, new Dollar());
    }
    @Bean
    public Money euros(@Value("${money.euros}") double euros){
        return new Money(euros, new Euro());
    }
    @Bean
    public Money pesos(@Value("${money.pesos}") double pesos){
        return new Money(pesos, new Peso());
    }
    @Bean
    public Money rubles(@Value("${money.rubles}") double rubles){
        return new Money(rubles, new Ruble());
    }

    @Bean
    public List<Money> moneyList() {
        List<Money> list = new ArrayList<>();
        list.add(dollars(0.0));
        list.add(euros(0.0));
        list.add(pesos(0.0));
        list.add(rubles(0.0));
        return list;
    }
}

