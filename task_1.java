@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expectAdult = true;
    assertEquals("Пользователю менешье 18 лет", expectAdult, isAdult);    // Напиши код здесь
}