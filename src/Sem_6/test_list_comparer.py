import pytest
from listcomparer import ListComparer

def test_calculate_average_empty_list():
    # Тест для проверки расчета среднего значения пустого списка
    lc = ListComparer([], [1, 2, 3])
    assert lc.calculate_average([]) == 0

def test_calculate_average_non_empty_list():
    # Тест для проверки расчета среднего значения непустого списка
    lc = ListComparer([1, 2, 3], [4, 5, 6])
    assert lc.calculate_average([1, 2, 3]) == 2.0

def test_compare_lists_first_list_greater():
    # Тест для проверки, что первый список имеет большее среднее значение
    lc = ListComparer([4, 5, 6], [1, 2, 3])
    assert lc.compare_lists() == "Первый список имеет большее среднее значение"

def test_compare_lists_second_list_greater():
    # Тест для проверки, что второй список имеет большее среднее значение
    lc = ListComparer([1, 2, 3], [4, 5, 6])
    assert lc.compare_lists() == "Второй список имеет большее среднее значение"

def test_compare_lists_equal():
    # Тест для проверки, что средние значения равны
    lc = ListComparer([1, 2, 3], [1, 2, 3])
    assert lc.compare_lists() == "Средние значения равны"

if __name__ == '__main__':
    pytest.main()
