import numpy as np

# Create a 2x2 array
A = np.array([[1, 2], [3, 4]])

# Calculate the determinant
det = np.linalg.det(A)

print("Array:\n", A)
print("Determinant:", det)
