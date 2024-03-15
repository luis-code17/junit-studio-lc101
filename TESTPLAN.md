# Test Plan for Balanced Brackets Function
## Only Brackets Return True
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
- Test Input: "[[]]"
- Expected Output: true
- Test Method:

  @Test
    public void NestedBracketsAreAllowed(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
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
   assertFalse(BalancedBrackets.hasBalancedBrackets("["));
}

## Unbalanced Brackets
- Description: Verify that the function returns false when the number of opening and closing brackets is not equal.
- Test Input: "]]"
- Expected Output: false
- Test Method:
  
  @Test
  public void unbalancedBrackets2() {
   assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
}

## Empty Brackets
- Description: Verify that the function returns true when an empty string is passed.
- Test Input: " "
- Expected Output: true
- Test Method:

     @Test
    public void emptyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

## Single Bracket Open
- Description: Verify that the function returns false when only one bracket is provided.
- Test Input: "["
- Expected Output: false
- Test Method:

  @Test
    public void singleBracketsOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

 ## Single Bracket Close
- Description: Verify that the function returns false when only one bracket is provided.
- Test Input: "]"
- Expected Output: false
- Test Method: 

  @Test
    public void singleBracketsClosed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

## Unbalanced Brackets - Missing Closing 
- Description: Verify that the function returns false when there are more opening brackets than closing brackets.
- Test Input: "[[]"
- Expected Output: false
- Test Method:

  @Test
    public void unbalancedBracketsMissingClosing(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

##  Unbalanced Brackets - Missing Opening
- Description: Verify that the function returns false when there are more closing brackets than opening brackets.
- Test Input: "[]]"
- Expected Output: false
- Test Method:

  @Test
    public void unbalancedBracketsMissingOpening(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

##  Unbalanced Brackets - Multiple Openings and One Closing
- Description: Verify that the function returns false when there are more opening brackets than closing brackets.
- Test Input: "[[]["
- Test Input: "[[]["
- Expected Output: false
- Test Method:

  @Test
    public void unbalancedBracketsMultipleOpenings(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]["));
    }