checkDivisibility = (n, N = [...`${n}`]
    .map(Number)) => !(n % (N
        .reduce((a, c) => a + c, 0) + N
            .reduce((a, c) => a * c, 1)))
            