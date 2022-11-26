package by.nastya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Wallet {
    @Autowired
    private List<Money> allMoney;

    public void showBalance(){
        for (Money money : allMoney){
            System.out.printf("Amount: %f; Currency: %s\n",money.getAmountOfMoney(),money.getCurrency().getCurrencyName());
        }

    }
}
