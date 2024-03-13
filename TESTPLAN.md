# Test Plan for Balanced Brackets Function
## Test Case 1: Only Brackets Return True
- Description: Verify that the function returns true when only brackets are provided.
- Test Input: "[]"
- Expected Output: true
- Test Method:

  @Test
  public void onlyBracketsReturnsTrue() {
     assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
  }
## Nested Brackets Are Allowed
- Description: Verify that the function allows nested brackets and returns true.
- Test Input: "[[[]]]"
- Expected Output: true
- Test Method:

  @Test
    public void NestedBracketsAreAllowed(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

  ## Brackets Must Follow Open Close Order
- Description: Verify that the function returns false when brackets are not in the correct open-close order.
- Test Input: "]["
- Expected Output: false
- Test Method:

   @Test
    public void bracketsMustFollowOpenCloseOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
  ## Mix Of Brackets And Other Characters
- Description: Verify that the function handles scenarios where characters other than brackets are present.
- Test Input: "a[b]c"
- Expected Output: true
- Test Method:

  @Test
    public void mixOfBracketsAndOtherCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[b]c"));
    }

## Unbalanced Brackets
- Description: Verify that the function returns false when the number of opening and closing brackets is not equal.
- Test Input: "[["
- Expected Output: false
- Test Method:
  
  @Test
  public void unbalancedBrackets() {
   assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
}

