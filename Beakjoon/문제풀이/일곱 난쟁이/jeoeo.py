heights = []
for _ in range(9):
    heights.append(int(input()))

total_sum = sum(heights)
false_sum = total_sum - 100

dwaf = False
for i in range(9):
    for j in range(i + 1, 9):
        if heights[i] + heights[j] == false_sum:
            # 가짜 난쟁이 제거
            height1, height2 = heights[i], heights[j]
            heights.remove(height1)
            heights.remove(height2)
            dwaf = True
            break
    if dwaf:
        break

heights.sort()
for height in heights:
    print(height)
