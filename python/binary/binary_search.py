'''
в переменной low и high храняться границы 
той части списка, в которой выполняется поиск
'''
def binary_search(list, item):
    low = 0
    high = len(list) - 1

    while low <= high:  #пока эта часть не сократиться до одного элемента
        #проверяем среднее значение
        mid = (low + high) // 2
        guess = list[mid]
        
        #значение найдено
        if guess == item:
            return mid
        
        #много
        if guess > item:
            high = mid - 1
        #мало    
        else:
            low = mid + 1
    return None

my_list = [1, 3, 5, 6, 7]
#получаем номер искомого элемента в спике (в данном случае 4)
print(binary_search(my_list,7)) 