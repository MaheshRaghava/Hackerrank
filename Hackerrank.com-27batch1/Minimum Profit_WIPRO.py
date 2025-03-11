def find_min_profits(itemsSold, noOfDays, profits):
  

  min_profits = []
  for day in range(noOfDays):
    min_profit = profits[0][day]  
    for item in range(1, itemsSold):
      if profits[item][day] < min_profit:
        min_profit = profits[item][day]
    min_profits.append(min_profit)
  return min_profits

itemsSold, noOfDays = map(int, input().split())

profits = []
for _ in range(itemsSold):
  profits.append(list(map(int, input().split())))

result = find_min_profits(itemsSold, noOfDays, profits)
print(*result)
