def min_projects(N, P, Q, error_scores):
    """
    Calculates the minimum number of projects to make all error scores zero.
    """

    projects = 0
    while True:
        max_score = -1
        max_index = -1
        all_zero = True

        # Find the member with the highest error score
        for i, score in enumerate(error_scores):
            if score > 0:
                all_zero = False
                if score > max_score:
                    max_score = score
                    max_index = i

        if all_zero:
            break

        projects += 1
        error_scores[max_index] -= P
        if error_scores[max_index] < 0:
            error_scores[max_index] = 0

        # Reduce scores of other members
        for i in range(N):
            if i != max_index and error_scores[i] > 0:
                error_scores[i] -= Q
                if error_scores[i] < 0:
                    error_scores[i] = 0

    return projects

# Input Reading:
N, P, Q = map(int, input().split())
error_scores = list(map(int, input().split()))

# Calculate and Output:
result = min_projects(N, P, Q, error_scores)
print(result)
