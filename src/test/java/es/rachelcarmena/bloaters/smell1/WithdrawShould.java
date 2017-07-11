package es.rachelcarmena.bloaters.smell1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WithdrawShould {

    @Test
    public void keep_the_amount() {
    	Amount amount = Amount.anew(560d);
    	Withdraw withdraw = new Withdraw(amount);
    	
    	assertThat(withdraw.getAmount(), is(amount.getValue()));
    }
}
