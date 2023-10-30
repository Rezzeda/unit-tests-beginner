package Sem_3;

// HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%

public class Range {
    public boolean numberInInterval (int number){
        return (number < 100 && number > 25);
    }
}
