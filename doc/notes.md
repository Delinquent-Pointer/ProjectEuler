    System.out.println(projectEuler.isPalindrome(9009));
    System.out.println(projectEuler.isPalindrome(123));
    System.out.println(projectEuler.isPalindrome(303));

## Class Notes: 
* //  @Test
  public void testInformation(){
  //    assertTrue();
  //    assertFalse();
  //    assertEquals();
  //    assertSame();
  //    assertNotSame();
  //    assertNull();
  //    assertNotNull();
  //    fail("message here");
  // Timeout should be in every time for infinite loop
  // could try size of the objects too

  }

  /**
    * Class notes 2
      */
      /*
      @Test
      public void TestDateMonthYear(){
      int year = 2024;
      int month = 12;
      int day = 32; // depends on month check what month then days associate aka leap year too
      assertFalse("Invalid year: Year cannot be less than zero", year < 0);
      assertFalse("Invalid month: month cannot be less than 1 or bigger than 12", month < 0 || month > 12);
      assertFalse("Invalid month: day cannot be less than 1 or bigger than 12", day < 0 || day > 31);
      }