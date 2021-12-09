# Buildwater

The program is to calculate the amount of water that is trapped in an array

Each element in an array is considered as the height of a building and all the buildings are stacked together.

The approach used for the program is creating 2 arrays which are maxL(maximum element from the left side of the selected element) and maxR(maximum element from the right side of the selected element)

To get the rain water trapped we take the minimum of the maxL and maxR of a particular index and subtract the size of the selected element.
