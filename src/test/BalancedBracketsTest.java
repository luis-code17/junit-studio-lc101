package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void NestedBracketsAreAllowed(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsMustFollowOpenCloseOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void mixOfBracketsAndOtherCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[b]c"));
    }
    @Test
    public void unbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }


}
