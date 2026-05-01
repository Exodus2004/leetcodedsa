const maxRotateFunction = A => {
    let sum = 0, F = 0;
    const n = A.length;

    for (let i = 0; i < n; i++) {
        sum += A[i];
        F += i * A[i];
    }

    let max = F;

    for (let i = 1; i < n; i++) {
        F += sum - n * A.at(-i);
        max = Math.max(max, F);
    }

    return max;
};