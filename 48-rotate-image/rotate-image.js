const rotate = mat => {
    let n = mat.length, k = n - 1;
    for (let i = 0; i < n >> 1; i++)
        for (let j = i; j < k - i; j++)
            [mat[i][j], mat[j][k - i], mat[k - i][k - j], mat[k - j][i]] =
                [mat[k - j][i], mat[i][j], mat[j][k - i], mat[k - i][k - j]]
}