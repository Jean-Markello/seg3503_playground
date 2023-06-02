import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2020, 5, 3);
    assertEquals(new Date(2020, 5, 4), d.nextDate());
  }

  @Test
  void testDateOk1() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(0);
    assertEquals(new Date(1700, 6, 21), date.nextDate());
  }

  @Test
  void testDateOk2() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(1);
    assertEquals(new Date(2005, 4, 16), date.nextDate());
  }

  @Test
  void testDateOk3() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(2);
    assertEquals(new Date(1901, 7, 21), date.nextDate());
  }

  @Test
  void testDateOk4() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(3);
    assertEquals(new Date(3456, 3, 28), date.nextDate());
  }

  @Test
  void testDateOk5() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(4);
    assertEquals(new Date(1500, 2, 18), date.nextDate());
  }

  @Test
  void testDateOk6() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(5);
    assertEquals(new Date(1700, 6, 30), date.nextDate());
  }

  @Test
  void testDateOk7() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(6);
    assertEquals(new Date(1800, 11, 30), date.nextDate());
  }

  @Test
  void testDateOk8() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(7);
    assertEquals(new Date(3453, 1, 30), date.nextDate());
  }

  @Test
  void testDateOk9() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(8);
    assertEquals(new Date(444, 3, 1), date.nextDate());
  }

  @Test
  void testDateOk10() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(9);
    assertEquals(new Date(2005, 5, 1), date.nextDate());
  }

  @Test
  void testDateOk11() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(10);
    assertEquals(new Date(3453, 1, 31), date.nextDate());
  }

  @Test
  void testDateOk12() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(11);
    assertEquals(new Date(3456, 3, 31), date.nextDate());
  }

  @Test
  void testDateOk13() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(12);
    assertEquals(new Date(1901, 8, 1), date.nextDate());
  }

  @Test
  void testDateOk14() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(13);
    assertEquals(new Date(3453, 2, 1), date.nextDate());
  }

  @Test
  void testDateOk15() {
    DateNextDateOkTest dateOK = new DateNextDateOkTest();
    Date date = dateOK.testDateOk(14);
    assertEquals(new Date(3457, 1, 1), date.nextDate());
  }

  @Test
  void testDateEx1() {
    DateNextDateExceptionTest dateEx = new DateNextDateExceptionTest();
    Integer[] date1 = dateEx.testDateEx(0);
    assertThrows(IllegalArgumentException.class, () -> {
      new Date(date1[0], date1[1], date1[2]);
    });
  }

  @Test
  void testDateEx2() {
    DateNextDateExceptionTest dateEx = new DateNextDateExceptionTest();
    Integer[] date1 = dateEx.testDateEx(1);
    assertThrows(IllegalArgumentException.class, () -> {
      new Date(date1[0], date1[1], date1[2]);
    });
  }

  @Test
  void testDateEx3() {
    DateNextDateExceptionTest dateEx = new DateNextDateExceptionTest();
    Integer[] date1 = dateEx.testDateEx(2);
    assertThrows(IllegalArgumentException.class, () -> {
      new Date(date1[0], date1[1], date1[2]);
    });
  }

  @Test
  void testDateEx4() {
    DateNextDateExceptionTest dateEx = new DateNextDateExceptionTest();
    Integer[] date1 = dateEx.testDateEx(3);
    assertThrows(IllegalArgumentException.class, () -> {
      new Date(date1[0], date1[1], date1[2]);
    });
  }

  @Test
  void testDateEx5() {
    DateNextDateExceptionTest dateEx = new DateNextDateExceptionTest();
    Integer[] date1 = dateEx.testDateEx(4);
    assertThrows(IllegalArgumentException.class, () -> {
      new Date(date1[0], date1[1], date1[2]);
    });
  }

}