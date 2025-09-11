# Given stock prices over 7 days:
#    prices = [105, 110, 108, 112, 115, 116, 114].

#    - Compute the 3-day rolling average using slicing.
#    - Explanation:
#      - (105+110+108)/3 ≈ 107.67
#      - (110+108+112)/3 = 110.0
#      - ... and so on
def stocks():
    prices = [105, 110, 108, 112, 115, 116, 114]
    rolling_averages = []

    for i in range(3, len(prices)):
        current_average = (prices[i-2] + prices[i-1] + prices[i]) / 3
        rolling_averages.append(round(current_average, 3))

    print(rolling_averages)
stocks()